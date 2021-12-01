package Collections.ArrayLinked;

import java.util.ArrayList;
import java.util.LinkedList;
/*Сравнение быстродействия листов. Добавляем случайные 1000000 и 1000 числе в листы.
 Замеряем время, которое выбирает из заполненного списка эелемет наугад 1000000 раз*/
public class ArrayLinkedTest {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int N = 1000000;
        final int M = 1000;
        //заполняет листы случайными числами
        for(int i = 0; i < N; i++){
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < M; i++){
            arrayList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++){
            linkedList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
