package Singleton;

public class Boiler {
    private static Boiler boiler;

    private boolean empty;
    private boolean boiled;

    private Boiler(){
        empty = true;
        boiled = false;
    }

    public static Boiler getInstance(){
        if (boiler == null){
            boiler = new Boiler();
        }
        return boiler;
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }

    public void fill(){
        if (isEmpty()){
            empty = false;
            System.out.println("filling boiler...");
        }
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()){
            boiled = true;
            System.out.println("boiling...");
        }
    }

    public void drain(){
        if(!isEmpty()){
            empty = true;
            System.out.println("draining boiler...");
        }
    }
}
