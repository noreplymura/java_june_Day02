import java.util.*;
public class Program206 {
public static void main (String[] args){char ch;
System.out.println("Enter a character:-");
Scanner sc = new Scanner(System.in);
ch=sc.next().charAt(0);
System.out.println();
 if((ch >='a'&&ch<='g')|| (ch >='A'&&ch<='G'))
System.out.println(ch +"\tis a alphabet");
 else if((ch >='0'&&ch<='9'))
System.out.println(ch +"\tis a digit");
 else 
System.out.println(ch +"\tis a special character");
}
}