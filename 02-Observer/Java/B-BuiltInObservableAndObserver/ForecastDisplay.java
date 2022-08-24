import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement{
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable){
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg){
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    public void display(){
        String status = "same";
        if(lastPressure < currentPressure){
            status = "increasing";
        }else if(lastPressure > currentPressure){
            status = "decreasing";
        }
        System.out.println("Forecast: " + status + " pressure" +
                           " (" + lastPressure + " -> " + currentPressure + ")");
    }
}