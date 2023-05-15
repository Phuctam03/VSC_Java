package iobinaryfile.demofile;

import java.io.Serializable;

public class Students implements Serializable {

    private int id;

    private String name;

    private double point;

    public Students() {
    }

    public Students(int id, String name, double point) {
        this.id = id;
        this.name = name;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Students [id=" + id + ", name=" + name + ", point=" + point + "]";
    }

    

}
