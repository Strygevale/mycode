package Arrays;
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[][] arr2 = new int[2][4];
        int n = 1;
        //нумеруем элементы
        for(int i = 0, j = 1; i < arr.length; i++, j++){
            arr[i] = j;
        }
        //выводим значения
        for(int i : arr){
            System.out.print(i);
        }
            System.out.println(" ");

        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }
        System.out.println(" ");
        System.out.println("------");
        //пронумеруем двумерный массив
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2.length; j++){
                arr2[i][j] = n;
                n++;
            }
        }
        //выводим
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2.length; j++){
                System.out.print(arr2[i][j]);
            }
        }
        System.out.println(" ");
        System.out.println(Arrays.deepToString(arr2));

    }

}
