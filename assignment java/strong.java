import java.util.Scanner;

public class strong {
    public static int fact(int n){
         int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int n= sc.nextInt();int d;int x;int sum=0;
        x=n;
        while(n>0){
            d=n%10;
            sum+=fact(d);
            n/=10;
            
        }
        if(sum==x){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
}
}
