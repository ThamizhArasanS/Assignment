package finalandstatic;

public class Car {

    final int speedLimit=170;

   final void run ()
    {
        //speedLimit=200;
        System.out.println("speed limit of this car is : "+speedLimit);
    }

    public  void  gear()
    {
        System.out.println("car is running at 100km/hr");
    }

}
