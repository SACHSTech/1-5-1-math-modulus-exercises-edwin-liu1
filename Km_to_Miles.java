class Km_to_Miles extends ConsoleProgram {

  /**
  * Description 1.5.1 - 8
  * @author:edwin_liu1
  */
  
  public void run() {
    
    double dblKilometers;
    double dblMiles;

    dblKilometers = readDouble("Enter number of kilometers: ");

    dblMiles = dblKilometers * 0.621371;

    System.out.println(dblKilometers + "kilometers is " + dblMiles + "miles");
    
  }
}
