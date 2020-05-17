import java.util.Scanner;
public class main {

    public static final int Max=10;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        stack stk=new stack();
      int[] stack=new int[Max];
      int top=-1;
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
                  top=stk.push(stack,top);
                  break;
              case 2:
                  top=stk.pop(stack,top);
                  break;
              case 3:
                  stk.display(stack,top);
                  break;
              default:
                  System.out.println("invalid choice");
          }
      }

    }
}
