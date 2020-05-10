import java.util.Scanner;
public class Linkedlist {

    static Scanner sc=new Scanner(System.in);
    private static int c=0;


    public static int  setgetReg() {
        System.out.println("Enter the registration number");
        return sc.nextInt();
    }



    public static float setgetMark() {
        System.out.println("Enter the marks");
        return sc.nextFloat();
    }

    public static Node put(){
        Node a=new Node();
        a.reg=setgetReg();
        a.mark=setgetMark();
        a.next=null;
        a.prev=null;
        return a;
    }
    public static Node create(Node start,Node end){

        if(start==null){
           start=put();
           start.prev=end;
           return start;

        }
        end=start;
        start.next=create(start.next,end);
        return start;
    }

    public void display(Node start,Node end){

        if(start==null) {
            return;
        }
        System.out.println("| Reg number :"+start.reg+" Marks :"+start.mark);
       // System.out.println(start.prev +" "+start.next+" "+start);                    //run this code by replacing // so that you can know the list is doublylinked list
        display(start.next,end);

    }
    public static Node insbeg(Node start,Node end){
        if(start==null){
            end= put();
        }else {
            end = put();
            start.prev=end;
            end.next=start;

        }
        return end;
    }
    public static Node insend(Node start,Node end){
        return create(start,end);
    }
    public static int getindex(){
        System.out.println("Enter the index number");
        return sc.nextInt();
    }
    public static Node insany(Node start,Node end) {
        int d = 1;

        Node e = put();
        Node n = start;
        int f=getindex();
      for(int i=1;i<f-1;i++){
          n=n.next;
      }
                end=n.next;
                end.prev=e;
              e.next=end;
              e.prev=n;
              n.next=e;
              return n;
        }
      public static Node delbeg(Node start,Node end){
         end=start.next;
         end.prev=null;


         return start ;
    }
       public static Node delend(Node start,Node end){
         end=start;
         while((end.next).next!=null){
         System.out.println(end.next+" "+end+" "+end.prev);
         end=end.next;

      }
         end.next.prev=null;
         end.next=null;

         return start;
      }

      public static Node delany(Node start,Node end) {
        int f=getindex();
        end=start;
        Node n=null;
        for(int i =1;i<f &&  end.next!=null;i++,end=end.next){
            n=end;
       }n.next=end.next;
       end.next.prev=n;
       return start;
       }
       public static Node search(Node start){
        Node n=start;
        int c=0;
       System.out.println("So you want to update the marks.... ");
        int reg=setgetReg();
        while (n.next!=null){
        if(n.reg==reg){
            c++;
            n.mark=setgetMark();
            break;
        }
        n=n.next;
        }
        if(c==0){
        System.out.println("Invalid registration number");
        }else{
        System.out.println(n.reg+" updated now it has "+n.mark+" marks");
        }
        return start;
        }
        }
