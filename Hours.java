class Hours extends ConsoleProgram {

  /**
  * Description 1.5.1 - 1
  * @author:Edwin_liu1
  */
  
  public void run() {
    
    int hours;
    int days;
    int remainder;

    hours = readInt("number of hours: ");

    days = hours/24;
    remainder = hours%24;

    System.out.println(hours + " hours = " + days + " days and " + remainder + " hours.");
    
  }
}