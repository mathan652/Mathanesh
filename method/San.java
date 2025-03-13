
import java.util.Scanner;
public class San
public static void main(String args[]){
    San=new san
     Scanner ob=new Scanner(System.in);
    
    System.out.println("This is san );
   
    System.out.println("enter two numbers");
    int a=ob.nextInt();
    int b=ob.nextInt();

    System.out.println("Enter your choice");
    System.out.println("1-addition");
    System.out.println("2-subtraction");
    System.out.println("3-multiplication");
    System.out.println("4-division");
    System.out.println("5-quit");






 
    do
   
    {int n=ob.nextInt();
    switch(n){
        case 1:
           obj.add(a,b);
            break;
        case 2:
           obj.sub(a,b);
            break;
        case 3:
            obj.product(a,b);
            break;
        case 4:
            obj.divide(a,b);
            break;
    }
    }while(n!=5);
    

