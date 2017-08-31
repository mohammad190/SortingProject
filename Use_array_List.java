package Class_9;
import java.util.*;
public class Use_array_List {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        // add elements
        arr.add(new Integer(2));
        arr.add(new Integer(5));
        arr.add(new Integer(1));
        arr.add(new Integer(23));
        arr.add(new Integer(14));
        for(int i = 0; i<arr.size();i++){
            System.out.println(arr.get(i)+ " ");
        }
        // add new elements
        arr.add(new Integer(29));

        System.out.println("Elements of Index 5: "+ arr.get(5));// get index value any one

        System.out.println("List of size ; " + arr.size()); // get index size

        System.out.println("Removing elements at index  2 :" + arr.remove(2));// remove any index

        for(int i = 0;i<arr.size(); i++){ // Check the new value.
            System.out.println(arr.get(i) + " ");
        }


    }
}
