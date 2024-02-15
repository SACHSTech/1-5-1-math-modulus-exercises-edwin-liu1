class Circumference extends ConsoleProgram {

  /**
  * Description 1.5.1 - 3
  * @author:edwin_liu1
  */
  
  public void run() {
    
    int radius;
    double circumference;

    radius = readInt("Enter circle radius: ");

    circumference = 2 * ((double)radius * Math.PI);

    System.out.println("The circumference is " + circumference);
    
  }
}