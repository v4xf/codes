public class c_ones {
    public static void main(String[] args) {
        System.out.println(count_ones(7));
    }

    public static int count_ones(int num) {
        // write your code here
        int result = 0;
        while (num/2 >0) {

            if (num%2 == 0) {
                num = num/2;
            }

           else if (num%2 == 1) {
                
                result++;
                num = num/2;
    
            } 
        }
       if (num == 0) {
        result = 0;
       } else {
        result++;
       }
        
       
        return result;
    }
}