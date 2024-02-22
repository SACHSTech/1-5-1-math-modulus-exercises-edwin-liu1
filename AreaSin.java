class AreaSin extends ConsoleProgram {

  /**
  * Description 1.5.1 - 6
  * @author:edwin_liu1
  */
  
  public void run() {
    
    double dblSide1;
    double dblSide2;
    double dblAngle;
    double doubleArea;

    //reused code :3
    dblSide1 = readDouble("What is the first side of your triangle? ");
    dblSide2 = readDouble("What is the second side of your triangle? ");
    dblAngle = readDouble("What is the angle of your triangle? ");

    doubleArea = (dblSide1 * dblSide2 *  Math.sin (dblAngle) ) / 2;

    System.out.println("The area of your triangle is " + doubleArea);

  }
}