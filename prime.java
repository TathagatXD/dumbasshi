import java.util.Scanner;
public class prime {
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur number");
        int n = sc.nextInt();
        if(n ==  0 || n == 1){System.out.println("Given number is neither prime nor Composite"); return;} 
        if(n == 2){ System.out.println("Given number is prime");  return; }
       for(int i = 2; i < n; i++)
        if(n%i == 0){ 
            System.out.println("Given number is not prime");
         break;
       } else { 
        System.out.println("Given number is prime"); break;
       }
    }
    
}
