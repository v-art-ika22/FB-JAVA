import java.util.Scanner;
public class sumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();int s=0;int d=0;
        
        while(n>0){
             d=n%10;
          
            s+=d;
            n/=10;

        }
        System.out.println(s);
    
}
}
