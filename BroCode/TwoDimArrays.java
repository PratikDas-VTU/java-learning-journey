public class TwoDimArrays {
    public static void main(String[] args) {

        // 2D array = An array where each element is an array
        // Useful for storing a matrix of data

        // String[] fruits = {"apple", "orange", "banana"};
        // String[] vegetables = {"potato", "onion", "carrot"};
        // String[] meats = {"chicken", "pork", "beef"};

        // String[][] groceries = {fruits,vegetables,meats};
        
        String[][] groceries = { { "apple", "orange", "banana" }, 
                                {"potato", "onion", "carrot" },
                                { "chicken", "pork", "beef" } };

        // Element alteration
        groceries[0][1] = "pineapple";
        groceries[1][2] = "turtle";

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

    }
}
