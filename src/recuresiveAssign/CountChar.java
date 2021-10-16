package recuresiveAssign;

public class CountChar {
    public static void main(String[] args){

        System.out.println(countCharacter("Armana"));
    }
    public static int countCharacter(String str){
        //base case
        if(str.equals("")){
            return 0;
        }
        else{
            return 1 + countCharacter(str.substring(1));
        }
    }
}
