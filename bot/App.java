package bot;
import java.util.Scanner;

/**
 * Simple bot con Java
 */
public class App{

    private Scanner parse =  new Scanner(System.in); //Como se va ocupar en toda la aplicacion es mejor que la haga global para capturar los datos.
    
    /*
     * Clase donde se iniciara la aplicacion
     * Encapsularemos las tareas con funciones.
     */
    public static void main(String[] args){
        App bot = new App();
        bot.greet("Sophia", "2020");
        bot.remindName();
        bot.guessAge();
        bot.count();
        bot.test();
        System.out.println("Completed, have nice day!");
    }

    /*
     * Da la bienvenida al usario.
     * @param assistantName - Nombre del bot. 
     * @param birthYear - anio de su creacion.
     */
    public void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName +  ".");
        System.out.println("I was created in " + birthYear + ".");

    }
    
    /**
     * Methodo que pide el nombre del usuario.
     * Se utliza la entrada estandar
     */
    public void remindName() {
        System.out.println("Please, remind me your name.");
        String name = parse.next();
        System.out.printf("What a great name you have, %s\n", name);
    }

    /**
     * Methodo que adivina la edad mediante un metodo matematico
     */
    public void guessAge() {
        System.out.println("Let me guees your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainders3 = parse.nextInt();
        int remainders5 = parse.nextInt();
        int remainders7 = parse.nextInt();
        /*
         * It turns out that for each number ranging from 0 to 104 the calculation will result in the number itself. This perfectly fits the ordinary age range, doesn't it? Ask a user for the remainders and use them to guess the age!
         */
        int age = (remainders3 * 70 + remainders5 * 21 + remainders7 * 15) % 105;
        System.out.println("Your age is " + age + " ;that's a good time to start programming");

    }
    /**
     * Imprimime un sucesion pedida por el usuario.
     */
    public void count() {
        System.out.println("Now, I will prove to you that I can count to any number you want.");
        int number = parse.nextInt();
        for (int i = 0; i <= number; i++){
            System.out.println(i + "!");
        }

    }

    /**
     * Hace un test de pregunar y se rompe hasta que responda bien. 
     */
    public void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        int answer = parse.nextInt();
        while(answer != 2) {
            System.out.println("Plase, try again");
            answer = parse.nextInt();
        }

    }
}
