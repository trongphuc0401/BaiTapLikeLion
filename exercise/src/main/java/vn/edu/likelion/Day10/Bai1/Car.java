package vn.edu.likelion.Day10.Bai1;

import java.util.logging.Logger;

/**
 * Car -
 *
 * @param
 * @return
 * @throws
 */
public class Car extends Vehicle{
    Logger logger = Logger.getLogger(getClass().getName());
    int numberOfDoors;

    protected Car(int id, String name, int numberOfDoors) {
        super(id, name);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void move() {
        logger.info("Car is moving");
    }
}
