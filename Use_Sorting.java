package Class_9;
import java.util.*;

public class Use_Sorting {
    public static void main(String[] args) {
        int[] array = {5,8,1,9,3,4,10,6,2,7};

        for(int i=1; i<array.length;i++){
            int temp = array[i];
            int j;
            for(j = i-1; j>=1 && temp<array[j]; j--)

                    array[j + 1] = array[j];
                    array[j + 1] = temp;
                    System.out.println(i);

                }







    }
}
