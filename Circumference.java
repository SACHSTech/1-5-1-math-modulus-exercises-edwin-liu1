class Circumference extends ConsoleProgram {

  /**
  * Description 1.5.1 - 3
  * @author:edwin_liu1
  */
  
  public void run() {
    
    double doubleRadius;
    double doubleCircumference;

    doubleRadius = readDouble("Enter circle radius: ");

    doubleCircumference = 2 * (doubleRadius * Math.PI);

    System.out.println("The circumference is " + doubleCircumference);
    
  }
}