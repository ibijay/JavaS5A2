public class InheritanceDemo1 
{
	public static void main(String[] arg)
	{
		ClassBuilding Objcb = new ClassBuilding();
		ClassBuildingApartments Objcba = new ClassBuildingApartments();
		ClassBuildingDuplex Objcbd = new ClassBuildingDuplex();
		
		Objcb.Display();
		System.out.println("");
		Objcba.Display();
		System.out.println("");
		Objcbd.Display();
	}
}
