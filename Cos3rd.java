class Cos3rd extends ConsoleProgram {

  /**
  * Description 1.5.1 - 5
  * @author:edwin_liu1
  */
  
  public void run() {
    
    double dblSide1;
    double dblSide2;
    double dblAngle;
    double dblSide3;
    
    dblSide1 = readDouble("What is the first side of your triangle? ");
    dblSide2 = readDouble("What is the second side of your triangle? ");
    dblAngle = readDouble("What is the angle of your triangle? ");

    dblSide3 = Math.sqrt (Math.pow (dblSide1, 2) + Math.pow (dblSide2, 2) - (2 * dblSide1 * dblSide2 * Math.cos (dblAngle) ) );

    System.out.println("The third side of your triangle is " + dblSide3);

  }
}