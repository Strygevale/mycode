package OOP.Vector;

public class Main {
    public static void main(String[] args) {

        Vector vectors = new Vector(10, 3, 7);
        Vector[] vectors2 = Vector.generate(10);
        System.out.println(vectors.lengthVector());
        System.out.println("======================");
        System.out.println(vectors2[0]);
        System.out.println(vectors2[1]);
        System.out.println(vectors2[0].lengthVector());
        System.out.println(vectors2[0].scalarVector(vectors2[1]));
        System.out.println(vectors2[0].cosVector(vectors2[1]));
        System.out.println(vectors2[0].sum(vectors2[1]));
        System.out.println(vectors2[0].sub(vectors2[1]));
        System.out.println(vectors2[0].productVector(vectors2[1]));
    }
}
