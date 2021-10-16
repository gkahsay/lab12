package recuresiveAssign;

public class SumOfArray {
    public static void main(String[] args){
        int[] arr = {12,43,4,6,8,76};
       // int size =arr.length;
        System.out.println(sumOfElements(arr,6));
    }
    public static int sumOfElements(int[] arr,int size){

        if(size==0){
            return 1;
        }
        else{
            return sumOfElements(arr , size-1)  + arr[size-1];
        }
    }
}
