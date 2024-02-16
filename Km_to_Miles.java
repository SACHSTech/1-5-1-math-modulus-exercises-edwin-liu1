class Km_to_Miles extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    double doubleKilometers;
    double doubleMiles;

    doubleKilometers = readDouble("Enter number of kilometers: ");

    doubleMiles = doubleKilometers * 0.621371;

    System.out.println(doubleKilometers + "kilometers is " + doubleMiles + "miles");
    
  }
}
