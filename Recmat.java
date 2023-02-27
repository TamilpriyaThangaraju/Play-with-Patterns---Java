//axb(rectangular matrix) star pattern - The Basic
import java.util.*;
class Recmat{
    public static void main(String args[]){
        int r=5, c=6;  //Declaring number of rows and columns
        for(int i=1;i<=c;i++){  //Outer loop for column Count
            for(int j=1;j<=r;j++){  //Inner Loop for individual elements' count("*" count) in each row
                System.out.print("*");  //Replace this star with any element as needed
            }
            System.out.print("\n");
        }
    }
}