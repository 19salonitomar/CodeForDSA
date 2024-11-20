package Patterns;

public class bottomRightStar {
    public static void main(String args[]){
        int n = 6;

        // For Outer Loop
        for(int i = 1; i <= n; i++){
            
            // For Spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

                //For Printing Stars
                for(int k = 1; k <= i; k++){
                    System.out.print("*");
                }
            
            System.out.println();
        }
    }


//With Functions/Methods!

public static void InvertedStar(int n){
   
    // For Outer Loop
    for(int i = 1; i <= n; i++){
        
        // For Spaces
        for(int j = 1; j <= n-i; j++){
            System.out.print(" ");
        }

            //For Printing Stars
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
        
        System.out.println();
    }

 InvertedStar(5);
}

}