public class linearCode {
    
    public static int linearSearch(int number[], int key){
        for(int i = 0; i < number.length; i++){
            if(number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = 90;

        int index = linearSearch(number, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("key at index: " + index);
        }
    }
}