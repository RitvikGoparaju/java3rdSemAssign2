package pkg3rdsem.assign2;

// Roll Number : IMT2015047.
class Demo
{
  class InnerDemo
  {
    void Display()
    {
      System.out.println("The message is from the Inner Class.");
    }
  }
  void Display()
  {
    System.out.println("The message is from the Outer Class.");
  }
}
class Test
{
  public static void main(String[] args) 
  {
    Demo d1 = new Demo();
    Demo.InnerDemo d2 = d1.new InnerDemo();
    d1.Display();
    d2.Display();
  }
}
