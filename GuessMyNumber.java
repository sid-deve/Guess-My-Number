import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        // Mini Project
        Scanner SC = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
        
        do{
            System.out.println("Guess My Number : ");
        userNumber = SC.nextInt();
        if(userNumber ==  myNumber) {
            System.out.println("WAOH.. CORRECT NUMBER!!");
            break;
        }
        else if(userNumber > myNumber) {
            System.out.println("You Number is too large");
        } 
        else {
            System.out.println("Your Number is too small");
        }
    } while(userNumber>= 0 );
    System.out.println("My Number was : ");
    System.out.println(myNumber); 
    }
}