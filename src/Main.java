import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


//Jacob Sacdalan
//SD1
//2/28/2018


public class Main {
private static int lineCount;


public static void main(String[] args) {
	String fileName;
	System.out.println("Input File Path: ");
	
	Scanner userInput = new Scanner(System.in);
	fileName = userInput.nextLine();
	
	countLOC(fileName);
	
	
	fileName = new File(fileName).getName();
	System.out.println(fileName);
	System.out.println("LOC: " + lineCount);
}

static int countLOC(String fileName) {
	Scanner scan = null;
	
	try {
		File file = new File(fileName);
		scan = new Scanner(file);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	while(scan.hasNext()) {
		String line =  (String) scan.nextLine();
		if(line != null) {
			lineCount++;
		}
	}
	return lineCount;
}

}
