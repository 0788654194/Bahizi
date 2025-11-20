public class ArrayPractice {

    public static void main(String[] args) {

        // One-dimensional array
        
        int[] firstArray = {10, 20, 30, 40, 50};

        System.out.println("One-dimensional array elements:");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("Element at index " + i + ": " + firstArray[i]);
        }

        
        // 2. Two-dimensional array
        
        int[][] SecondArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\nTwo-dimensional array elements:");
        for (int row = 0; row < SecondArray.length; row++) {
            for (int col = 0; col < SecondArray[row].length; col++) {
                System.out.println("Element at [" + row + "][" + col + "]: " + SecondArray[row][col]);
            }
        }
    }
}
