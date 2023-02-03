package anonim;

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        new SuperClassOrInterfaceName() {
            // fields
            // overridden methods
        };
        */

        /*Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input);*/

        // System.out.println(new java.util.Scanner(System.in).nextInt());

        SpeakingEntity person = new SpeakingEntity() {
            @Override
            public void sayHello() {
                System.out.println("Hello!");
            }

            @Override
            public void sayBye() {
                System.out.println("Bye!");
            }
        };
        person.sayHello();
        person.sayBye();

    }
}