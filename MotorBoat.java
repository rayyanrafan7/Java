/*Rayyan Rafan, B00787787, CSCI 1101
This program will implement the MotorBoat class and then Test the MotorBoatDemo class.*/

//Source: This is entirely my own work. Obtained some help from the Teaching Assistant (TA), Class notes, Slides and the Book as well. The sources are provided where applicable in the output.  

public class MotorBoat {
   
   //private attributes of the class Boat
   
   private String name;
   private double capacity;
   private double fuelInTank;
   private double maxSpeed;
   private double currentSpeed;
   private double rateOfConsumption;
   private double distanceTravelled;
   
   // setters and getter methods of the class
   /*@return the name*/
   
   public String getName() {
      return name;
   }
   
   /*name to set*/
   
   public void setName(String name) {
      this.name = name;
   }
   
   /*@return the capacity*/
   
   public double getCapacity() {
      return capacity;
   }
   
   /*capacity to set*/
   
   public void setCapacity(double capacity) {
      this.capacity = capacity;
   }
   
   /*@return the amount*/
   
   public double getfuelInTank() {
      return fuelInTank;
   }
   
   /*the amount to set*/
   
   public void setfuelInTank(double amount) {
      this.fuelInTank = amount;
   }
   
   /*@return the maximumSpeed*/
   
   public double getMaximumSpeed() {
      return maxSpeed;
   }
   
   /*maximumSpeed to set*/
   
   public void setMaximumSpeed(double maximumSpeed) {
      this.maxSpeed = maximumSpeed;
   }
   
   /*@return the currentSpeed*/
   
   public double getCurrentSpeed() {
      return currentSpeed;
   }
   
   /*currentSpeed to set*/
   
   public void setCurrentSpeed(double currentSpeed) {
      this.currentSpeed = currentSpeed;
   }
   
   /*@return the rateOfConsumption*/
   
   public double getRateOfConsumption() {
      return rateOfConsumption;
   }
   
   /*rateOfConsumption to set*/
   
   public void setRateOfConsumption(double rateOfConsumption) {
      this.rateOfConsumption = rateOfConsumption;
   }
   
   /*@return the distanceTravelled*/
   
   public double getDistanceTravelled() {
      return distanceTravelled;
   }
   
   /*distanceTravelled to set*/
   
   public void setDistanceTravelled(double distanceTravelled) {
      this.distanceTravelled = distanceTravelled;
   }

   //Constructor
   
   public MotorBoat(String name,double capacity,double amount,double maxSpeed,double r) {
      this.name=name;
      this.capacity=capacity;
      this.fuelInTank=amount;
      this.maxSpeed=maxSpeed;
      this.currentSpeed=0.0;
      this.rateOfConsumption=r;
   }
   
   // method to change the current speed
   
   public void changeSpeed(double change) {
      if( currentSpeed + change > maxSpeed)
         currentSpeed = maxSpeed;
      currentSpeed = currentSpeed + change;
   }
   
   // method to operate the boat
   
   public void cruise(double timeInMins) {
      double d= currentSpeed * (timeInMins/60);
      distanceTravelled= d;
      fuelInTank = fuelInTank - rateOfConsumption*d;
   }
   
   //method to refuel the boat
   
   public void increaseFuel(double amountOfFuel) {
      if(fuelInTank + amountOfFuel > capacity)
         fuelInTank = capacity;
      fuelInTank += amountOfFuel;
   }
   
   // method to compare maxSpeed of two boats
   
   public boolean fasterBoat(MotorBoat mb) {
      boolean flag=false;
      if(this.maxSpeed > mb.maxSpeed)
         flag=true;
      if(flag)
         System.out.println("Fastest Boat: "+ this.name);
      else
         System.out.println("Fastest Boat: "+ mb.name);
      return flag;
   }
   
   // method to check if two boats are equal
   
   public boolean equals(MotorBoat mb) {
      boolean flag=false;
      if((this.maxSpeed == mb.maxSpeed ) && (this.capacity==mb.capacity) && (this.rateOfConsumption==mb.rateOfConsumption))
         flag=true;
      if(flag)
         System.out.println(this.name + " and " + mb.name + " are the same boat");
      else
         System.out.println(this.name + " and " + mb.name + " are not the same boat");
      return flag;
   }
   
   // Method to print the boat name, currentSpeed , distanceTravelled and fuel in Tank
   
   public String toString() {
      System.out.println("Name: "+name);
      System.out.println("Current Speed: "+ currentSpeed + " kmph");
      System.out.println("Distance Driven: "+ distanceTravelled + " km");
      System.out.println("Fuel in Tank: "+ fuelInTank + " liters");
      return null;
   }
}
