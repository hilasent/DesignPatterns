public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + "");
            System.out.println(menuItem.getPrice() + "");
            System.out.println(menuItem.getDesc());
        }
    }

    public void printMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU");
        System.out.println("Breakfast");
        System.out.println("--------------------");
        printMenu(pancakeIterator);
        System.out.println("Lunch");
        System.out.println("--------------------");
        printMenu(dinerIterator);

    }
}
