/*
 
 Zachary Hanna
 January 27, 2017
 Desc:  This program retrieves data from the user and calculates which option for pizza would give the best bang for their buck.
        This information includes length, width, radius, and other dimentional attributes. The program tells the user if a large
        pizza is a better deal, size and price wize, than a smaller pizza.
 
*/ 

import java.util.Scanner; // library required for use of keyboard

public class PizzaPricePerSquareInch 
{

  public static void main(String[] args) 
  {
    String input; // declared variables
    char repeat;
    double pizzaOne, pizzaTwo;
  
  Scanner keyboardInput = new Scanner(System.in); // allows for input from keyboard
    
    do // do while loop to tell user which option saves the most money
    {
      pizzaOne = getPizza(1);
      pizzaTwo = getPizza(2);
      
      if(pizzaOne > pizzaTwo) // if else statement to tell user which pizza is cheaper
      {
        System.out.println("Pizza 2 will cost you less money.");
      }
      else 
        System.out.println("Pizza 1 will cost you less money.");
        
    
      System.out.println("Would you like to continue? (Y/N)"); // asks user whether or not to continue
      input = keyboardInput.nextLine(); // user enters choice 
      repeat = input.charAt(0);
    
    }while(repeat == 'Y' || repeat == 'y'); // available options to repeat program  
  }
  
public static double getPizza(int number) 
{
  double widthOfRectanglePizza, lengthOfRectanglePizza, priceOfRectanglePizza, 
    areaOfRectanglePizza, pricePerSquareInchRectanglePizza = 0;
  double sizeOfRoundPizza, priceOfRoundPizza, radiusOfRoundPizza, areaOfRoundPizza, pricePerSquareInchCirclePizza = 0;
  int pizzaChoice;
  // above are declared vaiables needed for data storage and calculations
  
  Scanner keyboardInput = new Scanner(System.in);
  System.out.println("For pizza # " + number + " pick one of the options below."); // asks user for specific type of pizza
  System.out.println("Type '0' for a rectangular shaped pizza. Type '1' for a circular shaped pizza:");
  pizzaChoice = keyboardInput.nextInt(); // allows user to pick their option
  
  if (pizzaChoice == 0){
    System.out.println("Enter the width of the rectangular pizza " + number + ".");
    widthOfRectanglePizza = keyboardInput.nextDouble();
    System.out.println("Enter the length of the rectagular pizza " + number + ".");
    lengthOfRectanglePizza = keyboardInput.nextDouble();
    System.out.println("Enter the price of the rectangular pizza " + number + ".");  
    priceOfRectanglePizza = keyboardInput.nextDouble();
    // the code above asks the user for info needed to calculate efficiency and stores data
        
    areaOfRectanglePizza = lengthOfRectanglePizza * widthOfRectanglePizza; // calculations for area of pizza
    pricePerSquareInchRectanglePizza = priceOfRectanglePizza/areaOfRectanglePizza; //calculation for price by sq inch
    return pricePerSquareInchRectanglePizza;
  }
      
  else if (pizzaChoice == 1)
      
  {
    System.out.println("Enter the size of the circular pizza " + number + ".");       
    sizeOfRoundPizza = keyboardInput.nextDouble();       
    System.out.println("Enter the price of the circular pizza " + number + ".");     
    priceOfRoundPizza = keyboardInput.nextDouble();       
    // the code above asks the user for info needed to calculate efficiency and stores data
    
    radiusOfRoundPizza = sizeOfRoundPizza / 2;    // calculates radius of pizza   
    areaOfRoundPizza = 3.14159 * radiusOfRoundPizza * radiusOfRoundPizza;  // calculates are of pizza 
    pricePerSquareInchCirclePizza =  priceOfRoundPizza/areaOfRoundPizza; // calculates price per sq inch
    return pricePerSquareInchCirclePizza;
  }      
  else       
  {        
    System.out.println("Your choice was invalid. Try again."); // user didnt enter 0 or 1, need to try again
    return -1;
  }
}
}