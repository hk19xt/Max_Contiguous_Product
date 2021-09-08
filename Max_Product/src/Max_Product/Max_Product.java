package Max_Product;
public class Max_Product {

    public int calculation(int[] userInputs){
        int initial = 0;
        int max_value = userInputs[initial];
        int min_value = userInputs[initial];
        int final_output = userInputs[initial];

        if(userInputs.length == 1) {
            max_value = userInputs[initial];
            min_value = userInputs[initial];
            final_output = userInputs[initial];
        }

        if(userInputs.length == 0){
            return 0;
        }
        for (int i=1; i<userInputs.length; i++){
            max_value = Math.max(max_value*userInputs[i], Math.max(min_value*userInputs[i], userInputs[i]));
            min_value = Math.min(max_value*userInputs[i], Math.max(min_value*userInputs[i], userInputs[i]));
            final_output = Math.max(final_output, max_value);
        }
        return final_output;
    }


}

