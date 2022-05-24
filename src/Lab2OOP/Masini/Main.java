package Lab2OOP.Masini;

public class Main {
    public static void main(String[] args) {
        DrivingCar carA = new AudiA4(new Engine());
        carA.drive();
        System.out.println();
//        car.drive(new Engine(){
//            @Override
//            public void drive(){
//                super.drive();
//                System.out.println("Drive fast using turbo.");
//            }
//        });

        Car carB = new BmwF30(new Engine());
        carB.drive();
        System.out.println();

        Car carM = new MercedesCClass(new Engine());
        carM.drive();
        carM.start();
        carM.stop();
        System.out.println();

    }
}