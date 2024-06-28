package vn.edu.likelion.Day10.Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * VehicleDemo -
 *
 * @param
 * @return
 * @throws
 */
public class VehicleDemo {
    static Logger logger = Logger.getLogger(VehicleDemo.class.getName());
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        Car car = new Car(12,"Car A3",2);
        list.add(car);
        Bike bike = new Bike(13,"Bike A3",true);
        list.add(bike);

        for (Vehicle vehicle: list){
            vehicle.move();
        }
        logger.info("Numbers of vehicle: "+Vehicle.vehicleCount);


    }
}
