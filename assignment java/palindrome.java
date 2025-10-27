
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int n= sc.nextInt();
        int rev=0,d=0,x;
        x=n;
        while(x>0){
            d=x%10;
            rev=rev*10+d;
            x/=10;
        }
        if(rev==n){
            System.out.println("yes it is palindrome");
        }
        else{
            System.out.println("NO it is not palindrome");
        }
        
    }

    
}
