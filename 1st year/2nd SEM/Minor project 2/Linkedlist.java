class Linkedlist {
    public Node ins(int e,int c){
        Node a=new Node();
        a.e=e;
        a.c=c;
        a.next=null;
        return a;
    }
    public Node create(Node n,int e,int c){
        if(n==null){
            return ins(e,c);
        }
        n.next=create(n.next,e,c);
        return n;

    }
    public void display(Node n,int c) {
        if (n == null) {
            return;
        }
        if (c == 0 || (n.c < 0 && n.e!=0)) {
            System.out.print(n.c + "x^" + n.e+" ");
        }
        else if(n.e==0){
            if(n.c>0){
                System.out.println("+"+n.c+" ");}
            else{
                System.out.println(n.c+" ");
            }
        }
        else {
            System.out.print("+ " + n.c + "x^" + n.e+" ");
        }
        display(n.next, 1);



    }
    public Node add(Node res,Node a,Node b){
        int x,y;
        while(a!=null && b!=null){
            if(a.e==b.e){
                x=a.c+b.c;
                y=a.e;
                res= create(res,y,x);
                a=a.next;
                b=b.next;
            }else if(a.e<b.e){
                x=b.c;
                y=b.e;
                res= create(res,y,x);
                b=b.next;
            }else{
                x=a.c;
                y=a.e;
                res= create(res,y,x);
                a=a.next;
            }}
        while (a!=null){
            x=a.c;
            y=a.e;
            res =  create(res,y,x);
            a=a.next;
        }
        while (b!=null){

            x = b.c;
            y = b.e;
            res = create(res,y,x);
            b=b.next;
        }

        return res;

    }
}
