public class FibFormula implements FindFib {
    @Override
    public int calculate_fib(int i) {
        int pt1 = (int) ((Math.pow(((1+Math.sqrt(5))/2),i) - (Math.pow(((1-Math.sqrt(5))/2),i)))/ Math.sqrt(5));
        return pt1;
    }
}
