class Minutes extends ConsoleProgram {

  /**
  * Description 1.5.1 - 2
  * @author:edwin_liu1
  */
  
  public void run() {
    
    // start coding here
    int intMinutes;
    int intHours;
    int intDays;
    int intRemainder;

    intMinutes = readInt("Enter number of minutes: ");

    intDays = intMinutes / 1440;
    intHours = (intMinutes % 1440) / 60;
    intRemainder = (intMinutes % 1440) % 60;

    System.out.println(intMinutes + " minutes = " + intDays + " days, " + intHours + " hours, and " + intRemainder + " minutes.");
  }
}