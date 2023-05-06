import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList items;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        }else{
            return true;
        }
    }

    public Object next() {
        MenuItem menuItem = (MenuItem)items.get(position);
        position += 1;
        return menuItem;
    }
}