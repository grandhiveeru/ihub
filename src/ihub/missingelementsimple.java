package ihub;

import java.util.Arrays;

public class missingelementsimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int numbers[]={9,6,4,5,7,0,1};
        Arrays.sort(numbers);
        int i=1;

        while ( i < numbers.length ) 
        {
            if ( numbers[i] - numbers[i-1] == 1 ) 
            {
            } 
            else 
            {
                System.out.println( "Missing number is " + ( numbers[i-1] + 1 ) );
            }
            i++;
        }


	}

}
