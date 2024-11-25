public class largestNumber {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;            // -INFINITY

        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }

        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = {62, 46, 77, 98, 80, 105};
        System.out.println("Largest Number in an Array is :" + getLargest(numbers));
    }
}
