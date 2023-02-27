//Left Aligned Natural Number Pyramid Pattern
import java.util.*;
class Lannp{
    public static void main(String args[]){
        int py_ht=5,num=1;
        for(int i=1;i<=py_ht;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num); //Code (num+" ") for better readability
                num++;
            }
            System.out.print("\n");
        }
    }
}