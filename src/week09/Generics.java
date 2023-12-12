package week09;

public class Generics<T1,T2> {
    public T1 x;
    public T2 y;

    public Generics(T1 x, T2 y) {
        this.x = x;
        this.y = y;
    }

    public T1 getX() {
        return x;
    }

    public void setX(T1 x) {
        this.x = x;
    }

    public T2 getY() {
        return y;
    }

    public void setY(T2 y) {
        this.y = y;
    }

//    @Override
//    public String toString() {
//        return "Generics{" + "x=" + x + ", y=" + y + '}';
//    }
}
