class Circumference extends ConsoleProgram {

  /**
  * Description 1.5.1 - 3
  * @author:edwin_liu1
  */
  
  public void run() {
    
    int intRadius;
    double doubleCircumference;

    intRadius = readInt("Enter circle radius: ");

    doubleCircumference = 2 * ((double)intRadius * Math.PI);

    System.out.println("The circumference is " + doubleCircumference);
    
  }
}