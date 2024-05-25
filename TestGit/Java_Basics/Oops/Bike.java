package Oops;
import java.util.*;

public class Bike extends Base2{
  private int year;
  private double price;
  private String ownedby;
  
  public Bike(int year,double price,String ownedby){
    this.year = year;
    this.price = price;
    this.ownedby = ownedby;
    System.out.println("year: "+year);
    System.out.println("price: "+price);
    System.out.println("ownedby: "+ownedby);
  }
  
  public void Ride(String Brand,int speed){
    System.out.println("Riding the bike: "+Brand);
    System.out.println("Speed of a bike: "+speed);
  }
  

  public static void main (String[] args) {
    
    Bike bike1 = new Bike(2021,199000,"Hariesh");
    bike1.Ride("Honda CB 200x",142);
    Bike bike2 = new Bike(2024,126000,"Vamshi");
    bike2.Ride("Honda Shize sport 125",56);
    
    //calling inherited method
    bike1.test();
    
  }
}