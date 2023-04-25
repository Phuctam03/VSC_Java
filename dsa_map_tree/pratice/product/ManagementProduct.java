package dsa_map_tree.pratice.product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagementProduct {
    ArrayList<Product> myProduct = new ArrayList<>();

    public ManagementProduct() {
    }

    public ArrayList<Product> getMyProduct() {
        return myProduct;
    }

    public void setMyProduct(ArrayList<Product> myProduct) {
        this.myProduct = myProduct;
    }

    void addProduct(Product product) {
        myProduct.add(product);
    }

    Product editProduct(int id) {
        Scanner sc = new Scanner(System.in);
        for (Product product : myProduct) {
            if (product.getId() == id) {
                System.out.println("Re-enter nameProduct :");
                product.setNameProduct(sc.nextLine());
                System.out.println("Re-enter priceProduct");
                product.setPriceProduct(Double.parseDouble(sc.nextLine()));
            }
            return product;
        }
        return null;
    }

    Boolean deleteProduct(int id) {
        for (Product product : myProduct) {
            if (product.getId() == id) {
                myProduct.remove(product);
                return true;
            }
        }
        return false;
    }

    void displayProduct() {
        for (Product product : myProduct) {
            System.out.println(product.toString());
        }
    }

    Product searchProducttoName(String nameProducts) {
        for (Product product : myProduct) {
            if (product.getNameProduct().equalsIgnoreCase(nameProducts)) {
                return product;
            }
        }
        return null;
    }

    void sortByAcs() {
        Collections.sort(this.myProduct);
        displayProduct();
    }

    void sortBtDsc() {
        Collections.sort(this.myProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPriceProduct() < o2.getPriceProduct()) {
                    return 1;
                } else if (o1.getPriceProduct() > o2.getPriceProduct()) {
                    return -1;
                } else {
                    return 0;
                }
            }

        });
        displayProduct();
    }

}
