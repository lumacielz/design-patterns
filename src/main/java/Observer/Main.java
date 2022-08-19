package Observer;

public class Main {
    public static void main(String []args){
        WeatherData wheatherData =  new WeatherData();
        Observer display = new Display(wheatherData);
        wheatherData.setMeasurements(30,50,100);
    }
}
