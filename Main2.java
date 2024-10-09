package Task2;
import java.util.ArrayList;

public class Main2 {
    public static void main(String [] args){
        Cafe cafe = new Cafe();
        cafe.loadMenuData();
        ArrayList<String> coffeeMenu = cafe.getCoffeeMenu();
        for(int i = 0; i < coffeeMenu.size(); i++){
            System.out.println(coffeeMenu.get(i));
        }


    }
}
