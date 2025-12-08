package numbers;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        write your code here
        Scanner sc = new Scanner(System.in);
        long n= 10L;

        System.out.println("Welcome to Amazing Numbers!");
        System.out.println();
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter 0 to exit.");
        System.out.println();
      do{
          boolean isEven= false;
          boolean isOdd= false;
          boolean isBuzz = false;
          boolean isDuck = false;
          boolean isPalindrome = false;
          System.out.print("Enter a request: ");
          n = sc.nextLong();
          System.out.println();
          if (n>=1 ){
              System.out.printf("Properties of %d",n);
              System.out.println();
              if(n%2==0){

                  System.out.println();
                  isEven=true;
                  System.out.printf("        even: %b",isEven);
                  System.out.println();
                  System.out.printf("        odd: %b",isOdd);
                  System.out.println();
              }else{
                  isOdd=true;
                  System.out.printf("        even: %b",isEven);
                  System.out.println();
                  System.out.printf("         odd: %b",isOdd);
                  System.out.println();
              }
              if((n%7==0)||(n%10==7)){
                  isBuzz =true;
              }
              System.out.printf("        buzz: %b",isBuzz);
              System.out.println();
              isDuck = containsZero(n);
              System.out.printf("        duck: %b", isDuck);
              System.out.println();
              String newValue = reverseString(n);
              isPalindrome = isPalindromic(n, newValue);
              System.out.printf(" palindromic: %b", isPalindrome);
              System.out.println();
              System.out.println();

          } else if (n==0) {
              System.out.println("Goodbye!");
              break;
          } else{
              System.out.println("The first parameter should be a natural number or zero.");
          }

      }while (n!=0);
    }
    public static boolean containsZero(long n){
        boolean isDuck = false;
        String value = String.valueOf(n);
        String [] arrValue = value.split("");
        for (String s : arrValue) {
            if (s.equals("0")) {
                isDuck = true;
                break;
            }
        }

        return isDuck;
    }
    public static String reverseString(long n){
        String value = String.valueOf(n);
        StringBuilder sb = new StringBuilder(value);
        sb.reverse();
        return sb.toString();
    }
    public static boolean isPalindromic(long n,String newValue){
        boolean isTrue = false;
        String value = String.valueOf(n);
        if (value.equals(newValue)){
            isTrue = true;
        }
       return isTrue;
    }


}
