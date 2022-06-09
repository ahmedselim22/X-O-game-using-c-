
package insertionsort;

public class InsertionSort {
    private int array[];
    private int actual=0;
    public InsertionSort(int size){
        array=new int [size];
    }
    public void insert(int value){
        array[actual]=value;
        actual++;
    }
    
    public void display(){
        for(int i=0 ; i<actual ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort(3);
        is.insert(4);
        is.insert(3);
        is.insert(6);
        is.display();
    }
    
}
