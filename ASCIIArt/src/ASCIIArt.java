/*
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void heading() {
		System.out.println("                               ------------");
		System.out.println("                               AP CS Rocks!");
		System.out.println("                               ------------");
	}

	public static void topHead() {
		System.out.print("                                ________     \n"
				+ "                               /(.)  (.)\\    \n"
				+ "                              /     u    \\   \n" + "                             |      _     |  \n"
				+ "                             |     / \\    |  \n");
		fingersAndBottomHead();
	}

	public static void fingersAndBottomHead() {
		System.out.print("              nnnnn           \\    \\_/   /           nnnnn\n"
				+ "             | | | |n          \\________/          n| | | |\n");
	}

	public static void armsAndBody() {
		System.out.print("            |       |           |      |           |       |\n"
				+ "             \\_   _/           /        \\           \\_   _/\n"
				+ "              \\   \\    ___    /     A    \\    ___    /   /\n"
				+ "               \\   \\__/   \\__|     /|\\    |__/   \\__/   /\n"
				+ "                \\            |    / | \\   |            /\n"
				+ "                 \\___________|      |     |___________/\n"
				+ "                             |      |     |  \n" + "                             |      |     |  \n"
				+ "                             |      |     | \n"
				+ "                             |____________|  \n");
	}
	
	public static void legs() {
		System.out.print("                              \\   /  \\   /   \n"
				+ "                               | |    | |    \n" + "                               | |    | |    \n"
				+ "         ___     ___           | |    | |             ___     ___\n" + "        |   |___|   |          | |    | |            |   |___|   |\n"
				+ "        | 4 |___| 0 |          | |    | |            | 4 |___| 0 | \n");

	}

	public static void shoes() {
		System.out.println(
				"        |___|   |___|          | |_   | |_           |___|   |___| \n" + "                               {___)  {___)  ");

	}

	public static void description() {
		System.out.println("\t\tThis is a pixel man!^\t(Who skipped leg day)");
		// System.out.println("\"This is my output.\"");//
	}

	public static void main(String[] args) {
		heading();
		topHead();
		armsAndBody();
		legs();
		shoes();
		description();

		/*
		 * 
		 * 
		 * System.out.println(" ");
		 * 
		 * System.out.println("THIS IS MY ASCII ART!!!!");
		 * System.out.println("THIS IS MY ASCII ART!!!!");
		 * System.out.println("THIS IS MY ASCII ART!!!!");
		 * System.out.println("THIS IS MY ASCII ART!!!!");
		 * System.out.println("THIS IS MY ASCII ART!!!!");
		 */
	}
}
