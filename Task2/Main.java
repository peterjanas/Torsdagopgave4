import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{

System.out.println("Please type your name");
Scanner scanner = new Scanner(System.in);


String name = scanner.nextLine();
System.out.println(" davs " + name + " please type your age");

String age = scanner.nextLine();
int i = Integer.parseInt(age);

int retirement = (67-i);

if (i < 67 && i > 0)
	{
	System.out.println("Du har " + retirement + " til du kan gå på pension");
	}

else if (i >= 67)
	{
	System.out.println(" hvad laver du her? du kan allerede gå på pension");
	}



	}
}