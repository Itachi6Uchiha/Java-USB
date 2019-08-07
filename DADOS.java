package dados;

import java.util.Random;

public class Dados {

    public static void main(String[] args) {

        
        Random alea = new Random();
        
            System.out.println("Gane");
        int dato1 = alea.nextInt(6) + 1;
            System.out.println("el numero generado es; " + dato1);
            int dato2 = alea.nextInt(6) + 1;
            System.out.println("el numero generado es; " + dato2);
            if (dato1 == dato2) {
                System.out.println("Usted saco par");

            } else {
                System.out.println("Usted no saco par");
            }

        }
    }

}
