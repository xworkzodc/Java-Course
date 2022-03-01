class Split1{
 public static void main(String[] args){
 
  String test="A_simple_sentence.";
  
  int num=test.length();
  int num1=test.length()/2;
  
  if(num%2==0){
  String firstHalf=test.substring(0,num1);
  System.out.println(firstHalf);
  
  String secondHalf=test.substring(num1,num);
  System.out.println(secondHalf);
  }
  else{
  System.out.println("The test string has odd number of chars");
  }
  }
 
 }