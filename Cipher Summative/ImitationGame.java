import java.util.Scanner;
public class ImitationGame
{
    public static void main(String[] args)
    {
       boolean KeepGoing = true;
       while(KeepGoing == true)
       {
       System.out.println("Welcome to the encryption/decryption program \n" +
       "Would you like to Encrypt (1), Decrypt (2) or do nothing (3)");
       Scanner sc = new Scanner(System.in);
       int i = sc.nextInt();
       if(i==1)
       {
           cipher msg = new cipher();
           Scanner sc2 = new Scanner(System.in);
           System.out.println("Please enter a phrase, only letters");
           String message = sc2.next();
           System.out.println(msg.encrypt(message));
        }
       if(i==2)
       {
           Decipher code = new Decipher();
           Scanner sc2 = new Scanner(System.in);
           System.out.println("Please enter your encrypted string");
           String message = sc2.next();
           System.out.println(code.decrypt(message));
       }
       if(i==3)
       {
           System.out.println("Thanks you for trying the program");
           break;
        }
       System.out.println("Do you want to continue? (True/False) ");
       KeepGoing = sc.nextBoolean(); 

           
    }
    System.out.println("Thanks for trying the program");

    }
}
