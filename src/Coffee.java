import java.util.Scanner;

public class Coffee extends CaffeineBeverage{
    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk..");
    }

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter..");
    }

    @Override
    boolean customerWantsCondiments() {
        System.out.println("Would you like to add milk and sugar? ");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }
        return false;
    }
}
