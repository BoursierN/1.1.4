package org.pltw.examples.weather;


public class WeatherConditionals {

    public static String getWeatherAdvice(int temperature, String description){
        if (temperature >= 65 && description.equalsIgnoreCase("Cloudy")) {
            return "You're in San Jose.";
        }
        else if (description.equalsIgnoreCase("Fair")) {
            return "You're in Santa Fe.";
        }
        else if (description.equalsIgnoreCase("Hot")) {
            return "You're in Hell.";
        }
        else if (description.equalsIgnoreCase("Foggy")) {
            return "You're in San Francisco.";
        }
        else if (description.equalsIgnoreCase("Sunny")) {
            return "You're in San Bernardino.";
        }
        else {
            return "Bring an Umbrella!";
        }
    }

    public static String getHikingAdvice(int temperature, double windspeed, double humidity, String description){
        double feelsLike = 35.74 + 0.6215 * temperature - 35.75 * (Math.pow(windspeed, 0.16)) + 0.4275 * (Math.pow(windspeed, 0.16));
        if (description.toLowerCase().indexOf("snow") != -1 && feelsLike >= 100) {
            return ("It is snowing and also " + temperature + " degrees... is it the end times..?");
        }
        if (description.toLowerCase().indexOf("windy") != -1 || feelsLike <= 30)
        {
            return ("Too windy or cold! Enjoy watching the weather through the window.");
        }
        if (description.toLowerCase().indexOf("snow") != -1 ){
            return ("It is snowing, wouldn't recomend a hike.");
        }
        if (humidity > 68){
            return ("Uncomfortably humid");
        }
        return ("It's safe to go outside, " + feelsLike + " degrees and " + description + ".");
    }

}
