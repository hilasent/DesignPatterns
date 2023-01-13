import java.util.Scanner;

public class Tea extends CaffeineBeverage{
    @Override
    boolean customerWantsCondiments() {
        System.out.println("Would you like to add lemon? ");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }
        return false;
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon..");

    }

    @Override
    void brew() {
        System.out.println("Stepping tea...");

    }
}
