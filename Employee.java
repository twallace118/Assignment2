/**Tyreace Wallace
*CSCI 1302
*Assignment 2
*03/14/2020
*/

public class Employee{
  private String fname;
  private String lname;
  private double payRate;
  private static int employeeidNum = 800000001;
  private String employeeid;
  
  public Employee(String fname, String lname, double payRate, Address owner){
    setMake(make);
    this.fname = fname;
    this.lname = lname;
    this.payRate = payRate;
    this.owner = new Address(owner);
    employeeid = Interger.toString(employeeidNum);
    employeeidNum++;
    
  }
  public Address getHome(){
    return new Address(home);
  }
    
  public String toString(){
    return "The employee name is" fname + " " + lname + "," + "there pay rate is" 
      + payRate ". Also there address is " + home;
  }
    
  public class Work{
    static void myMethod(){
      System.out.println("workin' for the man");
    }
    public static void main(String[] args){
      myMethod();
    }
  }
    
    
  }