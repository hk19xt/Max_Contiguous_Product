package Max_Product;

/* This class is Max_Product class to implement the calculation for the product of contiguous elements in an array.
   The input numbers will be defined by users in the main class.

*/
public class Max_Product {

    //@param userInputs: int array from the main class.
    public int calculation(int[] userInputs){
        int initial = 0; 
        //All the values, including maximum, minimum, and final output, will be initialized as the first element in the array.
        int max_value = userInputs[initial];
        int min_value = userInputs[initial];
        int final_output = userInputs[initial];

        if(userInputs.length == 1) { //If the user input has only one element, then the element will be the max, min, and final output value.
            max_value = userInputs[initial];
            min_value = userInputs[initial];
            final_output = userInputs[initial];
        }

        if(userInputs.length == 0){ //If the user input has no element, then it will return zero.
            return 0;
        }
        //If the user input is more than 1 elements, then we should check the three cases in total when it comes to the maximum product value in the contiguous array.
        // 1) The current position value.
        // 2) The current position value is multiplied by the maximum value which is calculated by so far.
        //    For example, positive number x positive number = positive number.
        // 3) The current position value is multiplied by the minimum value which is calculated by so far.
        //    For example, negative number x negative number = positive number.
        // Therefore, we should keep track of the maximum number as well as the minimum number in order to find the maximum product.
        for (int position = 1; position < userInputs.length; position++){
            max_value = Math.max(max_value*userInputs[position], Math.max(min_value*userInputs[position], userInputs[position]));
            min_value = Math.min(max_value*userInputs[position], Math.max(min_value*userInputs[position], userInputs[position]));
            //The final value will be updated until the for loop hits the last number in the array.
            final_output = Math.max(final_output, max_value);
        }
        return final_output;
    }//Calculation


}//Max_Product

