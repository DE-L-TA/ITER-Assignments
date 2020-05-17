import java.util.Scanner;
public class queue {
    static Scanner sc=new Scanner(System.in);
    static int c=0;
 public static Node enqueue(Node front,Node rear){

     if(rear==null){
       return pushing();
     }
     rear.next=enqueue(front,rear.next);
     return rear;
 }
 public static Node pushing(){
     Node a=new Node();
     a.num=getno();
     a.next=null;
     return a;
 }
 public static int getno(){
     System.out.println("Enter the number");
     return sc.nextInt();
 }
 public static Node dequeue(Node front,Node rear){
     if(rear==null){
         System.out.println("Queue is Empty");
     }
     else {
         System.out.println("Integer :"+rear.num+ " at postion :"+c+"  with ID :"+rear+"  Deleted" );
         rear=rear.next;
         c++;
     }
     return rear;
 }
 public static void display(Node front,Node rear){
     front=rear;
     if(rear==null){
         System.out.println("Queue is empty");
     }
     else{
         while (front!=null){
             System.out.print(front.num+" ");
             front=front.next;
         }
         System.out.println();
     }
 }
}
