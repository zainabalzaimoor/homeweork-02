public class Homework2 {
    private static int total_calculations;
    protected static int last_result;
    public static String calculator_name = "My Calculator";
    public static int add(int a, int b){
        int sum = a+b;
        total_calculations++;
        last_result = sum;
        return sum;
    }
    protected static int subtract(int a, int b){
        int current_result = a-b;
        total_calculations++;
        last_result = current_result;
        return current_result;
    }
    private static void resetCalculator(){
        last_result = 0;
    }
    public static void monthlyReset(){
        resetCalculator();
    }
    public static void showTotalCalculations(){
        System.out.println("Total of calculations has been done so far: " + total_calculations);
    }
    public static void showLastResult(){
        int last_result = 75;
        System.out.println("Local last result is: "+ last_result); //locally
        System.out.println("Actual last result is: "+ Homework2.last_result);
    }

    public static void main(String[] args) {
        System.out.println("Calculator Name: " + calculator_name);
        int sum = add(5,7);
        int result = subtract(10,5);
        System.out.println("sum is: "+ sum);
        System.out.println("result of subtraction is: "+ result);
        showTotalCalculations();
        showLastResult();
        monthlyReset();
        showLastResult();
    }

}
