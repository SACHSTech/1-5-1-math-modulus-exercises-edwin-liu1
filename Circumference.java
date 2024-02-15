class Circumference extends ConsoleProgram {

  /**
  * Description 1.5.1 - 3
  * @author:edwin_liu1
  */
  
  public void run() {
    
    int intradius;
    double doublecircumference;

    intradius = readInt("Enter circle radius: ");

    doublecircumference = 2 * ((double)intradius * Math.PI);

    System.out.println("The circumference is " + doublecircumference);
    
  }
}