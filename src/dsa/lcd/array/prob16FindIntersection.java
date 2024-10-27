package dsa.lcd.array;

public class prob16FindIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1,3};
        int[] arr2 ={2, 2};

        if(arr1.length>arr2.length){
            int[] intersectionArray = new prob16FindIntersection().findIntersection(arr1,arr2);
            display(intersectionArray);
        }else{
            int[] intersectionArray = new prob16FindIntersection().findIntersection(arr2,arr1);
            display(intersectionArray);
        }

    }

    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    int[] findIntersection(int[] mArr,int[] sArr) {
        int[] intersectionArray = new int[sArr.length];
        int index = 0;
        for (int i = 0; i < mArr.length; i++) {
            for (int j = 0; j < sArr.length; j++) {
                if (mArr[i] == sArr[j]) {
                    intersectionArray[index++] = sArr[j];
                    break;
                }
            }
        }
        return intersectionArray;
    }

}
