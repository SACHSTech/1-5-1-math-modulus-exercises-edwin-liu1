class Power extends ConsoleProgram {

  /**
  * Description 1.5.1 - 9
  * @author:edwin_liu1
  */
  
  public void run() {
    
    double doubleNumber;
    double doublePower;
    double doubleEndNumber;

    doubleNumber = readDouble("Enter a number you want powered: ");
    doublePower = readDouble("Enter the power for the number: ");

    doubleEndNumber = Math.pow(doubleNumber, doublePower);

    System.out.println("your final number is " + doubleEndNumber);
    
  }
}