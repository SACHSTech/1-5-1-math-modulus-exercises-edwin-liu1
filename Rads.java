class Rads extends ConsoleProgram {

  /**
  * Description 1.5.1 - 4
  * @author: edwin_liu1
  */
  
  public void run() {
    
    double doubledegrees;
    double doubleradians;

    doubledegrees = readDouble("Angle in degrees: ");

    doubleradians = Math.toRadians(doubledegrees);

    System.out.println("The angle in degrees is " + doubleradians);
    
  }
}