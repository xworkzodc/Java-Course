class MiddleChar{
 public static void main(String[] args){
 
  String test="Translators";
  
  if(test.length()%2!=0){
  int num=test.length()/2;
  
  char a=test.charAt(num);
  
  System.out.println(num);
  }
  else
  {
  System.out.println("The string has even num of characters");
  }
 
 }


}