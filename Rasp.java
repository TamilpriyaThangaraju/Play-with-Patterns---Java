//Right Aligned Star Pyramid Pattern
import java.util.*;
class Rasp{
    public static void main(String args[]){
        int py_ht=5;
        for(int i=1;i<=py_ht;i++){            //ith row has 'i' stars and 'py_ht-i' spaces
            for(int j=1;j<=(py_ht-i);j++){ 
                System.out.print(" ");      //Use "0" for better understanding
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");  //Replace "*" with k to print number pattern
            }
            System.out.print("\n");
        }
    }
}