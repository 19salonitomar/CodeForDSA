package String;

import java.util.*;

public class stringPractice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String:");
        String str = sc.nextLine();

        int Count = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                Count++;
            }
        }
        System.out.println("Total Lower Case Vowel:" + Count);

        sc.close();
}

}