package dsa.matrix;

public class Zigzag {

    public static void main(String[] args) {
        int[][] arr =
                {{ 1, 2, 3 },
                {  4, 5, 6 },
                {  7, 8, 9 }};

        Zigzag obj = new Zigzag();
        int[] result = obj.findDiagonalOrder(arr);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }

    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int row = 0;
        int col = 0;
        int[] ans = new int[ m * n];
        boolean up = true;
        int idx = 0;

        while (row < m && col < n ){
            if(up){
                while(row > 0 && col < n-1){
                    ans[idx++] = mat[row][col];
                    row--;
                    col++;
                }
                ans[idx++] = mat[row][col];
                if(col == n-1){
                    row++;
                }else{
                    col++;
                }
            }else{
                while(row < m-1 && col > 0){
                    ans[idx++] = mat[row][col];
                    row++;
                    col--;
                }
                ans[idx++] = mat[row][col];
                if(row == m-1){
                    col++;
                }else{
                    row++;
                }
            }

            up = !up;
        }

        return ans;
    }
}
