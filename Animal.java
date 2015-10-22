interface Animal 
{    
	   //your code here
	public String getSound();
	public String getType();  

public void setup() {     
    Cow c = new Cow("cow", "moo");   
    Chick ch = new Chick("chick","chirp");
    Pig p = new Pig("pig","oink")
    System.out.println(c.getType() + " goes " + c.getSound());   
    System.out.println(ch.getType() + " goes " + ch.getSound()); 
    System.out.println(p.getType() + " goes " + p.getSound()); 
	   }
}