
class Vehicle{

String model,make,fuel;
int year;
Vehicle(String model,String make,String fuel,int year)
{
    this.model=model;
    this.make=make;
    this.fuel=fuel;
    this.year=year;
    System.out.println(model);
}
void maxspeed()
{
    return ;
}
}
class Truck extends Vehicle
{

    Truck(String model, String make, String fuel, int year) {
        super(model, make, fuel, year);

    }
    void maxspeed()
    {
        System.out.println(model);
        System.out.println("Max Speed of Truck is : " + model + fuel);
    }
    
}


class Car extends Vehicle
{
    Car(String model, String make, String fuel, int year) {
        super(model, make, fuel, year);

    }
    void maxspeed()
    {
        System.out.println("Max Speed of Car is : " + model + fuel);
    }
    
}


public class Nineteen {
    public static void main(String[] args) {
        Truck t = new Truck("ab", "cd", "Diesel", 2000);
        t.maxspeed();
        Car c = new Car("Mahindra", "abc", "Petrol", 2300);
        c.maxspeed();
    }
}
