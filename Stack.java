package stack;
import java.util.Scanner;
public class Stack {

    private int array[];
    private int top;
    
    public Stack(int maxSize){
        array = new int[maxSize];
        top=-1;
    }
    
    public void push(int value){
        if(isFull()==true){
            System.out.println("stack is full !");
            System.exit(1);
        }
        top++;
        array[top]=value;
    }
    
    public void pop(){
        if(isEmpty()==true){
            System.out.println("stack is empty !");
            System.exit(1);
        }
        top--;
    }
    
    public boolean isFull(){
        if(top==array.length-1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    
    public void display(){
        for (int i = 0; i <= top ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Stack s =new Stack(100);
        int input , choice;
        boolean flag=true;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("1- push value \n2- pop value \n3-display \n4- exit ");
            choice= in.nextInt();
            switch(choice){
                case 1:
                    input = in.nextInt();
                    s.push(input);
                break;
                case 2:
                    s.pop();
                break;
                case 3:
                    s.display();
                break;
                case 4:
                    flag=false;
                break;
            }
        }while(flag==true);
    }
    
}
