import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linkedlist list = new Linkedlist();
        Node poly1 = null;
        Node poly2 = null;
        Node res = null;
        char p = 'y';
        char t = 'y';


        System.out.println("***********First Enter The Two Polynomials**********");
        System.out.println("Enter the 1st polynomial");
        while (p == 'y') {
            System.out.println("Enter the coffecient of x");
            int c = sc.nextInt();
            System.out.println("enter the exponent of x ");
            int e = sc.nextInt();
            System.out.println("Do you want to enter more term in 1st polynomial ");
            System.out.println("so press y to enter and press any key to continue");
            p = sc.next().charAt(0);
            poly1 = list.create(poly1, e, c);
        }
        System.out.println("Enter the 2nd Polynomial");
        while (t == 'y') {
            System.out.println("Enter the coffecient of x");
            int c = sc.nextInt();
            System.out.println("enter the exponent of x ");
            int e = sc.nextInt();
            System.out.println("Do you want to enter more term in 2nd polynomial ");
            System.out.println("so press y to enter and press any key to continue");
            t = sc.next().charAt(0);
            poly2 = list.create(poly2, e, c);
        }

        System.out.print("1st polynomial :");
        list.display(poly1, 0);
        System.out.println();
        System.out.print("2nd polynomial :");
        list.display(poly2, 0);
        System.out.println();

        res = list.add(res, poly1, poly2);
        System.out.print("Resultant polynomial :");
        list.display(res, 0);
        System.out.println();

    }

}