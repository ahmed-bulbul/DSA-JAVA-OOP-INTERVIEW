package dsa.lcd.array;

public class prob19FindElmAppearsOne {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 4, 5, 3, 4};
        int uniqueElement = findSingleElement(array);

        System.out.println("The element that appears only once is: " + uniqueElement);
    }

    private static int findSingleElement(int[] array) {
        int result = 0;
        for(int i=0;i<array.length;i++){
            result  = result ^ array[i];
        }
        return result;
    }
}
