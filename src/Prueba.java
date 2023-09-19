//public class Prueba {
//public static void main (String[] args) {
//    System.out.println("Hola Mundoooo");
//}
//}


import java.util.Random;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String play =  "yes";
        //Determinando si se comienza el juego de nuevo
        while(play.equals("yes"))
        {
            //Generando a Random number entre 0 y 100
            Random rand = new Random();
            int targetNumber = rand.nextInt(99);
            int guess = -1;
            int tries = 0;

            //Determinando si el juego termino cuando se encuetre la respuesta correcta
            while (guess != targetNumber)
            {
                System.out.print("Adivina un número del 1 al 100: ");
                guess = reader.nextInt();
                tries++;

                if (guess == targetNumber)
                {
                    System.out.println("Felicitaciones!! Adivinaste el número.");
                    System.out.println("Total de intentos : " + tries);
                    System.out.println("Quieres comenzar otro juego? Yes or No: ");
                    play = reader.next().toLowerCase();
                } else if (guess > targetNumber) {
                    System.out.println("Tu número es muy alto, intentalo de nuevo.");
                } else {
                    System.out.println("Tu número es muy bajo, intentalo de nuevo.");
                }
            }
        }
        reader.close();
    }
}


