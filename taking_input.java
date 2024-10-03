import java.util.Scanner;
class taking_input {
    public static void main(String args[]) {
        System.out.println("Taking Input From  the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of two numbers is: "+sum);
    //  System.out.println(sum);
    }
    }
