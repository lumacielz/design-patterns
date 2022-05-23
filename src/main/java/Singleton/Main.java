package Singleton;

public class Main {
    public static void main(String[] args){
        Boiler boiler = Boiler.getInstance();
        boiler.fill();
        boiler.drain();
        Boiler boiler2 = Boiler.getInstance();
        boiler2.drain();
        boiler2.fill();
        boiler2.boil();
    }
}
