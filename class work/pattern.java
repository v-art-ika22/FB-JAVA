
import java.util.Scanner;
public class pattern {

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for(int i=0;i<n/2;i++){
            System.out.print("*"+" ");
            for(int j=0;j<n+2;j++){
                System.out.print(" "+" ");
            }
            for(int m=0;m<i+1;m++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=0;i<1;i++){
            for(int j=0;j<n+3;j++){
                System.out.print("*"+" ");
            }
            for(int k=0;k<n/2+1;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n/2;i>0;i--){
            System.out.print("*"+" ");
            for(int j=0;j<n+2;j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<i+1;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
   
        
        
        
          
            
            /*for(int j=0;j<n;j++){
                if(j!=(n/2)){
                    System.out.print("*");
                }
            
            System.out.println();
            }*/
           
            
            

            
        
    
    

    

