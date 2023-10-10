import java.util.*;
class func{
   static float avg(int a, int b,int c){
    float ag= (a+b+c)/3;
    return ag;
    }
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("enter the first number:");
    int a=sc.nextInt();
    System.out.print("enter the second number:");
    int b=sc.nextInt();
    System.out.print("enter the third number:");
    int c=sc.nextInt();
    System.out.println("The Average is:"+ avg(a,b, c));
    sc.close();
}
}