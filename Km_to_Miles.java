class Km_to_Miles extends ConsoleProgram {

  /**
  * Description 1.5.1 - 8
  * @author:edwin_liu1
  */
  
  public void run() {
    
    double doubleKilometers;
    double doubleMiles;

    doubleKilometers = readDouble("Enter number of kilometers: ");

    doubleMiles = doubleKilometers * 0.621371;

    System.out.println(doubleKilometers + "kilometers is " + doubleMiles + "miles");
    
  }
}
