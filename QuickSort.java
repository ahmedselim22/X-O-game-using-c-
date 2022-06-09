package quicksort;

    public class QuickSort {
    int array[];
    int actual;

    public QuickSort(int maxSize){
        array= new int [maxSize];
        actual=0;
    }

    public void display(){
        for (int i = 0; i < actual ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.print("\n");
    }
    public void insert(int value){
            array[actual]=value;
            actual++;
    }
    public void quickSort() {
        recQuickSort(0, actual- 1);
    }
    public void recQuickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            long pivot = array[right];
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }
    }
    public int partitionIt(int left, int right, long pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while (array[++leftPtr] < pivot);

            while (rightPtr > 0 && array[--rightPtr] > pivot);
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(array,leftPtr, rightPtr);
            }
        }
        swap(array, leftPtr, right);
        return leftPtr;
    }
    public void swap(int arr[] , int x , int y ){
        int temp =arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    
    public static void main(String[] args) {
        QuickSort qs = new QuickSort(4);
        qs.insert(8);
        qs.insert(12);
        qs.insert(23);
        qs.insert(4);
        qs.display();
        qs.quickSort();
        qs.display();
    }
}
