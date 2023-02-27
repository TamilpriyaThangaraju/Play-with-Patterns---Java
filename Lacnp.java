//Left Aligned Column Number Pyramid
import java.util.*;
class Lacnp{
    public static void main(String args[]){
        int py_ht=5;
        for(int i=1;i<=5;i++){  //ith row has numbers from 1 to i
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}