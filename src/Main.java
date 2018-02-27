import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


//Jacob Sacdalan
//SD1
//2/28/2018


public class Main {
private static int lineCount;


public static void main(String[] args) throws IOException {
	String fileName;
	System.out.println("Input File Name: ");
	
	Scanner userInput = new Scanner(System.in);
	fileName = userInput.nextLine();
	
	countLOC(fileName);
	
	
	fileName = new File(fileName).getName();
	System.out.println("File Name: " + fileName);
	System.out.println("LOC: " + lineCount);
	userInput.close();
}

static int countLOC(String fileName) throws IOException {
	String line = "";
	Scanner scan = null;
	//Setup for counting the number of blank spaces
	try {
		File file = new File(fileName);
		scan = new Scanner(file);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	while(scan.hasNext()) {
		line =  (String) scan.nextLine();
		if(line != null) {
			lineCount++;
		}
		if(line.trim().isEmpty()) { //Subtract number of blank lines from lineCount value
			lineCount--;
		}
	}

//	InputStream is = new BufferedInputStream(new FileInputStream(fileName));
//    try {
//    	//Setup for counting number of lines of code not including comments
//        byte[] c = new byte[1024];
//        int count = 0;
//        int readChars = 0;
//        boolean empty = true;
//        while ((readChars = is.read(c)) != -1)
//        {
//            empty = false;
//            for (int i = 0; i < readChars; ++i)
//            {
//                if (c[i] == '\n')
//                    ++lineCount;
//            }
//        }
//        return (count == 0 && !empty) ? 1 : count;
//    }
//    finally
//    {
//        is.close();
//    }

    	BufferedReader fileRead = new BufferedReader(new FileReader(fileName));
    	while ((line = fileRead.readLine()) != null) {
            if (line.contains("//")) {
                lineCount--;
            } 
            else if (line.contains("**")) {
            	lineCount--;
            }
            else if (line.contains("/*")) {
                lineCount--;
                while (!line.contains("*/") && !(line = fileRead.readLine()).contains("*/"));
            }
        }
        fileRead.close();
        
        return lineCount;
    } 
    
    
}



