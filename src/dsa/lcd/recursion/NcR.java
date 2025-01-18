package dsa.lcd.recursion;

public class NcR {

    static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }

    //ncr
    static int ncr(int n, int r){
        if(r>n) return 0;
        return fact(n)/(fact(r)*fact(n-r));
    }

    static long ncrRecursive(int n, int r){
        if(n==r || r==0){
            return 1;
        }

        if(r>n) return 0;


        return ncrRecursive(n-1,r-1)+ncrRecursive(n-1,r);
    }
    public static void main(String[] args) {

        System.out.println(ncr(3,2));
        System.out.println(ncrRecursive(3,2));

    }
}
