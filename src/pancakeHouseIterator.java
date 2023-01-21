import java.util.ArrayList;

public class pancakeHouseIterator implements Iterator{
    int position =0;
    ArrayList items;

    public pancakeHouseIterator(ArrayList items){
        this.items =items;
    }


    @Override
    public boolean hasNext() {
        if(position > items.size()-1 || items.get(position) == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) items.get(position);
        position++;
        return menuItem;

    }
}
