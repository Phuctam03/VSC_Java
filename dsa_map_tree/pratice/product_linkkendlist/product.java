package dsa_map_tree.pratice.product_linkkendlist;

public class product implements Comparable<product> {
    private int id;
    private String nameProduct;
    private double priceProduct;

    public product() {
    }

    public product(int id, String nameProduct, double priceProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", nameProduct=" + nameProduct + ", priceProduct=" + priceProduct + "]";
    }

    @Override
    public int compareTo(product o) {
        if (this.priceProduct > o.getPriceProduct()) {
            return 1;
        } else if (this.priceProduct < o.getPriceProduct()) {
            return -1;
        } else {
            return 0;
        }

    }

}
