import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> burritosList = new ArrayList<>();


        String[] rice = {"white rice, ", "brown rice, ", "no rice, "};
        String[] meat = {"chicken meat, ", "steak meat, ", "carnidas meat, ", "chorizo meat, ", "sofritas meat, ", "veggies, "};
        String[] beans = {"pinto beans, ", "black beans, ", "no beans, "};
        String[] salsa = {"mild salsa, ", "medium salsa, ", "hot salsa, ", "no salsa, "};
        String[] veggies = {"lettuce, ", "fajitas, ", "veggies, ", "no veggies, "};
        String[] cheese = {"yes cheese,  ", "no cheese,  "};
        String[] guac = {"yes guac,  ", "no guac,  "};
        String[] queso = {"yes queso,  ", "no queso,  "};
        String[] sourcream = {"yes sourcream,  ", "no sourcream,  "};

        Random r = new Random();

        ArrayList<String[]> foodsList = new ArrayList<>(Arrays.asList(rice, meat, beans, salsa, veggies, cheese, guac, queso, sourcream));
//        this loop creates 25 burritos
        for (int x=1; x <= 25; x++) {

            String burrito = "Burrito" + x + ": ";

            double thisBurritosIngredients = ThreadLocalRandom.current().nextInt(5, 10);
            // this loops through each foods list in the foodslist arraylist and gets the size and food
            for (int i = 0; i < thisBurritosIngredients; i++) {
//              creates a random int for the length of the array inside foodlist
                int randomFoodInt = r.nextInt(foodsList.get(i).length);
//              takes random int and gets a food
                String food = foodsList.get(i)[randomFoodInt];
//                      takes current burrito string and adds food to it
                burrito = burrito + food;
            }
//           adds price to burrito
            burrito = burrito + "\n$" + thisBurritosIngredients * .5 + "0";

            burritosList.add(burrito);
        }


                burritosList.forEach(i -> System.out.println(i));


            }
        }







