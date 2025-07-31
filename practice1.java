import java.util.Scanner;
public class practice1 {

    public static void sum(int a, int b){
    int s = a + b;
    System.out.println(s);
        
}
public static void stringLength(String a){
    int length = a.length();
    System.out.println("Length of the string is " + length);
}
public static void square(int n){
    System.out.println("Square of thr given number is : " + n * n);
}
 public static void primeCheck(int n){
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
        public static void reverseDigits(int n){
        int r;
        while(n > 0 ){
            r = n%10;
            System.out.print(s);
           n = n/10;
        }
      
    }
    public static void sumOfDigits(int n){
      int r;
      int s = 0;
      while(n > 0){
        r = n%10;
        s = s+r;
        n = n/10;
      }
      System.out.println(s);

    }
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   /*   System.out.println("Enter first number");
     int n = sc.nextInt();
     System.out.println("Enter second number");
     int n1 = sc.nextInt();

     sum(n, n1);
   */
 /*  System.out.println("Enter your word");
  String q = sc.nextLine();
  stringLength(q);
 */
  /*  System.out.println("type the number you want square of");
   int n2 = sc.nextInt();
   square(n2);
 */
/* System.out.println("Enter ur number ");
int n3 = sc.nextInt();
primeCheck(n3);
*/ 
/* System.out.println("Enter ur Number");
     int n4 = sc.nextInt();
    reverseDigits(n);  
*/

System.out.println("Enter ur Number");
     int n5 = sc.nextInt();
     sumOfDigits(n5);
 }
}