/*Rayyan Rafan, B00787787, CSCI 1101
This program will implement the MotorBoat class and then Test the MotorBoatDemo class.*/

//Source: This is entirely my own work. Obtained some help from the Teaching Assistant (TA), Class notes, Slides and the Book as well. The sources are provided where applicable in the output.  

public class MotorBoatDemo {
   public static void main(String[] args) {
       
       // Instantiate two boat objects
       
      MotorBoat boat1 = new MotorBoat("Speedy",100.0,50.0,100.0,1.0);
      MotorBoat boat2 = new MotorBoat("Flippy",90.0,45.0,120.0,0.75);
      
       // Operate boat1 as described in the question.
       
      boat1.setCurrentSpeed(25.0);
      boat1.cruise(30);
      boat1.toString();
      boat1.changeSpeed(25);
      boat1.cruise(30);
      boat1.toString();
      
       // Operate boat2 as described in the question.
      boat2.setCurrentSpeed(45.0);
      boat2.cruise(20);
      boat2.toString();
      boat2.increaseFuel(50.0);
      boat2.changeSpeed(15);
      boat2.cruise(30);
      boat2.toString();
      boat1.fasterBoat(boat2);
      boat1.equals(boat2);
   }
}

