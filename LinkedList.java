import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args) {
        RawList head = null;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int lst[]={1,2,3,4,5,6,7,8,9,10};
        for(int x:lst){
            RawList temp = new RawList(x);
            if(head == null){
                head = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
        }
        RawList tp = head;
        while(tp != null){
            System.out.println(tp.val);
            tp = tp.next;
        }
    }
}

class RawList{
    public int val ;
    RawList(int data){
        val = data;
    }
    public RawList next= null;
}