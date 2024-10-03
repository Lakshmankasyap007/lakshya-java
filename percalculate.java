import java.util.Scanner;

public class percalculate {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five subject marks:");

        System.out.println("Enter main marks :");
        float mm = sc.nextFloat();
        
        System.out.println("Enter sub1 marks:");
        float sub1 = sc.nextFloat();
        
        System.out.println("Enter sub2 marks:");
        float sub2 = sc.nextFloat();
        
        System.out.println("Enter sub3 marks:");
        float sub3 = sc.nextFloat();
        
        System.out.println("Enter sub4 marks:");
        float sub4 = sc.nextFloat();
        
        System.out.println("Enter sub5 marks:");
        float sub5 = sc.nextFloat();
        
       
        
        float sum = sub1 + sub2 + sub3 + sub4 + sub5;
        float per = sum / 5;
        
        System.out.println("The percentage is: " + per);
    }
}

