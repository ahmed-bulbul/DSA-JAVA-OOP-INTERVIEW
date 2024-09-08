package dsa.level1;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        int space = n-1;
        int star = 1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            space--;
            star++;
            System.out.println();
        }
    }
}
