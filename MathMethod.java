public class MathMethod {

    // Method that return the sum 
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method that return the product 
    public static int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;

        int resSum = sum(num1, num2);
        int resProduct = product(num1, num2);

        System.out.println("Sum: " + resSum);
        System.out.println("Product: " + resProduct);
    }
}
