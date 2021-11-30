package Arrays;

public class MaxMin {

    /*Поиск максимального, минимального и среднего значения*/
    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 6, 7};
        System.out.println("max = " + max(arr));
        System.out.println("min = " + min(arr));
        System.out.println("avg = " + avg(arr));
    }

    public static int max(int[] arr){
        int x = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(x < arr[i])
                x = arr[i];
            }
            return x;
    }
    public static int min(int[] arr){
        int x = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(x > arr[i])
                x = arr[i];
        }
        return x;
    }

    public static int avg(int[] arr) {
        int x = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(x > arr[i])
                x += arr[i]/arr.length;
        }
        return x;
    }
}
