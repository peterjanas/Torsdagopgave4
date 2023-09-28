import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {
	private ArrayList <String> actions;

public GameMenu (ArrayList<String> actions)
{
	this.actions = actions;
}



public void displayMenu()
{
	for(String s: actions)
	{
		System.out.println(s);
	}
}

public String getActions()
	{
	System.out.println("Type a number to choose an action");
	for(String s: actions)
	{
		System.out.println(s);
	}
Scanner scanner = new Scanner(System.in);
String choice = scanner.nextLine();

return choice;

	}



}