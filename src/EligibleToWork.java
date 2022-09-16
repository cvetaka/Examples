import java.util.Scanner;

public class EligibleToWork {
    public static void main(String[] args){
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = scan.nextInt();
        if (age>=16)
        System.out.println("You are eligible to work");
        else
            System.out.println("You are not eligible to work.");
    }

}
