public class arrayPairs {
    public static void printPairs(int numbers[]) {
        for(int i=0; i<numbers.length; i++) {
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++) {
                System.out.print("(" + curr + " ," + numbers[i] + ")");
            }
            System.out.println();
        }
    }
}
