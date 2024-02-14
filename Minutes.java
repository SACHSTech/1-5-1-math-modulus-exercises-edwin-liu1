class Minutes extends ConsoleProgram {

  /**
  * Description 1.5.1 - 2
  * @author:edwin_liu1
  */
  
  public void run() {
    
    // start coding here
    int intminutes;
    int inthours;
    int intdays;
    int intremainder;

    intminutes = readInt("Enter number of minutes: ");

    intdays = intminutes / 1440;
    inthours = (intminutes % 1440) / 60;
    intremainder = (intminutes % 1440) % 60;

    System.out.println(intminutes + " minutes = " + intdays + " days, " + inthours + " hours, and " + intremainder + " minutes.");
  }
}