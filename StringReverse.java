class StringReverse{
	public static void main(String[] args){
	
	String sentence= "Java is a programing language"; 
	String store="";
    char chars;
	 
    System.out.print("Original word: "+sentence);
	System.out.print("\n"+"Length of sentence is "+sentence.length());
	
	for (int i=0; i<sentence.length(); i++)
    {
        chars= sentence.charAt(i); 
        store= chars+store;
    }
    System.out.println("\n"+"Reversed word: "+ store);
	  
	}
	
}