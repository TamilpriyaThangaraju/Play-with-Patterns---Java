//Right Aligned Row Number Pyramid Inverse Pattern
import java.util.*;
class Rarnpi{
    public static void main(String args[]){
        int py_ht=5;
        int temp=py_ht;
        for(int i=0;i<py_ht;i++){   //ith row has i spaces and 'py_ht-i' numbers
            for(int j=0;j<i;j++){
                System.out.print(" ");  //Use "0" for better understanding
            }
            for(int k=1;k<=(py_ht-i);k++){
                System.out.print(temp);  //Replace "*" with k to print number pattern
            }
            temp--;
            System.out.print("\n");
        }
    }
}