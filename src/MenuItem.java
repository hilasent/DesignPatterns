public class MenuItem {
    String name;
    String desc;
    boolean vegetarian;
    double price;

    public MenuItem() {

    }

    public MenuItem(String newName, String newDesc, boolean newVegetarian, double newPrice) {
        this.name = newName;
        this.desc = newDesc;
        this.vegetarian = newVegetarian;
        this.price = newPrice;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public boolean getVegetarian() {
        return this.vegetarian;
    }

    public double getPrice() {
        return this.price;

    }



}
