public class Limkedlist{
Node head;

    public Node getNewNode(int regd_no,float mark) {
        Node a = new Node();
        a.next = null;
        a.regd_no = regd_no;
        a.marks=mark;
        return a;
    }


    public Node insert(int regd_no,float marks, Node node) {

        if (node == null)
            return getNewNode(regd_no,marks);
        else
            node.next = insert(regd_no,marks, node.next);

        return node;
    }
    public Node insbeg(int regd_no,float marks,Node node) {
       Node head1;
       head1=getNewNode(regd_no,marks);
       head1.next=node;
       return head1;
    }
    public Node insend(int regd_no,float marks,Node node){
Node n=node;
     while(n.next!=null){
         n=n.next;
     }
        n.next=getNewNode(regd_no,marks);
        return node;
    }
public Node insany(int index,int regd_no,float mark,Node node) {
    Node n = node;
    Node n1;
    int i=0;
    n1 = getNewNode(regd_no, mark);
    while(n.next!=null)
    {
        if(i==index-2){
            n1.next=n.next;
            n.next=n1;
        }else {
        n=n.next;}
        i++;
    }

    return node;
}
    public Node deleteatstart(Node node){
        node=node.next;
        return node;
    }
    public Node deleteatend(Node node){
        Node n=node;
        while((n.next).next!=null){
            n=n.next;
        }
        n.next=null;
        return node;
    }
    public Node delleteany(int regd_no,Node node){

        int a=0,b=0,c=0;

        Node n=node;
        while(n.next!=null)
        {
            a++;
            if(n.regd_no==regd_no){

                break;}

            n=n.next;
        }
        n=node;
        if(c==0){
            System.out.println("no such registration number exist");
        }
        a--;
        while(n.next!=null)
        {
            b++;
            if(a==b)
                break;
            n=n.next;
        }
        n.next=(n.next).next;
        return node;
    }
    public Node search(int regd_no,float marks,Node node){
        Node n= node;
        int t=0;
        while (n.next!=null){
            if(n.regd_no==regd_no){
                t++;
                break;
            }

            else{}
            n=n.next;
        }
        if(t==0){
            System.out.println("no such registartion number ");
        }

        n.marks=marks;
        return node;

    }
    public Node mergeSort(Node node) {
        if(node == null || node.next == null) {
            return node;
        }

        Node middle = findmiddleNode(node);
        Node leftlist = middle.next;
        middle.next = null;

        return merge(mergeSort(node), mergeSort(leftlist));
    }


    public Node findmiddleNode(Node node) {
        if(node == null) {
            return null;
        }

        Node a = node;
        Node b = node.next;

        while(b != null && b.next != null) {
            a = a.next;
            b = b.next.next;
        }

        return a;
    }

    public Node merge(Node a, Node b) {
        Node temp = new Node();
        Node finalList = temp;

        while(a != null && b != null) {
            if(a.marks < b.marks) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }
        temp.next = (a == null) ? b : a;
        return finalList.next;
    }
    public int count(Node node){
        Node n=node;
        int c=1;
        while(n.next!=null){
            c++;
            n=n.next;

        }
        return c;
    }
public void prontcount(int c){
    System.out.println(c);

}
public Node reverse(Node node){
        Node n;
        Node finallist=null;
        Node temp=node;
        while (temp!=null){
            n=temp.next;
            temp.next=finallist;
            finallist=temp;
            temp=n;
        }node=finallist;
        return node;
}

    public void printList(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.regd_no + " "+ node.marks);
        printList(node.next);
    }

}