package dsa.matrix;

public class BasicMatrix {

    public static void main(String[] args) {
        BasicMatrix obj = new BasicMatrix();
      //  obj.accessElement(obj.arr);
        //obj.searchElement(obj.arr, 5);
        //obj.addMatrix(obj.arr, obj.arr);
        obj.rotate180(obj.arr);
    }
    int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

    //Accessing elements of a matrix
    public void accessElement(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //searching an element in a matrix
    public void searchElement(int[][] arr, int key){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == key){
                    System.out.println("Element found at index: "+i+"-"+j);
                    return;
                }
            }
        }
        System.out.println("Element not found");
    }

    //Adding two matrices
    public void addMatrix(int[][] arr1, int[][] arr2){
        if(arr1.length != arr2.length || arr1[0].length != arr2[0].length){
            System.out.println("Matrices can't be added");
            return;
        }
        int[][] res = new int[arr1.length][arr1[0].length];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                res[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        accessElement(res);
    }

    //rotate 180 degree
    public void rotate180(int[][] arr){

        int new_arr[][] = new int[arr.length][arr[0].length];
        int m = arr.length;
        int n = arr[0].length;
        for(int i=m-1; i>=0;i--){
            for(int j=n-1; j>=0;j--){
                new_arr[m-1-i][n-1-j] = arr[i][j];
            }

        }

        accessElement(new_arr);

    }
}
