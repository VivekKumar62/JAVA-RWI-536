import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_Class_Collection {
    public static void main(String[] args) {

//     int [] numbers= {1,2,3,4,5,6,7,8,9,10} ;
//     int index = Arrays.binarySearch(numbers,5);
//        System.out.println("The index of element 5 in the array is  "+index);

        Integer[] numbers ={10,55,12,78,62,19,33,96};
        Arrays.sort(numbers);

        //parallel sort = 8192
        Arrays.fill(numbers ,85);
        for(int i:numbers){
            System.out.println(i + " " );

        }
    }
}
