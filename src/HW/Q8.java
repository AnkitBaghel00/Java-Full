package HW;

public class Q8 {
    public static void main(String[] args) {
        int arr[] ={1,2,4,3,9};
        minMax(arr);

    }

    public static void minMax(int arr[]){

        int min=arr[0];
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            } else if (arr[i] < min){
                min =arr[i];
            }

        }
        System.out.println("Max :"+max);
        System.out.println("Min :"+min);
    }
}
