package recuresiveAssign;

public class FindSmallest {
    public static void main(String[] args){
       int [] arr ={43,34,54,2,-9,9,8};
       int size = arr.length;
       System.out.println(minElement(arr,size));
    }
    public static int minElement(int[] arr, int size){

        if(size==0){
            return 0;
        }
        else{
            return Math.min(arr[size-1],minElement(arr,size-1));
        }
    }
}
