class Chick implements Animal 
{     
     //your code here
	private String myType;
	private String mySound;
	public Chick(String type, String sound, String sound2){
		myType = type;
		if((int)(Math.random()*2) == 0){
			mySound = sound;
		}
		else{
			mySound = sound2;
		}

	}
	public Chick(){
		myType = "unknown";
		mySound = "unknown";
	

	}
	public String getSound(){return mySound;}
	public String getType(){return myType;}


}