package Patterns;

public class pyramidStar {
    public static void main(String[] args) {
        int i, j, n=6;

        for(i=0; i<n; i++){   // for row

            for(j=n-i; j>1; j--){     //for space
                System.out.print(" ");
            }

            for(j=0; j<=i; j++){    //for column
                System.out.print(" * ");
            }

            System.out.println();
        }
    }    
}