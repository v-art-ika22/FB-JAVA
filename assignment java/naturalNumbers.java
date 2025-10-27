import java.util.Scanner;

public class naturalNumbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");int sum=0;
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            sum+=i;

        }
        System.out.println(sum);
    }
    
}
