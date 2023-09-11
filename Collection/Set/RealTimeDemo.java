
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Laptop {

    String prodName = null;
    String prodBrand = null;
    int prodPrice = 0;
    double prodRating = 0.0;

    Laptop(String prodName,String prodBrand, int prodPrice, double prodRating) {

        this.prodName = prodName;
        this.prodBrand = prodBrand;
        this.prodPrice = prodPrice;
        this.prodRating = prodRating; 

    }

    public String toString() {

        return "{" + prodName + ":" + prodBrand + ":" + prodPrice + ":" + prodRating + "}";

    }
}

class SortByProdName implements Comparator<Laptop> {

    public int compare(Laptop obj1, Laptop obj2) {

        return obj1.prodName.compareTo(obj2.prodName);

    }
}

class SortByProdBrand implements Comparator<Laptop> {

    public int compare(Laptop obj1, Laptop obj2) {

        return obj1.prodBrand.compareTo(obj2.prodBrand);
    }
}

class SortByProdPrice implements Comparator<Laptop> {

    public int compare(Laptop obj1, Laptop obj2) {

        return obj1.prodPrice - obj2.prodPrice;
    }
}

class SortByProdRating implements Comparator<Laptop> {

    public int compare(Laptop obj1, Laptop obj2) {

        return (int) (obj1.prodRating - obj2.prodRating);

    }
}

class UserListSortDemo {

    public static void main(String[] args) {
        
        ArrayList<Laptop> al = new ArrayList<>();

        al.add(new Laptop("HP Pavillian", "HP", 55000, 9.5));
        al.add(new Laptop("AsusViviBook", "Asus", 34900, 9.0));
        al.add(new Laptop("HP ChromeBook", "HP", 56900, 9.7));
        al.add(new Laptop("Mac Book Pro", "APPLE", 309000, 9.8));
        al.add(new Laptop("Lenova Legion", "Lonovo", 80000, 9.8));


        System.out.println("Before Sorting : \n" + al);

        System.out.println();

        Collections.sort(al, new SortByProdName());
        System.out.println("Sorting by Product Name : \n" + al);

        System.out.println();

        Collections.sort(al, new SortByProdBrand());
        System.out.println("Sort By Product Brand : \n" + al);

        System.out.println();

        Collections.sort(al, new SortByProdPrice());
        System.out.println("Sort By Product Price : \n" + al);

        System.out.println();

        Collections.sort(al, new SortByProdRating());
        System.out.println("Sort By Product Rating : \n" + al);

        
    }
}
