package vn.edu.likelion.Day10.Bai1;

import java.util.logging.Logger;

/**
 * Bike -
 *
 * @param
 * @return
 * @throws
 */
public class Bike extends Vehicle{

    Logger logger = Logger.getLogger(getClass().getName());

    private boolean hasGear;

    protected Bike(int id, String name, boolean hasGear) {
        super(id, name);
        this.hasGear = hasGear;
    }

    @Override
    void move() {
    logger.info("Bike ís moving");

    }
}
