//Left Aligned Star Pyramid
import java.util.*;
class Lasp{
    public static void main(String args[]){
        int py_ht=5;
        for(int i=1;i<=py_ht;i++){ //ith row has 'i' stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}