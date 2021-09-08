package Max_Product;

/*
    This class is Main class to define the user input array. The users can change the hardcoded int array.
    After compiling the program, it will show the maximum output value which is calculated by the implementation class.
    Author: Hyejin Kim
    Date: 9/8/2021
*/
public class Main {
    public static void main(String[] args){
        
        Max_Product MP = new Max_Product();

        int[] userInputs = {-1,4,0,9,3,7}; //Users can change the input numbers here.
        System.out.println("The maximum product result will be " + MP.calculation(userInputs));
    }

}//Main
