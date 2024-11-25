package Sorting;

 public class selectionsort{
     
    public static void selectionSort( int arr[], int n){
         for(int i=0; i<n-1; i++){
            int maxIndex = i;

            for(int j=i+1; j<n; j++){
                if(arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
         }
    }

    public static void main(String args[]) {
        int arr[] = {2, 6, 8, 4, 7, 10 };
        int n = arr.length;

        selectionSort(arr, n);
        
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
 }