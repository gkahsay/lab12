package recuresiveAssign;

public class ReversString {
    public static void main(String[] args){

     System.out.println(reverseStr("miu please"));
    }
    public static String reverseStr(String str){

        if((str==null) || (str.length()<1)){
            return str;
        }
        else {
            return reverseStr(str.substring(1)) + str.charAt(0);

        }
    }
}
