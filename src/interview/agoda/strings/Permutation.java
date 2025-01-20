package interview.agoda.strings;

public class Permutation {

    public static void main(String[] args) {
        String str = "abc";
        permute(str,"");
    }

    private static void permute(String str, String prefix) {

        if(str.length() == 0){
            System.out.println(prefix);
        }else{
            for(int i=0;i<str.length();i++){
                String rem = str.substring(0,i) + str.substring(i+1);
                permute(rem,prefix + str.charAt(i));
            }
        }
    }
}
