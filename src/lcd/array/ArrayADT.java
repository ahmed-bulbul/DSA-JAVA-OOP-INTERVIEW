package lcd.array;

import dsa.array.Array;

public class ArrayADT {

    private int array[];
    private int size;

    private int dynamicIncreaseSize = 10;
    private int index;

    public ArrayADT(int size){
        this.size = size;
        this.array = new int[this.size];
        index = 0;
    }

    public void insert(int data){
        if(array.length -1 == index){
            increaseArraySize();
        }
        this.array[index] = data;
        index++;
    }

    private void increaseArraySize() {
        // Create a new array with the increased size
        int[] newArray = new int[array.length + dynamicIncreaseSize];

        // Copy elements from the old array to the new array
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        // Reassign the new array to array
        array = newArray;
    }

    public void delete(int deleteIndex){
        if(deleteIndex < 0 || deleteIndex>index){
            System.out.println("Invalid index");
        }
        for(int i=deleteIndex;i<index - 1 ;i++){
            array[i] = array[i+1];
        }
        index--;
    }

    public void traverse(){
        for(int i=0;i<index;i++){
            System.out.println(array[i]);
        }
    }


    public static void main(String[] args) {
        ArrayADT adt = new ArrayADT(5);
        adt.insert(1);
        adt.insert(2);
        adt.insert(3);
        adt.insert(4);
        adt.insert(5);
        adt.insert(6);
        adt.traverse();
      //  adt.delete(2);
        System.out.println("------------------");
      //  adt.traverse();
    }




}
