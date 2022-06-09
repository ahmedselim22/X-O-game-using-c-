package stackwithfifoasqueue;

import java.util.Scanner;

public class StackWithFIFOasQueue {
    int array[];
    int top , i , actual;
    public StackWithFIFOasQueue(int maxSize){
        array=new int [maxSize];
        top=-1;
        i=0;
        actual =0;
    }
    public void display(){
        for (int j = i; j < actual ; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.print("\n");
    }
    public void push(int value){
        if(top==actual){
            System.out.println("stack is full !");
            System.exit(1);
        }
            array[++top]=value;
            actual++;
    }
    
    public void pop(){
        if(top==-1){
            System.out.println("stack is empty !");
            System.exit(1);
        }
        i++;
    }
    
    public static void main(String[] args) {
        int choice , input;
        boolean flag =true;
        StackWithFIFOasQueue sq = new StackWithFIFOasQueue(100);
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("1- add value \n2- remove value \n3-display \n4- exit ");
            choice= in.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter value : ");
                    input = in.nextInt();
                    sq.push(input);
                break;
                case 2:
                    sq.pop();
                break;
                case 3:
                    sq.display();
                break;
                case 4:
                    flag=false;
                break;
                default:
                    System.out.println("wrong input !!");
                    flag=false;
            }
        }while(flag==true);
    }
    
}
