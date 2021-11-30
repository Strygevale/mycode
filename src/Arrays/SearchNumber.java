package Arrays;

public class SearchNumber {
    /*Если нашел искомое число то 1, если нет, то вернет -1*/
    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 7, 5};
        System.out.println(search(arr, 4));
    }
    public static int search(int[] arr, int key){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                index = i;
                break;
            }
        }
        return index;
    }
}
