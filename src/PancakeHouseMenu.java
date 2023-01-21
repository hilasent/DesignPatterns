import java.util.ArrayList;

public class PancakeHouseMenu extends MenuItem {
    ArrayList menuItems;

    public void addItem(String name, String desc, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public PancakeHouseMenu(){
        menuItems = new ArrayList();
        addItem("Simple Pancake Breakfast","pancakes with scrumled eggs", true, 2.00 );
        addItem("Regular Pancake Breakfast ", "pancake with fried eggs, sausage", true, 2.50);
        addItem("Pancakes with made fresh strawberries", "Regular pancake with strawberry, sausage", false, 4.00);
        addItem("Waffles", "pancake with some chocolate, fruits", false,8.00);

    }
}
