package heap.sort;

public class HeapSort {
    int array[];
    int actual;
    public HeapSort(int size){
        array=new int [size];
        actual=0;
    }
    //insert function
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
                                             
    public void sort(int arr[])
    {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--){
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            swap(arr,0,i);
            heapify(arr, i, 0);
        }
    }
    void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
        if (l < n && arr[l] > arr[largest])
            largest = l;
        
        if (r < n && arr[r] > arr[largest])
            largest = r;
        
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
    public void runHeap(){
        sort(array);
    }
    public void swap(int arr[], int x , int y){
        int temp = arr[x];
        arr[x] = arr[y] ;
        arr[y] = temp;
    }
    public static void main(String[] args) {
        HeapSort hs = new HeapSort(6);
        hs.insert(233);
        hs.insert(32);
        hs.insert(34);
        hs.insert(90);
        hs.insert(9);
        hs.insert(23);
        hs.display();
        hs.runHeap();
        hs.display();
    }
    
}
}