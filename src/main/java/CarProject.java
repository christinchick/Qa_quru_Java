public class CarProject {

    // static class Cars {

        String NameModel;
        int Year;
        int VolumeEngine;
        int AverageSpeed;

        public void power() {
       if (VolumeEngine >= 2500) {
            System.out.println("Машина мощная " + NameModel + " можно ехать в путешествие");
            } else {
                System.out.println("Оставить машину " + NameModel + " для города");
                 }
        }

        public void way() {
            System.out.println(NameModel + " Доедет 1000км примерно за " + 1000 / AverageSpeed + " часов");
        }

        public void old(){
            if (Year > 2000) {
                System.out.println("Машина " + NameModel + " еще походит");}
            else if (Year < 2000 && Year > 1980){
                System.out.println("Мащина " + NameModel + " старой модели, и через 10 лет, когда она будет " + (Year + 10) + " года, придеться обновить");
            } else {
                System.out.println("Поздравляем! У Вас " + NameModel + " ретро автомобиль");}
        }
   // }
}





