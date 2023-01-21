public class DinerMenuIterator implements Iterator{
    int position =0;
    MenuItem[] items;

    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }


    @Override
    public boolean hasNext() {
        if(position >= items.length-1 || items[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem= items[position];
        position = position+1;
        return menuItem;
    }
}
