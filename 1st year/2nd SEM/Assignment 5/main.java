import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Linkedlist list=new Linkedlist();
        Node start=null, end=null;

        while(true){
            System.out.println("------------Menu------------");
            System.out.println("1: Create");
            System.out.println("2: Insert");
            System.out.println("3: Delete");
            System.out.println("4: Search and update mark");
            System.out.println("5: Display");
            System.out.println("0: Exit");
            System.out.println("Enter your choice");
            int c=sc.nextInt();
            switch (c){
                case 1:
                    int t='Y';
                    while (t=='Y' || t=='y'){
                        start=list.create(start,end);
                        System.out.println("Do you want to do entries if yes enter Y/y or else enter any key to return to menu");
                        t=sc.next().charAt(0);
                    }
                    break;
                case 2:
                    System.out.println("-----Insert--Menu---------");
                    System.out.println("1: insert at begining");
                    System.out.println("2: insert at any position");
                    System.out.println("3: inser at end");
                    System.out.println("Enter the choice");
                    int u=sc.nextInt();
                    switch (u){
                        case 1:
                            start=list.insbeg(start,end);
                            break;
                        case 2:
                            start=list.insany(start,end);
                            break;
                        case 3:
                            start=list.insend(start,end);
                            break;
                        default:
                            System.out.println("Invalid choice");

                    }
                    break;
                case 3:
                    System.out.println("-----Delete--Menu------");
                    System.out.println("1: Delete at begining");
                    System.out.println("2: Delete at any position");
                    System.out.println("3: Delete at end");
                    System.out.println("Enter the choice");
                    int n=sc.nextInt();
                    switch (n){
                        case 1:
                            start=list.delbeg(start,end);
                            break;
                        case 2:
                            start=list.delany(start,end);
                            break;
                        case 3:
                            start=list.delend(start,end);
                            break;
                        default:
                            System.out.println("Invalid choice");

                    }
                    break;
                case 4:
                    start=list.search(start);
                    break;
                case 5:
                    list.display(start,end);
                    break;
                case 0:
                    System.out.println("Exting the program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }

    }
}
