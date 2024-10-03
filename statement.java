import java.util.Scanner;
public class statement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        if (age>90){
            System.out.println("You are an old man");
        }
        else if(age>70){
            System.out.println("You are less old man");
        }

        else if(age>18){
            System.out.println("You are a young man");
        }
        else{
            System.out.println("Error");
        }


        switch(age){
            case 90:
                System.out.println("i am too oolder");
                break;
        
            case 70:
                System.out.println("i am old");
                break;

             case 18:
                System.out.println("i am young");
                break;
        }
    
        }
}
        
    

