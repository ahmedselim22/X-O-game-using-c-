package mergesort;
public class MergeSort{
    int array[];
    int actual;
    public MergeSort(int maxSize){
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
    
    public void merge(int arr[], int l, int m, int r)
    {
        int s1 = m - l + 1;
        int s2 = r - m;
 
        int L[] = new int [s1];
        int R[] = new int [s2];
 
        for (int i=0; i<s1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<s2; ++j)
            R[j] = arr[m + 1+ j];
 
        int i = 0, j = 0;
        int k = l;
        while (i < s1 && j < s2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < s1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < s2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    public void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            int m = (l+r)/2;
            sort(arr, l, m);
            sort(arr , m+1, r);
            merge(arr, l, m, r);
        }
    }
    public void doMerge(){
        sort(array, 0 , actual-1);
    }
    public static void main(String args[])
    {
        MergeSort ms = new MergeSort(100);
        ms.insert(90);
        ms.insert(1);
        ms.insert(8);
        ms.insert(6);
        ms.insert(27);
        ms.insert(22);
        System.out.println("Given Array");
        ms.display();
        ms.doMerge();
        System.out.println("\nSorted array");
        ms.display();
    }
}