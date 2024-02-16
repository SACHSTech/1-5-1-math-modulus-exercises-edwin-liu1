class FtoC extends ConsoleProgram {

  /**
  * Description 1.5.1 - 7
  * @author:edwin_liu1
  */
  
  public void run() {
    
    int intCelsius;
    int intFahrenheit;

    intFahrenheit = readInt("Enter temperature in Fahrenheit: ");

    intCelsius = ( ( (double)intFahrenheit - 32) * 0.5556);

    System.out.println("The temperature in celsius is " + intCelsius);
    
  }
}