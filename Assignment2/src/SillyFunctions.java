//there is a missing import statement that is required to make this class work.
public class SillyFunctions {

    public  void addValueToArrayElements (int inputArray, int value) { //there are errors on this line
        for (int i=0; i<inputArray.arrayLength; i++) { //this line contains an error
            inputArray[i] = addTheTwoValues(value,inputArray[i]);
        }
    }

    public  int addTheTwoValues(int num1, int num2) { //there is an error on this line
        return 0; //there is an error on this line
    }


    public  void testCoolMathFunction(int num1, int num2) { //there is an error on this line
        IntegerArithmetic IA =  IntegerArithmetic(num1,num2); //there is one error on this line
        int product = IA.multiplication();
        String outputString=String.format("The product of %d and %d is %d",num1,num2,product);
        System.out.println(outputString);
    }

    private  String  commaSeparatedArray(int inputArray) { //there are  errors on this line
        String result = "";
        StringBuilder tmp = new StringBuilder();
        if (inputArray.length > 0) {
            for (int item : inputArray) {
                tmp.append(item).append(",");
            }
            result = tmp.deleteCharAt(tmp.length()-1).toString();
        }
        return result;
    }

}
