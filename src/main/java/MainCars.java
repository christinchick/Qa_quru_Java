public class MainCars {
    public static void main(String[] args) {
        CarProject Volvo = new CarProject();
        Volvo.NameModel = "S80";
        Volvo.Year = 2001;
        Volvo.VolumeEngine = 2500;
        Volvo.AverageSpeed = 160;

        CarProject Toyota = new CarProject();
        Toyota.NameModel = "Carina";
        Toyota.Year = 1989;
        Toyota.VolumeEngine = 1600;
        Toyota.AverageSpeed = 120;

        CarProject Ford = new CarProject();
        Ford.NameModel = "Mustang";
        Ford.Year = 1969;
        Ford.VolumeEngine = 3906;
        Ford.AverageSpeed = 180;

        Toyota.power();
        Ford.power();
        Volvo.way();
        Toyota.way();
        Ford.way();
        Toyota.old();
        Volvo.old();
        Ford.old();
    }
}
