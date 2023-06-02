import java.util.Scanner;
class input1{
public static int add(int a, int b){
int c=a+b;
return c;
}
    public static void main(String[] args) {
        Scanner scob = new Scanner(System.in);
        System.out.println("Enter a number:");
        double num1;
        num1 = scob.nextDouble();
        System.out.print("Enter a Number:");
        double num2;
        num2 = scob.nextDouble();
        System.out.println(num1 +"+"+num2+"="+(num1+num2));
        
    }
}