class Car
{
int maxspeed;
Car()
{
maxspeed=70;
}
protected void finalize()
{
System.out.println("class car has no future scope");
}
}



class Bike
{
int maxspeed;
Bike()
{
maxspeed=50;
}
protected void finalize()
{
System.out.println("class bike has no future scope");
}
}



class Garbage_collection
{
public static void main(String args[])
{
Car c=new Car();
c=null; // null means has no future use or no longer in use hence clears it

Bike b = new Bike();

System.gc();

System.out.println("Speed of Bike:"+b.maxspeed);



}
}



