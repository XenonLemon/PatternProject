//Peter Daniel
// 10/30/25
//Pattern Project is meant to output a pattern based on an integer input.
public class PatternProject{
    //stars will require an int in order to determine how many rows of stars will be printed out.
    //Using rows, stars will create a rows amount of stars, increasing by 2 stars each row.
    public static void stars(int rows){
        int i = 0;
        String stars= "*";
        while(i < rows){
            i++;
            System.out.println(stars);
            stars += "**";
        }
    }
    //the method triangle must be called with an integer as the input
    //triangle will output a triangle starting at 1, increasing by one until the maximum amount of rows is reached, with the amount of numbers going up by one each row.
    public static void triangle(int rows){
        int i = 0;
        int n = 0;
        while(i < rows){
            i++;
          
            while(n < i){
                  System.out.print(i);
                  n++;
              
            }
             System.out.println();
            n = 0; 
        }
    }
    //the method odds must be called with an integer as the input
    //odds will output an upside down triangle starting at the star integer, decreasing by 2 until the integer i reaches 1, with the triangle size also deecreasing by 2 per row.
    public static void odds(int start){
        
        for(int i = start; i>0; i-=2){
        
            for(int n = 0; n<i ; n++){
                System.out.print(i);
                
            }
            
            System.out.println();
        }
    }
    //the method odds must be called with an integer as the input
    //eo will output an increasing amount of letters starting on either E or O depending on the starting int, and once it reaches the maxE int, it will start decreasing until int i reaches 0.
    public static void eo(int maxE){
        int i = 0;
        String letter = "E";
        if(maxE%2 == 0){
             letter = "O";
        }
        while(i < maxE){
            
                for(int n = -1; i>n; n++){    
                    System.out.print(letter);
                }
                if(letter.equals("E")){
                    letter = "O";
                }
                else
                letter ="E";
                System.out.println();
                i++;
            
            }
        i = maxE-2;

        while(i >= 0){
            
                for(int n = -1; i>n; n++){    
                    System.out.print(letter);
                }
                if(letter.equals("E")){
                    letter = "O";
                }
                else
                letter ="E";
                System.out.println();
                i--;
            
            }
            

    }
    //the method odds must be called with an integer as the input
    //The method was suppsed to create an inverted pyramid starting at 1, and increasing the displayed number by 1 each row, but decreasing the amound of numbers by 2 each row, with the space being filled in by spaces on each end. 
    public static void pyramid(int rows){
        int k = 1;
        
        for(int i = rows; i>0; i--){
            
                for(int n = 1; n<=i*2-1 ; n++){
                    System.out.print(k);
                    
                    //COULD NOT FIGURE OUT HOW TO IMPLIMENT SPACES
                    for(int j = 1; j<=k; j++){
                        System.out.print("");
                    }
                
                }

                
                System.out.println();
                k++;
            }
    }

    
    public static void main(String[] args){
        stars(7);
        System.out.println();
        triangle(9);
        System.out.println();
        odds(9);
        System.out.println();
        eo(6);
        System.out.println();
        eo(5);
        System.out.println();
        pyramid(5);
    }
    
}
