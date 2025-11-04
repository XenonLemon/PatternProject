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
        while(i < rows){
            i++;
            System.out.print(i);
            while(){
              System.out.println(i);  
            }
        }

    }
    public static void main(String[] args){
        stars(7);
        triangle(9);
    }
}
