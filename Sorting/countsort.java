package Sorting;

public class countsort {
    public static void main(String args[]) {
        
        int arr[] = {1,3,5,7,8,4,3,1,7,9,7};
        int n = arr.length;
        int maxElement = 0;

        for(int i=0; i<n; i++) {
            if(arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        int count[] = new int[maxElement+1];

        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }

       
    }
}
