class Split{
 public static void main(String[] args){
 
  String test="A_simple_sentence.";
  String blank="";
  String blank1="";
  char store;
  
  int num=test.length();
  int num1=num/2;
  
  if(test.length()%2==0)
     {
   
     for(int index=0; index<num1; index++)
     {
	  store=test.charAt(index);
	  blank=blank+store;
	 }
		   
     System.out.println(blank);
	 
     for (int index=num1; index<num; index++) 
	 {
	  store=test.charAt(index);
	  blank1=blank1+store;
     }
	 
	  System.out.println(blank1);
     }
     else{
	  System.out.println("The test string is not even");
  
     }
 
 }


}