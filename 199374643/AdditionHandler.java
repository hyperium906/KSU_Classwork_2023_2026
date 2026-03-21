public class AdditionHandler extends MathHandler{

    @Override
    public int arrayHandler(int[][] array) {
        int answer=0;
        for (int i = 0; i<array.length;i++){
            for (int j = 0; j<array[i].length;j++){
                answer += array [i][j];
            }
        }
        return answer;
    }
}
