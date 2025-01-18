package dsa.lcd.recursion;

public class TowerOfHanoi {


    static void TowerOfHanoi(int n, char source, char helper, char destination) {

        //base condition
        if(n==1){
            System.out.println("Move disk 1 from "+source+" to "+destination);
            return;
        }

        //recursive call
        TowerOfHanoi(n-1, source, destination, helper);
        System.out.println("Move disk "+n+" from "+source+" to "+destination);
        TowerOfHanoi(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        int n = 3;
        TowerOfHanoi(n, 'A', 'B', 'C');
    }
}
