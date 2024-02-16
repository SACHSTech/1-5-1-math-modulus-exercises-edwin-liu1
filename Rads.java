class Rads extends ConsoleProgram {

  /**
  * Description 1.5.1 - 4
  * @author: edwin_liu1
  */
  
  public void run() {
    
    double dblDegrees;
    double dblRadians;

    dblDegrees = readDouble("Angle in degrees: ");

    dblRadians = Math.toRadians(dblDegrees);

    System.out.println("The angle in degrees is " + dblRadians);
    
  }
}