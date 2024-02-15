class AreaSin extends ConsoleProgram {

  /**
  * Description 1.5.1 - 6
  * @author:edwin_liu1
  */
  
  public void run() {
    
    double doubleSide1;
    double doubleSide2;
    double doubleAngle;
    double doubleArea;

    //reused code :3
    doubleSide1 = readDouble("What is the first side of your triangle? ");
    doubleSide2 = readDouble("What is the second side of your triangle? ");
    doubleAngle = readDouble("What is the angle of your triangle? ");

    doubleArea = (doubleSide1 * doubleSide2 *  Math.sin( doubleAngle) ) / 2;

    System.out.println("The area of your triangle is " + doubleArea);

  }
}