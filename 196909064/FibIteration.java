public class FibIteration implements FindFib{
    @Override
    public int calculate_fib(int i) {
            if (i == 1 || i == 2) {
                return 1;}
            int current = 1;
            int previous = 1;
            int Final = 0;
            for (int j = 0; j <= i - 3; j++) {
                Final = current + previous;
                previous = current;
                current = Final;
            }
            return Final;
        }


    }

