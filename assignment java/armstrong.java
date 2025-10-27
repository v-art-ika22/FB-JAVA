import java.util.Scanner;

public class armstrong {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int n= sc.nextInt();int d=0;int sum=0;int x;
        x=n;
        while(n>0){
            d=n%10;
            sum+=Math.pow(d,3);
            n/=10;
        }
        if(x==sum){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    
}
}
