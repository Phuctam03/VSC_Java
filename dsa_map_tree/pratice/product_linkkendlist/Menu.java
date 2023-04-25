package dsa_map_tree.pratice.product_linkkendlist;

import java.util.Scanner;

public class Menu {
    ManagementProdcut myProduct = new ManagementProdcut();
    Scanner sc = new Scanner(System.in);

    void addProduct() {
        int id;
        String nameProduct;
        double priceProduct;

        System.out.println("Enter the Id :");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the nameProduct");
        nameProduct = sc.nextLine();
        System.out.println("Enther the priceProduct");
        priceProduct = Double.parseDouble(sc.nextLine());
        myProduct.addProduct(new product(id, nameProduct, priceProduct));
    }

    void displayProduct() {
        myProduct.displayProduct();
    }

    void deleteProductbyid() {
        System.out.println("The id need to delete : ");
        if (myProduct.deleteProduct(Integer.parseInt(sc.nextLine()))) {
            System.out.println("delete Successfully");
        } else {
            System.out.println("the idn't exist");
        }
    }

    void editProductbyid() {
        System.out.println("Enter id need edit");
        product p = myProduct.editProduct(Integer.parseInt(sc.nextLine()));
        if (p != null) {
            System.out.println(p.toString());
        } else {
            System.out.println("The id not exsit");
        }
    }

    void searchProductbyName() {
        System.out.println("Enter nameProduct need  to Find");
        product p = myProduct.searchProducttoName(sc.nextLine());
        if (p != null) {
            System.out.println(p.toString());
        } else {
            System.out.println("The name not exsit");
        }
    }

    void sortBypriceAcs() {
        myProduct.sortByAcs();
    }

    void sortBypriceDsc() {
        myProduct.sortBtDsc();
    }

    void list() {
        int luachon;
        while (true) {
            try {
                System.out.println("1.Display List Product");
                System.out.println("2.Add Product");
                System.out.println("3.Edit product by id");
                System.out.println("4.Delete product by id");
                System.out.println("5.Find product by name ");
                System.out.println("6.ASC product");
                System.out.println("7.DSC product");
                System.out.println("8.select 8 exit program");
                luachon = Integer.parseInt(sc.nextLine());
                switch (luachon) {
                    case 1:
                        displayProduct();
                        break;
                    case 2:
                        addProduct();
                        break;
                    case 3:
                        editProductbyid();
                        break;
                    case 4:
                        deleteProductbyid();
                        break;
                    case 5:
                        searchProductbyName();
                        break;
                    case 6:
                        sortBypriceAcs();
                        break;
                    case 7:
                        sortBypriceDsc();
                        break;
                    case 8:
                        System.exit(0);
                }

            } catch (Exception e) {
                System.out.println("enter fails ");
            }
        }

    }

    public static void main(String[] args) {
        Menu manaProduct = new Menu();
        manaProduct.myProduct.addProduct(new product(001, "CSA", 650.1));
        manaProduct.myProduct.addProduct(new product(002, "CSB", 150.1));
        manaProduct.myProduct.addProduct(new product(003, "CSC", 550.1));
        manaProduct.myProduct.addProduct(new product(004, "CSD", 850.1));

        manaProduct.list();

    }

}
