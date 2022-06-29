package edu.designpatterns.structural.adapter;

public interface City {

  String getName();
  double getTemperature();
  String getTemperatureScale();
  boolean getHasWeatherWarning();
  void setHasWeatherWarning(boolean hasWeatherWarning);


}
