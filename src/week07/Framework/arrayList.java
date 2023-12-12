package week07.Framework;


import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(12);
        l2.add(14);
        l2.add(16);
        l2.add(18);
        l1.add(2);
        l1.add(5);
        l1.add(4);
        l1.add(7);
        l1.add(9);
        l1.add(5);
        l1.add(3, 1); //Just adds the number to specific index
        l1.addAll(l2);
//        l1.clear();
//        System.out.println(l1.isEmpty());
//        l1.remove(5);
//        System.out.println(l1.contains(4));
//        System.out.println(l1.get(4));
        System.out.println(l1.set(2,0)); //Rreplace that number and then adds the no
        System.out.println(l1.indexOf(4));
        System.out.println(l1.lastIndexOf(5));
       for(int i=0; i< l1.size(); i++) {
           System.out.print(l1.get(i) + ", ");

       }

    }
}
