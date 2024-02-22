class Power extends ConsoleProgram {

  /**
  * Description 1.5.1 - 9
  * @author:edwin_liu1
  */
  
  public void run() {
    
    double dblNumber;
    double dblPower;
    double dblEndNumber;

    dblNumber = readDouble("Enter a number you want powered: ");
    dblPower = readDouble("Enter the power for the number: ");

    dblEndNumber = Math.pow(dblNumber, dblPower);

    System.out.println("your final number is " + dblEndNumber);
    
  }
}