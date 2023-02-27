//Left Aligned Star Pyramid Inverse
import java.util.*;
class Laspi{
    public static void main(String args[]){
        int py_ht=5;
        for(int i=py_ht;i>0;i--){   //ith row has 'i' stars
            for(int j=1;j<=i;j++){
                System.out.print("*");  //Replace "*" with 'j' to print number pattern
            }
            System.out.print("\n");
        }
    }
}