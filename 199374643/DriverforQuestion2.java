public class DriverforQuestion2 {
    public static void main(String[] args) {
        int[][] array ={{1,2}, {3,4}, {5,6}, {7,8}, {9, 10}};
        AdditionHandler one = new AdditionHandler();
        ProductHandler two = new ProductHandler();
        System.out.println(one.arrayHandler(array));
        System.out.println((two.arrayHandler(array)));
        array = new int[][]{{2, 2}, {3, 3}};
        System.out.println(one.arrayHandler(array));
        System.out.println((two.arrayHandler(array)));

    }
}
