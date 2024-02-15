class Cos3rd extends ConsoleProgram {

  /**
  * Description 1.5.1 - 5
  * @author:edwin_liu1
  */
  
  public void run() {
    
    double doubleSide1;
    double doubleSide2;
    double doubleAngle;
    double doubleSide3;
    
    doubleSide1 = readDouble("What is the first side of your triangle? ");
    doubleSide2 = readDouble("What is the second side of your triangle? ");
    doubleAngle = readDouble("What is the angle of your triangle? ");

    doubleSide3 = Math.sqrt (Math.pow (doubleSide1, 2) + Math.pow (doubleSide2, 2) - (2 * doubleSide1 * doubleSide2 * Math.cos (doubleAngle) ) );

    System.out.println("The third side of your triangle is " + doubleSide3);

  }
}