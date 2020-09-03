package bot;
import java.util.Scanner;

public class App{
    
    public static void main(String[] args){
        System.out.println("Hello! My name is Sophia.");
        System.out.println("I was created in 2020.");
        
        System.out.println("Please, remind me your name.");
        Scanner parse =  new Scanner(System.in);
        String name = parse.next();
        System.out.printf("What a great name you have, %s\n", name);
        
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

        System.out.println("Now, I will prove to you that I can count to any number you want.");
        int number = parse.nextInt();
        for (int i = 0; i <= number; i++){
            System.out.println(i + "!");
        }
        System.out.println("Completed, have nice day!");
        
    }
}
