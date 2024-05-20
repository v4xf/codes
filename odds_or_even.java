public class odds_or_even {
    public static void main(String[] args) {
       System.out.println(oddsVsEvens(1111111122));

    }



    public static String oddsVsEvens(int num) {
        // write your code here
        int num1 = num;
        int num2 = num;

       
        int i ;
        int x;

        for ( i=0; num1!=0; i++ ) {
            num1 = num1/10; 
     }
      

    int[] arry = new int[i];

    

    for (x = 1; x <= arry.length; x++) {
        arry[i-x]= num2%10;
        num2 = num2/10;
        
    }
    // arry = {1 , 2 , 3}
    


    int odd = 0;
    int even = 0;

    for (int f = 0; f < arry.length; f++) {
        if (arry[f] %2 != 0) {
          odd = odd + arry[f] ;
        }
// odd = 1 + 3 =  4
}

for (int f = 0; f < arry.length; f++) {
    if (arry[f] %2 == 0){
        even = even + arry[f];
    }
}
//  even = 2 

String result;

if (odd > even) {
    result = "odd";
} else if(even > odd) {
    result = "even";
} else {
    result = "equal";
}

return result;
    }
}
