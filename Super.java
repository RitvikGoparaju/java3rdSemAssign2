// Roll Number : IMT2015047
class Vehicle 
{
  public int speed = 90;
}
class Bike extends Vehicle 
{
  public int speed = 50;
  void display()
  {
    System.out.println("Speed of the super vehicle is :"+super.speed);
  }
}
class Car extends Vehicle
{
  public int speed = 80;
  void display()
  {
    System.out.println("Speed of the super vehicle is :"+super.speed);
  }
}
class Bus extends Vehicle
{
  public int speed = 30;
  void display()
  {
    System.out.println("Speed of the vehicle is :"+super.speed);
  }
}
class Train extends Vehicle
{
  public int speed = 80;
  void display()
  {
    System.out.println("Speed of the vehicle is :"+super.speed);
  }
}
class Super 
{
  public static void main(String[] args) 
  {
    Bike bike1 = new Bike();
    Car car1 = new Car();
    Bus bus1 = new Bus();
    Train train1 = new Train();
    int value_1 = bike1.speed;
    int value_2 = car1.speed;
    int value_3 = bus1.speed;
    int value_4 = train1.speed;
    bike1.display();
    System.out.println("Speed of the bike is :"+value_1);
    car1.display();
    System.out.println("Speed of the car is :"+value_2);
    bus1.display();
    System.out.println("Speed of the bus is :"+value_3);
    train1.display();
    System.out.println("Speed of the train is :"+value_4);
  }
}
