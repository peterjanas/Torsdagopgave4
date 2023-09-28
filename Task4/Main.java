import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

    	ArrayList <String> actionsMenu = new ArrayList<String>();
    	actionsMenu.add("Start game");
    	actionsMenu.add("Resume game");
    	actionsMenu.add("Pause game");
    	actionsMenu.add("End game");
    	//System.out.println(actionsMenu.get(2));

    	GameMenu GameMenu1 = new GameMenu(actionsMenu);
GameMenu1.displayMenu();
    }
  }