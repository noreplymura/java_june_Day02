import java.util.Scanner;
class inputDaynumber2{
    public static void main(String[] args) {
    Scanner scob = new Scanner(System.in);
    System.out.println("Enter a Number:-");
        int dn;
        dn=scob.nextInt();

        if(dn==0){System.out.println("January");}
	else if(dn==1){System.out.println("February");}
	else if(dn==2){System.out.println("MARCH");}
	else if(dn==3){System.out.println("APRIL");}
	else if(dn==4){System.out.println("MAY");}
	else if(dn==5){System.out.println("June");}
	else if(dn==6){System.out.println("July");}
	else if(dn==7){System.out.println("August");}
	else if(dn==8){System.out.println("September ");}
	else if(dn==9){System.out.println("October");}
	else if(dn==10){System.out.println("November");}
	else if(dn==11){System.out.println("December");}
	else {System.out.println("INVALID");

    }
   }
  }
