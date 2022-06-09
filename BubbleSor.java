
package bubblesor;
public class BubbleSor {
    private int array[];
    private int actual=0;
    
    public BubbleSor(int size){
        array=new int[size];
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
    public void bubleSorting(){
        for (int i = 0; i <actual ; i++) {
            for (int j = 0; j <actual-1 ; j++) {
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        BubbleSor bbs =new BubbleSor(3);
        bbs.insert(6);
        bbs.insert(5);
        bbs.insert(2);
        bbs.display();
        bbs.bubleSorting();
        bbs.display();
    }
}