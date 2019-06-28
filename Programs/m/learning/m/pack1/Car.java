package learning.m.pack1;

public class Car {
	


	private String Smodel;
	private Integer imakes;
	private int iMake;
	private int Gear;
	int iHighestSpeed;
    String sColor;
    boolean bLeftHandDrive;
    String sTransmission;
    int iTyres;
    public int getiDoors() {
		return iDoors;
	}
	public void setiDoors(int iDoors) {
		this.iDoors = iDoors;
	}



	int iDoors;
    
   public Car()
   {
	   Smodel="Camry";
	   iMake=2015;
	   Gear=5;
	   sColor="Hai";
	   
   }
   
   
   
   public String DisplayCharacters()
   {
	   System.out.println("Model name "+Smodel);
	   System.out.println("Making of year" +iMake);
	   System.out.println("Gear "+Gear);
	   return sColor;
   }


}
