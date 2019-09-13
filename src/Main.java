import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> newList = new ArrayList<>();


        String[] rice = {"white rice, ", "brown rice, ", "no rice, "};
        String[] meat = {"chicken meat, ", "steak meat, ", "carnidas meat, ", "chorizo meat, ", "sofritas meat, ", "veggies, "};
        String[] beans = {"pinto beans, ", "black beans, ", "no beans, "};
        String[] salsa = {"mild salsa, ", "medium salsa, ", "hot salsa, ", "no salsa, "};
        String[] veggies = {"lettuce, ", "fajitas, ", "veggies, ", "no veggies, "};

        Random r = new Random();

        for (int i = 1; i < 11; i++) {

            String burrito = ("Burrito " + i + ": "
                    + rice[r.nextInt(rice.length)]
                    + meat[r.nextInt(meat.length)]
                    + beans[r.nextInt(beans.length)]
                    + salsa[r.nextInt(salsa.length)]
                    + veggies[r.nextInt(veggies.length)]);

            newList.add(burrito);

            System.out.println(burrito);


        }
    }
}
