package linkedlist;

public class LinkedList {
    public linkedListNodes first;
    public linkedListNodes last;
    
    public LinkedList(){
        first=null;
        last=null;
    }
    
    public boolean isEmpty(){
        return first==null;
    }
    
    public void addFirst(int value){
        linkedListNodes newVal = new linkedListNodes(value);
        if(first==null){
            first=newVal;
        }
        else{
            newVal.next=first;
            first=newVal;
        }
    }
    public void search(double sKey){
        linkedListNodes n=first;
        while(n!=null){
            if(n.data==sKey){
                System.out.println("founded at index " +n.data);
                break;
            }
            n=n.next;
        }
        System.out.println("not founded ");
    }
    public void deleteFirst(){
        first=first.next;
    }
    public void display(){
        linkedListNodes n = first;
        while(n!=null){
            System.out.print(n.data + " ");
            n=n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(34);
        ll.addFirst(32);
        ll.addFirst(66);
        ll.display();
        ll.search(32);
        ll.search(2);
        ll.display();
        ll.deleteFirst();
        ll.display();
    }
    
}
 