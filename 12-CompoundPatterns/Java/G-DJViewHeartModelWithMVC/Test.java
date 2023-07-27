public class Test {
    
    public static void main(String[] args) {
        HeartModelInterface heartModel = new HeartModel();
        ControllerInterface controller = new HeartController(heartModel);
    }
}