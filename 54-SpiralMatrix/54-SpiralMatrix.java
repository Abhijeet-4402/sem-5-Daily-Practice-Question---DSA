// Last updated: 4/8/2025, 12:08:21 am
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> result = new ArrayList<>();
         int minC = 0, minR = 0, maxC = matrix[0].length-1, maxR = matrix.length-1;
         int total_elm = matrix.length*matrix[0].length, count = 0;
         
         
         while(count<total_elm){

            for(int i = minC; i <= maxC && total_elm > count; i++){
                result.add(matrix[minR][i]);
                count++;
            }
            minR++;

            for(int i = minR; i <= maxR && total_elm > count; i++){
                result.add(matrix[i][maxC]);
                count++;
            }
            maxC--;

            for(int i = maxC; i >= minC && total_elm > count; i--){
                result.add(matrix[maxR][i]);
                count++;
            }
            maxR--;

            for(int i = maxR; i >= minR && total_elm > count; i--){
                result.add(matrix[i][minC]);
                count++;
            }
            minC++;
         }
         return result;
    }
}