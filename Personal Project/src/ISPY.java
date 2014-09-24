
public class Game 
	{
		private String word;
		private String color;
		private String otherDescriptions;
		private String location;
		
public Game(String w, String c, String oD, String l)
		{
		word = w;
		color = c;
		otherDescriptions = oD;
		location = l;
		}
public String getword()
	{
	return word;
	}
public String getcolor()
	{
	return color;
	}
public String getotherDescriptions()
	{
	return otherDescriptions;
	}
public String getlocation()
	{
	return location;
	}

 public static void main(String[] args) 
 	{
	 String[]thingsInTheRoomArray={"computer", "board", "marker", "prayer card", "clock"};	
	 String randomWord = thingsInTheRoomArray[(int)Math.random()*5];
	 System.out.println(randomWord);
	 
	 ArrayList <computer> = new ArrayList <computer>("black", "big", "keys", "on button", "center");
	 //this isn't working?? 
	 //should i change computer to something else 
	 
	 ArrayList <board> = new ArrayList <board>("white", "drawings", "marks", "large", "front");
	 //same applies as before
	 
	 ArrayList <marker> = new ArrayList <marker>("green", "blue", "red", "yellow", "write", "on board");
	 //^^
	 
	ArrayList <prayercard> = new ArrayList <prayer card>("white", "red", "green", "small", "on board", "writings") );
	//^^
	
	ArrayList <clock> = new ArrayList <clock>("white", "black", "numbers", "circle");
	//^^ 
	 
	 
	 
	 
	}

}
