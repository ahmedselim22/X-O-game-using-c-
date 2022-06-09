package shellsort;

public class ShellSort {
    private int array[];
    private int actual;
    
    public ShellSort(int size){
        array=new int[size];
    }
    
    public void insert(int value){
        array[actual]=value;
        actual++;
    }
    
    public void display(){
        for (int i = 0; i < actual ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.print("\n");
    }
    
    public void shellSorting(){
        int n = array.length;
         for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
                    array[j] = array[j - gap];
                array[j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        ShellSort ss = new ShellSort(3);
        ss.insert(9);
        ss.insert(4);
        ss.insert(2);
        ss.display();
        ss.shellSorting();
        ss.display();
    }
}
