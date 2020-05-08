

import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Limkedlist list = new Limkedlist();
        Node root = null;
        

        while (true) {
            System.out.println("******Menu********");
            System.out.println("0 to exit");
            System.out.println("1 to create");
            System.out.println("2 to insert");
            System.out.println("3 to delete");
            System.out.println("4 to search and update marks");
            System.out.println("5 to sort");
            System.out.println("6 to count");
            System.out.println("7 to reverse");
            System.out.println("8 to display");
            int c = sc.nextInt();
            switch (c) {
                case 0:
                    System.out.print("Exiting");
                    System.exit(0);
                case 1:
                    System.out.println("--------------Create the list-----------------");
                    System.out.println("Enter the number of Entries do you want");
                    int rect=sc.nextInt();
                    for(int i=1;i<=rect;i++){
                        System.out.println("Insert the registration number ");
                        int reg=sc.nextInt();
                        System.out.println("Enter the marks");
                        float mark=sc.nextFloat();
                        root=list.insert(reg,mark,root);
                    }
                    break;
                case 2:
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
                case 3:
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
                case 4:
                    System.out.println("Enter the registration number which marks should be updated");
                    int r=sc.nextInt();
                    System.out.println("Enter the updated marks");
                    float m=sc.nextFloat();
                    root=list.search(r,m,root);
                    break;
                case 5:
                    root=list.mergeSort(root);
                    break;
                case 6:
                    System.out.println(list.count(root));
                    break;
                case 7:
                    root=list.reverse(root);
                case 8:
                    list.printList(root);
                    break;
            }
        }

    }}