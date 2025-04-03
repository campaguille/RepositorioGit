import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String frase = "Guillermo 18 1,70";

        Scanner sc = new Scanner(frase);

        String name = sc.next();
        int age = sc.nextInt();
        double stature = sc.nextDouble();

        System.out.println("Nombre: " + name + "\nEdad: " + age + "\nEstatura: " + stature);

    }
}
