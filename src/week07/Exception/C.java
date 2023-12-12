package week07.Exception;

public class C {
    int a=4;

    public C(int a) throws IllegalAccessException {
        if(a<0)
            throw new IllegalAccessException("");
            this.a = a;
    }

    public int getC() {
        return a;
    }
}
