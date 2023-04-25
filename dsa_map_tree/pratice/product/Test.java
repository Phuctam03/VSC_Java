package dsa_map_tree.pratice.product;

public class Test {
    public static void main(String[] args) {
        Menu manaProduct = new Menu();
        manaProduct.myProduct.addProduct(new Product(001, "CSA", 650.1));
        manaProduct.myProduct.addProduct(new Product(002, "CSB", 150.1));
        manaProduct.myProduct.addProduct(new Product(003, "CSC", 550.1));
        manaProduct.myProduct.addProduct(new Product(004, "CSD", 850.1));

        manaProduct.list();
    }

}
