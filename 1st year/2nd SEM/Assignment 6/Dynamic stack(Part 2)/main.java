import java.util.Scanner;
public class main {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node top ;
        top=null;
        stack stk2=new stack();
        while(true){
            System.out.println("*********MENU***********");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("0: exit");
            System.out.println("Enter the choice ");
            int c=sc.nextInt();
            switch (c){
                case 0:
                    System.out.println("Exiting the program");
                    System.exit(0);
                    break;
                case 1:
                    top=stk2.push(top);
                    break;
                case 2:
                    top=stk2.pop(top);
                    break;
                case 3:
                    stk2.display(top);
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }

    }
}
