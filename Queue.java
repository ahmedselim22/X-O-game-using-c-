package queue;
import java.util.Scanner;
public class Queue {
private int array[];
private int addptr , removeptr;

public Queue(int maxSize){
    array=new int[maxSize];
    addptr=0;
    removeptr=0;
}
    public void add(int value){
        if(isFull()==true){
            System.out.println("Queue is full !");
            System.exit(1);
        }
        else{
            array[addptr++]=value;
        }
    }
    public void remove(){
        if(isEmpty()==true){
            System.out.println("Queue is empty !");
            System.exit(1);
        }
        else{
            removeptr++;
        }
    }
    
    public boolean isFull(){
        if(addptr==array.length-1 && removeptr==0){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        
        if(addptr==0 && removeptr==0){
            return true;
        }
        return false;
    }
    
    public void display(){
        for(int i=removeptr ; i<addptr ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        int choice , input;
        boolean flag =true;
        Queue Q =new Queue(100);
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("1- add value \n2- remove value \n3-display \n4- exit ");
            choice= in.nextInt();
            switch(choice){
                case 1:
                    input = in.nextInt();
                    Q.add(input);
                break;
                case 2:
                    Q.remove();
                break;
                case 3:
                    Q.display();
                break;
                case 4:
                    flag=false;
                break;
            }
        }while(flag==true);
    }
    
}
