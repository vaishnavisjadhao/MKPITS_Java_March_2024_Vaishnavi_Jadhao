package bike;


// 4.Child class TwoWheeler implementing MotorBike and Cycle interfaces
public class TwoWheeler extends Car implements MotorBike, Cycle{
//    Constructor
    public  TwoWheeler(String name) {
        super(name);
    }

//    Override methods from MotorBike
    @Override
    public void spped() {
        System.out.println("Speed: 90 km/hr");
    }

    @Override
    public void distance() {
        System.out.println("Distance: 50 meters");
    }
}
