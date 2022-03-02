class MedicinePgm{

    String[] medicines=new String[10];
	int adder=0;
	  
	  
	void addMedicine(String medicine){
		  
	  if(medicines.length==adder){
	    
		System.out.println("The medicine prescibed is sufficient and- "+medicine+ " is not required.");
		
		return;
		}		  
	  
	  if(   medicine!=null
	     && medicine.length()<50
		 && medicine.length()>4
		 && medicine.matches("[ a-zA-Z0-9]*")){
	    
		System.out.println("The medicine prescibed- "+medicine+ " matches the requirements and is stored");
		this.medicines[adder]=medicine;
		this.adder++;
		
		}
		else{
		
		System.out.println("The medicine prescibed- "+medicine+" doesn't match the requirements");
		
		}
	  
	  }
	  
	boolean find(String medicine){
	    
	    for(int index=0; index<medicines.length; index++){
	  
	    if(this.medicines[index].equals(medicine)){
			
	    System.out.println("The medicine "+medicine+ " is found in the list");
		return true;
	    }
		
		else{
			
		System.out.println("The medicine "+medicine+ " is not found in the list");
		return false;
		}
		
	    }
	    return false;
	  }
	  
	void displayMedicine(){
	
	    for(int index=0; index<medicines.length; index++){
		System.out.println(this.medicines[index]);
		}
	
	}
}