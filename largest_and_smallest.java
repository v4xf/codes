import java.util.Arrays;

public class largest_and_smallest {
    public static void main(String[] args) {
        int[] N = {10, 20, 30, 40};
        System.out.println(Arrays.toString(largest_smallest(N)));
      
    }


    public static int[] largest_smallest(int[] array_values) {
        // write your code here
    
        int largest = array_values[0];
        int smallest = array_values[0];
        
        for(int i=0 ; i < array_values.length ; i++ ){
            if (array_values[i] > largest) {
                largest = array_values[i];

            } else if (array_values[i]< smallest) {
                smallest = array_values[i];
            }
        }
       
        int[] result = new int[2];
        result[0]= largest;
        result[1]= smallest;

        return result;
    }
}
