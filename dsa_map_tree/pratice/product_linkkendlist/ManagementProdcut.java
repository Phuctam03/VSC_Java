package dsa_map_tree.pratice.product_linkkendlist;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagementProdcut {
    LinkedList<product> myProduct = new LinkedList<>();

    public ManagementProdcut() {
    }

    void addProduct(product product) {
        myProduct.add(product);
    }

    product editProduct(int id) {
        Scanner sc = new Scanner(System.in);
        for (product product : myProduct) {
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
        for (product product : myProduct) {
            if (product.getId() == id) {
                myProduct.remove(product);
                return true;
            }
        }
        return false;
    }

    void displayProduct() {
        for (product product : myProduct) {
            System.out.println(product.toString());
        }
    }

    product searchProducttoName(String nameProducts) {
        for (product product : myProduct) {
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
        Collections.sort(this.myProduct, new Comparator<product>() {
            @Override
            public int compare(product o1, product o2) {
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
