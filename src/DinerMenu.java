import java.util.ArrayList;

public class DinerMenu extends MenuItem{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0; // counter
    MenuItem[] menuItems;


    public void addItem(String name, String desc, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name,desc,vegetarian,price);
        if(numberOfItems > MAX_ITEMS){
            System.out.println("Sorry menu is full. Can not add items here");
        }
        else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }


    }

   public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);

   }

    public DinerMenu(){
        menuItems= new MenuItem[MAX_ITEMS];
        addItem("Vegetarian egg","egg in Diner House", true, 2.00 );
        addItem("Cheese", "cheese in Diner House", true, 2.50);
        addItem("Olive", "olive in Diner House", false, 4.00);
        addItem("Bread", "bread in Diner House", false,8.00);

    }
}
