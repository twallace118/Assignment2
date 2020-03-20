/**Tyreace Wallace
*CSCI 1302
*Assignment 2
*03/14/2020
*/


public class Address{
  private int houseNum;
  private String streetName;
  private String city;
  
  public int gethouseNum(){
    return this.houseNum;
  }
  public void setHouseNum(int houseNum){
    this.houseNum = houseNum;
  }
  public String getstreetName(){
    return this.streetName;
  }
  public void setstreetName(String streetName){
    this.streetName = streetName;
  }
  public String getcity(){
    return this.city;
  }
  public void setcity(String city){
    this.city = city;
  }
  public String toString(){
    return houseNum + " " + streetName + "," + city;
  }
}
    
    