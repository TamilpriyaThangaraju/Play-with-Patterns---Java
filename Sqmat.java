//axa(square matrix) star pattern - The Basic
import java.util.*;
class Sqmat{
    public static void main(String args[]){
        int a=5;  //Declaring the order of the square star matrix
        for(int i=1;i<=a;i++){  //Outer loop for column Count
            for(int j=1;j<=a;j++){  //Inner Loop for individual elements' count("*" count) in each row
                System.out.print("*");  //Replace this star with any element as needed
            }
            System.out.print("\n");
        }
    }
}