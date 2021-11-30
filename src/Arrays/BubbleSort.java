package Arrays;

public class BubbleSort {
    /*Сортировка методом пузырька*/
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 5, 9, 7};
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                   int x =  arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = x;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
