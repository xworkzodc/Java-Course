class MoviePgm{
 
    String[] movies=new String[20];
    int adder=0;
	
  
    void addMovie(String movieName){
			
	    if(movieName!=null 
		   && movieName.length()>2 
		   && movieName.length()<40 
		   && movieName.matches("^[ a-zA-Z]*$"))
		{
		
		System.out.println("Movie "+movieName+ " pass the conditions and is stored");
		
		this.movies[adder]=movieName;
		adder++;
			
		}
		
		else 
		{
		
		System.out.println("Movie "+movieName+" doesn't pass the conditions");
		}
		
		
	}
		
    void display(){
		
		System.out.println("\n"+"The movies selected and stored in the program are");
		for(int index=0; index<movies.length; index++)
		{
		System.out.println(this.movies[index]);
		}
    
    }
  
}




