import java.util.ArrayList;
	 
	public class Data
		{
	public static ArrayList <Data> words = new ArrayList<Data>();
		private String firstLetter;
		private String secondLetter;
		private String thirdLetter;
		private String fourthLetter;
		private String fifthLetter;
	
	public Data(String n, String l, int a)
		{
		name = n;
		letter = l;
		attempts = a;                                                                                                                                                                                                                                                                                                                                
		}
	public String getName()
		{
		return name;
		}
	public String getLetter()
		{
		return letter;
		}
	public int getAttempts()
		{
		return attempts;
		}
		public static void addData()
			{
			words.add(new Data("a"));
			words.add(new Data("b"));
			words.add(new Data("c"));
			words.add(new Data("d"));
			words.add(new Data("e"));
			words.add(new Data("f"));
			words.add(new Data("g"));
			words.add(new Data("h"));
			words.add(new Data("i"));
			words.add(new Data("j"));
			words.add(new Data("k"));
			words.add(new Data("l"));
			words.add(new Data("m"));
			words.add(new Data("n"));
			words.add(new Data("o"));
			words.add(new Data("p"));
			words.add(new Data("q"));
			words.add(new Data("r"));
			words.add(new Data("s"));
			words.add(new Data("t"));
			words.add(new Data("u"));
			words.add(new Data("v"));
			words.add(new Data("w"));
			words.add(new Data("x"));
			words.add(new Data("y"));
			words.add(new Data("z"));
			
			
			}
		}