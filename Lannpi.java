//Left Aligned Natural Number Pyramid Inverse
import java.util.*;
class Lannpi{
    public static void main(String args[]){
        int py_ht=5,num=1,temp=1;
        
        num=(py_ht*(py_ht+1))/2; //Sum of first 'py_ht' natural nos is the starting number of the pyramid.

        temp=num;
        for(int i=py_ht;i<=py_ht;i--){ //ith row has consecutive numbers from temp to temp-i
            for(int j=temp;j>(temp-i);j--){
                System.out.print(j);
            }
            System.out.print("\n");
            temp=temp-i;
        }
    }
}