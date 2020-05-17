import java.util.Scanner;
public class queue {
    static Scanner sc=new Scanner(System.in);
    static int c=0;
    public static int getno(){
        System.out.println("Enter the number");
        return sc.nextInt();
    }
    public static int enqueue(int[] Queue){
        if(isfull()){
            System.out.println("Queue is full");
        }
        else{
            main.rear++;
            Queue[main.rear]=getno();

        }
        if(main.rear==0){
            main.front++;
        }
        return main.rear;

    }
    public static int dequeue(int[] Queue){
        if(isempty()||c>=main.Max){
            System.out.println("Queue is Empty");
        }
        else{
            c++;
            System.out.println(Queue[main.front]+" is removed from queue");
            main.front++;
        }
        return main.front;
    }
        public static void display(int[] Queue){
            if(isempty()){
                System.out.println("Stack is empty");
            }
            else if(c>=main.Max){
                System.out.println("All the elementes are deleted no left to display");
            }
            else{
                for(int i=main.front;i<=main.rear;i++){
                    System.out.print(Queue[i]+" ");
                }
                System.out.println();
            }

        }
        public static boolean isfull(){
            if(main.rear==main.Max-1){
                return true;
            }
            return false;
            }
        public static boolean isempty(){

            if(main.front==-1||main.rear==-1){
                return true;
            }
            return false;
        }

}
