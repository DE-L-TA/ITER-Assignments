import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Limkedlist list = new Limkedlist();
        Node root = null;
        root=list.insert(1941012657,100,root);
        root=list.insert(1941012667,95,root);
        root=list.insert(1941012630,56,root);
        root=list.insert(1941012415,45,root);
        root=list.insert(1941012852,86,root);
        root=list.insert(1941012417,75,root);
        root=list.insert(1941011258,66,root);
        root=list.insert(1941011263,15,root);
        while (true) {
            System.out.println("******Menu********");
            System.out.println("0 to exit");
            System.out.println("1 to insert");
            System.out.println("2 to delete");
            System.out.println("3 to search and update marks");
            System.out.println("4 to sort");
            System.out.println("5 to count");
            System.out.println("6 to reverse");
            System.out.println("7 to display");
            int c = sc.nextInt();
            switch (c) {
                case 0:
                    System.out.print("Exiting");
                    System.exit(0);
                case 1:
                    System.out.println("Insert the registration number ");
                    int reg=sc.nextInt();
                    System.out.println("Enter the marks");
                    float mark=sc.nextFloat();
                    System.out.println("******Menu********");
                    System.out.println("0 to insert at begining");
                    System.out.println("1 to insert at end");
                    System.out.println("2 to inert at position");
                    int d = sc.nextInt();
                    switch (d) {
                        case 0:
                            root=list.insbeg(reg,mark,root);
                            break;
                        case 1:
                            root=list.insend(reg,mark,root);
                            break;
                        case 2:
                            System.out.println("Enter the index");
                            int x=sc.nextInt();
                            root=list.insany(x,reg,mark,root);
                            break;
                        default:
                            System.out.println("invalid choice");
                    }
                    break;
                case 2:
                    System.out.println("******Menu********");
                    System.out.println("0 to delete at begining");
                    System.out.println("1 to delete at end");
                    System.out.println("2 to delete at position");
                    d=sc.nextInt();
                    switch (d){
                        case 0:
                            root=list.deleteatstart(root);
                            break;
                        case 1:
                            root= list.deleteatend(root);
                            break;
                        case 2:
                            System.out.println("Enter the registration number which is to be delelte");
                           int x=sc.nextInt();
                            root=list.delleteany(x,root);
                            break;
                        default:
                            System.out.println("wrong choice");
                    }break;
                case 3:
                    System.out.println("Enter the registration number which marks should be updated");
                    int r=sc.nextInt();
                    System.out.println("Enter the updated marks");
                    float m=sc.nextFloat();
                    root=list.search(r,m,root);
                    break;
                case 4:
                    root=list.mergeSort(root);
                    break;
                case 5:
                    System.out.println(list.count(root));
                    break;
                case 6:
                    root=list.reverse(root);
                case 7:
                    list.printList(root);
                    break;
            }
        }

    }}