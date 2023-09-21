import CoolMath.IntegerArithmetic;

public class SillyFunctions {

    public static void addValueToArrayElements (int[] inputArray, int value) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = addTheTwoValues(value,inputArray[i]);
        }
    }

    private static int addTheTwoValues(int num1, int num2) {
        return num1 + num2;
    }


    public static void testCoolMathFunction(int num1, int num2) {
        IntegerArithmetic IA =  new IntegerArithmetic(num1,num2);
        int product = IA.multiplication();
        String outputString = String.format("The product of %d and %d is %d",num1,num2,product);
        System.out.println(outputString);
    }

    public static  String  commaSeparatedArray(int[] inputArray) { //there are  errors on this line
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
