import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();int c=0;int d=0;
        
        while(n>0){
             d=n%10;
            c++;
            n/=10;

        }
        System.out.print(c);
    }
    
}
