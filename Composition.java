public class Main{
    public static void main(String[] args){
    Car c  = new Car("Corvette",2025,"V8");

        System.out.println(c.model);
        System.out.println(c.year);
        System.out.println(c.engine.type);
        c.start();
    }
}

public class Car{
    String model;
    int year;
    Engine engine;
    Car(String model,int year,String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }
    void start(){
        this.engine.start();
        System.out.println("The "+this.model+" is running");
    }
}

public class Engine{
String type;

Engine(String type){
    this.type=  type;
}
void start(){
    System.out.println("You start the "+this.type+" engine");
}
}
