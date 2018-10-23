import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Integer addResult = calculator.add(2, 4);
        System.out.println("The addition answer is: " + addResult);

        Integer subResult = calculator.subtract(5, 2);
        System.out.println("The subtraction answer is: " + subResult);

        Integer multiplicationResult = calculator.multiply(6, 7);
        System.out.println("The multiplication answer is " + multiplicationResult);

        Integer divisionResult = calculator.division(10, 2);
        System.out.println("The divided answer is " + divisionResult);

        Looping looping = new Looping();
        List<Integer> fullListNumbers = Arrays.asList(1,2,3,4,6,87,42,13,54,9);
        List<Integer> filteredList = looping.filterForValuesUnder10(fullListNumbers);

        String filteredNumberListResultString = "Numbers includes: ";
        for (Integer integer : filteredList){
            filteredNumberListResultString = filteredNumberListResultString + integer + " ";
        }

        System.out.println(filteredNumberListResultString);
    }



}
