//Right Aligned Column Number Pyramid Inverse Pattern
import java.util.*;
class Racnpi{
    public static void main(String args[]){
        int py_ht=5;
        for(int i=0;i<py_ht;i++){   //ith row has i spaces and 'py_ht-i' numbers
            for(int j=0;j<i;j++){
                System.out.print(" ");  //Use "0" for better understanding
            }
            for(int k=1;k<=(py_ht-i);k++){
                System.out.print(k);  //Replace 'k' with "*" to print star pattern
            }
            System.out.print("\n");
        }
    }
}