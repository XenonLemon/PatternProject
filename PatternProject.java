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
    //
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
    //
    public static void odds(int start){
        
        for(int i = start; i>0; i-=2){
        
            for(int n = 0; n<i ; n++){
                System.out.print(i);
                
            }
            
            System.out.println();
        }
    }

    
    public static void main(String[] args){
        stars(7);
        triangle(9);
        odds(9);
    }
    
}
