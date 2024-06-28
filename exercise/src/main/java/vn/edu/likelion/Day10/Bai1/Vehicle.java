package vn.edu.likelion.Day10.Bai1;

/**
 * Vehicle -
 *
 * @param
 * @return
 * @throws
 */
public abstract class Vehicle {
    protected String name;
    protected final int id;
    static int vehicleCount;


    protected Vehicle(int id, String name) {
        this.id = id;
        this.name = name;
        vehicleCount++;
    }

    abstract void move();
}
