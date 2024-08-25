package patterns.prefixSum;

public class RangeSumQuery {
    public int[] arr2;
    public RangeSumQuery(int[] arr) {
        arr2 = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i + 1] = arr2[i] + arr[i];
        }
    }

    public int query(int l, int r) {
        return arr2[r + 1] - arr2[l];
    }

    public static void main(String[] args) {
        //calling range sum query
        int[] arr = {1, 2, 3, 4, 5};
        RangeSumQuery obj = new RangeSumQuery(arr);
        System.out.println(obj.query(1, 3));
    }
}
