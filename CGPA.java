import java.util.Scanner;
public class CGPA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sub1 marks :");
        float sub1 = sc.nextFloat();
        System.out.println("Enter sub2 marks :");
        float sub2 = sc.nextFloat();
        System.out.println("Enter sub3 marks :");
        float sub3 = sc.nextFloat();
        float sum = sub1+sub2+sub3;
        float CGPA = sum/30f;
        System.out.println("the CGPA will be :"+CGPA);
}
}