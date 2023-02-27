//Left Aligned Column Number Pyramid Inverse
import java.util.*;
class Lacnpi{
    public static void main(String args[]){
        int py_ht=5;
        for(int i=py_ht;i>=1;i--){  //ith row has numbers from 1 to i.
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}