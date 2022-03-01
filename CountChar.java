class CountChar{
 public static void main(String[] args){
   
    String testWord="Aggregator";
	char testChar='g';
	int count=0;
	
	for(int i=0; i<testWord.length(); i++)
	{
		if (testChar==testWord.charAt(i))
		{
		count++;
		}
	}
	
    System.out.println("The number of char "+testChar+ " in the test is "+count);
	
  }

}