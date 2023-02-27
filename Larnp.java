//Left Aligned Row Number Pyramid
import java.util.*;
class Larnp{
    public static void main(String args[]){
        int py_ht=5;
        for(int i=1;i<=5;i++){  //ith row has numbers from 1 to i
            for(int j=1;j<=i;j++){
                System.out.print(i); //Replace 'i' with j to get column number pattern ; with "*" to get star pattern
            }
            System.out.print("\n");
        }
    }
}