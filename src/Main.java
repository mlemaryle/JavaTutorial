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

    }


}
