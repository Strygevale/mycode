package Arrays;


import java.util.Arrays;
/*Переворачивание массива*/
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr){
        int x = 0;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--){
            x = arr[i];
            arr[i] = arr[j];
            arr[j] = x;
        }
    }
}


