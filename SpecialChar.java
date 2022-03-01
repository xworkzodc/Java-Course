class SpecialChar{
 public static void main(String[] args){
 
 int count=0;
 String test="Java@programming$#";
 
 for(int i=0; i<test.length(); i++){
 if(
      !Character.isDigit(test.charAt(i))
    &&!Character.isLetter(test.charAt(i))
    &&!Character.isWhitespace(test.charAt(i))
	)
	count++;
	} 
	System.out.println("The number of special characters in test is "+count);
 
 
 }



}