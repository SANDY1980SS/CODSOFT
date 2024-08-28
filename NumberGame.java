import java.util.Scanner;
public class NumberGame {
    public  int generateNum(){
        int min=1,max=100;
        int n = (int)(Math.random()*(max-min))+min;
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberGame ob = new NumberGame();
        int n = ob.generateNum();
        int count=0;
        int ch=1;
        while(ch!=0){
        System.out.print("Enter guess number b/w 1 and 100: ");
        int g = sc.nextInt();
        if(g>n){
        count++;
        System.out.println("The guess number is greater then actual number");
        }
        else if(g<n){
            count++;
            System.out.println("The guess number is smaller then actual number");
        }
        else if(g==n){
            count++;
            System.out.println("Congratulation!! The number you guess is right..." + n);
        }
        else{
            System.out.println("Invalid number please restart the game");
            break;
        }
        System.out.print("Press 1 to Continue and guess again otherwise Press 0 to End: ");
         ch = sc.nextInt();
    }
    System.out.println("No. of attempts: "+ count);
    }
}