public class ProductHandler extends MathHandler {
    @Override
    public int arrayHandler(int[][] array) {
        int answer=1;
        for (int i = 0; i<array.length;i++){
            for (int j = 0; j<array[i].length;j++){
                answer *= array [i][j];
            }
        }
        return answer;
    }
}
