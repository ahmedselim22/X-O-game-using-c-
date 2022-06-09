package priorityqueue;
import java.util.Scanner;
public class PriorityQueue {
    private int array[];
    private int actual;
    
    public PriorityQueue(int maxSize){
        array= new int [maxSize];
        actual=0;
    }
    
    public void add(int value){
        if(actual==0){
            array[actual++]=value;
        }
        else{
            int i;
            for(i=actual-1 ; i>=0 ; i--){
                if (value > array[i]){
                    array[i+1]=array[i];
                }
                else{
                    break;
                }
            }
            array[i+1]=value;
            actual++;
        }
    }
    public void remove(){
        actual--;
    }
    public void display(){
        for (int j = 0; j < actual ; j++) {
            System.out.print(array[j]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter Queue maximum size :");
        int max =input.nextInt();
        PriorityQueue pq = new PriorityQueue(max);
        boolean flag=true;
        do{
            System.out.println("--------------------------------------------");
            System.out.println("1- add \n2- remove \n3- display \n4- exit");
            System.out.println("--------------------------------------------");
            System.out.println("enter your choice :");
            int c=input.nextInt();
            int in;
            switch(c){
                case 1:
                    System.out.println("enter value :");
                    in= input.nextInt();
                    pq.add(in);
                break;
                case 2:
                    pq.remove();
                break;
                case 3:
                    pq.display();
                break;
                case 4:
                    flag=false;
                break;
            }
        }while(flag==true);

    }
}
