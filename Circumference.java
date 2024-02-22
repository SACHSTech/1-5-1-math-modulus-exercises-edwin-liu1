class Circumference extends ConsoleProgram {

  /**
  * Description 1.5.1 - 3
  * @author:edwin_liu1
  */
  
  public void run() {
    
    double dblRadius;
    double dblCircumference;

    dblRadius = readDouble("Enter circle radius: ");

    dblCircumference = 2 * (dblRadius * Math.PI);

    System.out.println("The circumference is " + dblCircumference);
    
  }
}