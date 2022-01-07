public class MainCars {
    public static void main(String[] args) {
        Car_Project.Cars Volvo = new Car_Project.Cars();
        Volvo.NameModel = "S80";
        Volvo.Year = 2001;
        Volvo.VolumeEngine = 2500;
        Volvo.AverageSpeed = 160;

        Car_Project.Cars Toyota = new Car_Project.Cars();
        Toyota.NameModel = "Carina";
        Toyota.Year = 1989;
        Toyota.VolumeEngine = 1600;
        Toyota.AverageSpeed = 120;

        Car_Project.Cars Ford = new Car_Project.Cars();
        Ford.NameModel = "Mustang";
        Ford.Year = 1969;
        Ford.VolumeEngine = 3906;
        Ford.AverageSpeed = 180;

        Toyota.Power();
        Ford.Power();
        Volvo.Way();
        Toyota.Way();
        Ford.Way();
        Toyota.Old();
        Volvo.Old();
        Ford.Old();
    }
}
