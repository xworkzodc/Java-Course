class MedicinePgmTester{
	public static void main(String[] args){
	
	MedicinePgm medicinePgm=new MedicinePgm();
	
	System.out.println("\n"+"Program started");
	
	medicinePgm.addMedicine("VicksAction 500");
	medicinePgm.addMedicine("Crocin 650");
	medicinePgm.addMedicine("Dolo 500");
	medicinePgm.addMedicine("Avomine");
	medicinePgm.addMedicine("Calpol 650");
	medicinePgm.addMedicine("Ivermectin");
	medicinePgm.addMedicine("Atenolol");
	medicinePgm.addMedicine("Metformin");
	medicinePgm.addMedicine("Paracetaol");
	medicinePgm.addMedicine("Wincold");
	medicinePgm.addMedicine("Disprin");
	medicinePgm.addMedicine("");
	medicinePgm.addMedicine(null);
	medicinePgm.addMedicine("Dolo @");
	
	System.out.println("\n"+"Checking for medicine in the list");
	
	boolean status1=medicinePgm.find("Crocin 650");
	System.out.println(status1);
	boolean status2=medicinePgm.find("VicksAction 500");
	System.out.println(status2);
	boolean status3=medicinePgm.find("Vicks 500");
	System.out.println(status3);
	
	System.out.println("\n"+"The medicine prescribed are");
	
	medicinePgm.displayMedicine();
	
	}
}