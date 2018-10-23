public class Calculator {

    /*
    Public -> specifying the method is a public type method
    Integer -> Specifies that the return type is Integer
    add(...) -> this is the name of the method
    Integer num1 -> this is the first argument that we need to pass
    Integer num2 -> this is the second argument that we need to pass
     */
    public Integer add(Integer num1, Integer num2) {
        Integer result = num1 + num2;
        return result;

    }
     public Integer subtract(Integer num1, Integer num2){
        Integer result = num1 - num2;
        return result;

     }
     public Integer multiply(Integer num1, Integer num2){
        Integer result = num1 * num2;
        return result;

     }
     public Integer division(Integer num1, Integer num2){
        Integer result = num1/num2;
        return result;

     }
}

