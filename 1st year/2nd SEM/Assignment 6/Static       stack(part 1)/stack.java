import java.util.Scanner;
public class stack {

    static Scanner sc=new Scanner(System.in);

    private static int getno(){
        System.out.println("Enyer the number ");
        return sc.nextInt();
    }
    public static int push(int[] stack,int top){
        if(isfull(top)){
            System.out.println("Stack is full");

        }else{
            top++;
            stack[top]=getno();

        }
        return top;
    }
    public static int pop(int[] stack,int top){
        if(isempty(top)){
            System.out.println("stack is empty");

        }else{
            System.out.println(stack[top]+" is deleted");
            top--;

        }
        return top;
    }
    public static boolean  isempty(int top){
        if (top==-1){
            return true;
        }else {
        return false;}
    }
    public static boolean  isfull(int top){
        if (top==main.Max-1){
            return true;
        }else {
            return false;}
    }
    public static void display(int[] stack,int top){
        if(isempty(top)){
            System.out.println("Stack is empty");
        }
        else {
            for (int n = 0; n <= top; n++) {
                System.out.print(stack[n] + " ");
            }
            System.out.println();
            }
    }
}
