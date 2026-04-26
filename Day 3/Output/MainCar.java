class Car{
private String color;
private int speed;

public void setData(String color,int speed){
this.color=color;
this.speed=speed;
}
public void drive()
{
System.out.println("color" + color);
System.out.println("speed" + speed);

}

}

class MainCar{

public static void main(String[] args){
Car car1=new Car();
car1.setData("Red",100);
car1.drive();

Car car2=new Car();
car2.setData("blue",1000);
car2.drive();




}

}