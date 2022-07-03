package edu.designpatterns.structural.adapter;

public class Adapter implements City {
//
//    public static double MAX_TEMPERATURE = 38;
//    public static double MIN_TEMPERATURE = -9;
//
//    public Adapter() {
//    }
//
//    @Override
//    public void postWarning(City city) {
//        if(city.getTemperature() >= MAX_TEMPERATURE || city.getTemperature() <= MIN_TEMPERATURE) {
//            System.out.println("Warning! Current temperature in " +city.getName()
//                    + " is " + city.getTemperature() + " " + city.getTemperatureScale());
//            city.setHasWeatherWarning(true);
//        } else {
//            System.out.println("Temperature in " + city.getName() + " is OK.");
//        }
//
//    }


  private final City city;

    public Adapter(City city) {
        this.city = city;
    }

    public String getName() {
        return city.getName();
    }

    public double getTemperature() {
        return city.getTemperature() * 1.8 +32;
    }

    public String getTemperatureScale() {
        return "Fahrenheit";
    }

    public boolean getHasWeatherWarning() {
        return city.getHasWeatherWarning();
    }

    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        city.setHasWeatherWarning(hasWeatherWarning);
    }

}
