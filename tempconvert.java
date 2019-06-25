/* converts F to C and C to F.
* 
* @author (Francis) 

*/
import java.util.Scanner;
public class tempconvert
{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        boolean Reset = false;// if this boolean becomes true then the system would stop
        //1=fahrenheit 2=celsius
        while(Reset == false){ // while loop for making the program continously run
            System.out.println("Please enter a temperature: ");  //used for temperature input
            double temperature = scan.nextDouble();
            System.out.println("Enter 1 for F to C, 2 for C to F"); // used for conversion input
            int ans = scan.nextInt();
                if(ans == 1){ // conversion for F to C
                    System.out.println((temperature - 32.0) * 5.0/9.0);
                }
                else{ // conversion for C to F
                    System.out.println((9.0/5.0 * temperature) + 32.0);
                }
                System.out.println("Enter 3 to convert another temperature, enter 4 to stop");// option to continue the game or end the game
                ans = scan.nextInt();
                if(ans == 3){ // continue the game 
                    Reset = false;
                }
                else{ // stop the game
                    Reset = true;
                }
            
        }
     }   
}