class Rads extends ConsoleProgram {

  /**
  * Description 1.5.1 - 4
  * @author: edwin_liu1
  */
  
  public void run() {
    
    double doubleDegrees;
    double doubleRadians;

    doubleDegrees = readDouble("Angle in degrees: ");

    doubleRadians = Math.toRadians(doubleDegrees);

    System.out.println("The angle in degrees is " + doubleRadians);
    
  }
}