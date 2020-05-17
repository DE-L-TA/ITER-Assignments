import java.util.Scanner;
public class main {
    public static final int Max=5;
    public static int front=-1;
    public static int rear=-1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Queue = new int[Max];
        queue Q = new queue();
        while (true) {
            System.out.println("*********MENU***********");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("0: exit");
            System.out.println("Enter the choice ");
            int c = sc.nextInt();
            switch (c) {
                case 0:
                    System.out.println("Exiting the program");
                    System.exit(0);
                    break;
                case 1:
                    rear = Q.enqueue(Queue);
                    break;
                case 2:
                    front = Q.dequeue(Queue);
                    break;
                case 3:
                    Q.display(Queue);
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}