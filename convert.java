import java.util.Scanner;
public class convert{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in km :");
        double km = sc.nextDouble();
        double mile = (km*0.62);
        System.out.println("Distance in mile is : "+mile);
    
        
    }
}
