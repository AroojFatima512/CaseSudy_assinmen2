package CaseStudy;

import java.net.ServerSocket;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        InventoryManagement management = new InventoryManagement();

        Laptops l1 = new Laptops("Lenovo", 70000, 20, "10000", 500, 5, "CPU", 16, 2);
        Laptops l2 = new Laptops("Dell", 50000, 40, "8000", 600, 2, "ciu", 4, 3);
        Laptops l3 = new Laptops("Hp", 60000, 30, "12000", 800, 3, "mos", 8, 1);
        Laptops l4 = new Laptops("Mac", 100000, 10, "30000", 300, 10, "dop", 32, 5);

        SmartPhone s1 = new SmartPhone("Iphone Pro Max 14", 200000, 5, "10000", 1000, 4, "Mac", 128, 200);
        SmartPhone s2 = new SmartPhone("SamSung", 80000, 20, "8000", 500, 10, "Mac", 256, 100);
        SmartPhone s3 = new SmartPhone("Vivo", 60000, 15, "5000", 300, 5, "Mac", 32, 150);
        SmartPhone s4 = new SmartPhone("Oppo", 50000, 10, "7000", 800, 7, "Mac", 64, 170);

        Fruits f1=new Fruits("Mango", 500, 15, "50", 25, "Rich in vitamin A, fiber" );
        Fruits f2=new Fruits("Apple", 200, 10, "20", 5, "High in vitamins K and C, fiber");
        Fruits f3=new Fruits("Grapes", 300, 60, "30", 20, "Excellent source of iron, vitamin C" );
        Fruits f4=new Fruits("Banana", 400, 12, "10", 10, "Rich in vitamin C, low in calories" );

        Vegetables v1= new Vegetables("Carrot", 500, 10, "45", 6, "Rich in Magnesium");
        Vegetables v2= new Vegetables("Potato", 300, 5, "45", 5, "Rich in Potassium");
        Vegetables v3= new Vegetables("Cabbage", 200, 12, "45", 21, "Rich in Calcium");
        Vegetables v4= new Vegetables("Peas", 400, 62, "45", 12, "Rich in vitamin C, low in calories");

        Dairy d1 = new Dairy("Milk", 500, 100, "50", 14, "Rich in Calcium and Minerals");
        Dairy d2 = new Dairy("Cheese", 800, 50, "80", 30, "Rich in Calcium and Minerals");
        Dairy d3 = new Dairy("Yogurt", 200, 80, "20", 27, "Rich in Calcium and Minerals");
        Dairy d4 = new Dairy("Cream Cheese", 1000, 20, "100", 13, "Rich in Calcium and Minerals");

        Chairs c1 = new Chairs("Coffee Chair", 1000, 20, "10", "Wood", 2 );
        Chairs c2 = new Chairs("Study Chair", 3000, 30, "40", "Metal", 3 );
        Chairs c3 = new Chairs("Office Chair", 2000, 55, "70", "Iron", 1 );
        Chairs c4 = new Chairs("Cafe Chair", 500, 75, "80", "Steel", 6 );

        Product temp =l1;

       management.AddProduct(l1);
       management.AddProduct(l2);
       management.AddProduct(l3);
       management.AddProduct(l4);

       management.AddProduct(s1);
       management.AddProduct(s2);
       management.AddProduct(s3);
       management.AddProduct(s4);

       management.AddProduct(f1);
       management.AddProduct(f2);
       management.AddProduct(f3);
       management.AddProduct(f4);

       management.AddProduct(v1);
       management.AddProduct(v2);
       management.AddProduct(v3);
       management.AddProduct(v4);

       management.AddProduct(c1);
       management.AddProduct(c2);
       management.AddProduct(c3);
       management.AddProduct(c4);

       management.AddProduct(d1);
       management.AddProduct(d2);
       management.AddProduct(d3);
       management.AddProduct(d4);

        management.display();
        System.out.println();

        System.out.println("After Deletion: ");
        management.DeleteProduct(l2);
        management.DeleteProduct(f3);
        management.DeleteProduct(v4);
        management.DeleteProduct(s2);
        management.DeleteProduct(d4);
        management.DeleteProduct(c3);

        management.display();
        System.out.println();

        System.out.println("SEARCHING USING INDEX");
        management.SearchProduct(1);
        management.SearchProduct(10);
        management.SearchProduct(7);
        System.out.println();

        System.out.println("SEARCHING USING NAME");
        management.SearchProduct("Lenovo");
        management.SearchProduct("Mango");
        management.SearchProduct("Peas");
        System.out.println();

        //lowstock method displays product that are less than 20 in amount in store
        System.out.println("LOW SOCK PRODUCTS");
        management.lowStock();

        System.out.println("The Student Matches: "+l1.equals(v2));
    }
}