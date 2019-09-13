import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> newList = new ArrayList<>();

        for (int i = 1; i < 26; i++) {

            Random r = new Random();
        String[] rice = {"white rice, ", "brown rice, ", "no rice, "};
        String[] meat = {"chicken meat, ", "steak meat, ", "carnidas meat, ", "chorizo meat, ", "sofritas meat, ", "veggies, "};
        String[] beans = {"pinto beans, ", "black beans, ", "no beans, "};
        String[] salsa = {"mild salsa, ", "medium salsa, ", "hot salsa, ", "no salsa, "};
        String[] veggies = {"lettuce, ", "fajitas, ", "veggies, ", "no veggies, "};
        String[] cheese = {"yes cheese,  ", "no cheese,  "};
        String[] guac = {"yes guac,  ", "no guac,  "};
        String[] queso = {"yes queso,  ", "no queso,  "};
        String[] sourcream = {"yes sourcream,  ", "no sourcream,  "};

            int a = r.nextInt(rice.length);
            int b = r.nextInt(meat.length);
            int c = r.nextInt(beans.length);
            int d = r.nextInt(salsa.length);
            int e = r.nextInt(veggies.length);
            int f = r.nextInt(cheese.length);
            int g = r.nextInt(guac.length);
            int h = r.nextInt(queso.length);
            int j = r.nextInt(sourcream.length);





            newList.add(rice[a]);
            newList.add(meat[b]);
            newList.add(beans[c]);
            newList.add(salsa[d]);
            newList.add(veggies[e]);
            newList.add(cheese[f]);
            newList.add(guac[g]);
            newList.add(queso[h]);
            newList.add(sourcream[j]);

            Main obj = new Main();

            int numberOfElements= 5 + r.nextInt(9);

            System.out.println("burrito" + i + ": ");

//            System.out.println(Main.getrandomElement(newList,numberOfElements));











        }




    }
}
