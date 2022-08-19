package Observer;

public class Display implements Observer{
    private Subject wheatherData;

    public Display(Subject wheatherData){
        this.wheatherData = wheatherData;
        wheatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Temperature updated to " + temp);
        System.out.println("Humidity updated to " + humidity);
        System.out.println("Pressure updated to " + pressure);
    }
}
