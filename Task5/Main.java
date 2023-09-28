import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    	ArrayList <String> actionsMenu = new ArrayList<String>();
    	actionsMenu.add("Start game");
    	actionsMenu.add("Resume game");
    	actionsMenu.add("Pause game");
    	actionsMenu.add("End game");
    	//System.out.println(actionsMenu.get(2));

    	GameMenu gameMenu1 = new GameMenu(actionsMenu);
//gameMenu1.displayMenu();
int userChoice = Integer.parseInt(gameMenu1.getActions());

doAction(userChoice);
}

public static void doAction(int action)
		{
			switch(action)
			{
			case 1: System.out.println("Starting the game now");
				break;
			case 2: System.out.println("Fetching previously saved game data");
				break;
			case 3: System.out.println("Game paused");
				break;
			case 4: System.out.println("Ending game");
				break;
			default:

			}
		}	
   
  }
