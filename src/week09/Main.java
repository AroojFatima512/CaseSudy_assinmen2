package week09;

public class Main {
    public static void main(String[] args) {
        Generics<Integer, String> generics= new Generics<>(3,"A");
//        System.out.println(generics);
        Integer g = generics.getX();
        System.out.println(g);
    }
}
