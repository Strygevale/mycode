package OOP.Vector;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

    //метод вычисляющий длину вектора
    public double lengthVector(){
        return Math.sqrt(x * x + y * y + z * z);
    }
    //метод вычисляющий скалярное произведение  x1x2 + y1y2 + z1z2
    public double scalarVector(Vector vector){
        return x * vector.x + y * vector.y + z * vector.z;
    }
    //метод вычисялющий векторное произведение с другим вектором
    public Vector productVector(Vector vector){
        return  new Vector(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
    }
    //косинус угла между векторами
    public double cosVector(Vector vector){
        return scalarVector(vector) / (lengthVector() * vector.lengthVector());
    }

    public Vector sum(Vector vector){
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector sub(Vector vector){
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    /*Статический метод, который принимает целое число n, и возвращает массив случайных векторов*/
    public static Vector[] generate(int n){
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++){
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
