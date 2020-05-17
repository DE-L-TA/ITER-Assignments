import java.util.Scanner;
public class stack {

    static Scanner sc=new Scanner(System.in);
    private static int getno(){
        System.out.println("Enyer the number ");
        return sc.nextInt();
    }
    public static Node pushing(){
     Node a=new Node();
     a.num=getno();
     a.next=null;
     return a;
    }
    public static Node push(Node top){
        if(top==null){
            return pushing();
        }
        top.next=push(top.next);
        return top;
    }
    public static Node pop(Node top){

            Node n=top;
            while (n.next.next!=null) {
                n = n.next;

            }
          
            System.out.println(n.next.num+" is deleted");
            n.next = null;
            return top;
    }

    public static void display(Node top){

           while(top!=null){
               System.out.print(top.num+" ");
               top=top.next;
           }
            System.out.println();

    }
}
