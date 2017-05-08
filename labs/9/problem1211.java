import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class Problem1211 {
	
	public static void main(String[] args) throws Exception{
	
		if(args.length !=2) {
		
			System.out.println("Usage: java Exercise12_11 John Filename");
		
			System.exit(0);
		}
		
		File SourceFile = new File(args[1]);
		
		File tempSource = new File("temp.txt");
		
		if(!SourceFile.exists()) {
		
			System.out.println("Source file "+args[1]+" does not exist");
		
			System.exit(0);
		}
		
		Scanner input = new Scanner(SourceFile);
		
		PrintWriter output = new PrintWriter(tempSource);
		
		while(input.hasNext()) {
		
			String s1 = input.nextLine();
		
			String s2 = s1.replaceAll(args[0], "");
		
			output.println(s2);
		}
		
		input.close();
		
		output.close();
		
		File newSource = new File("temp.txt");
		
		File overriteFile = new File(args[1]);
		
		Scanner newIP = new Scanner(newSource);
		
		PrintWriter newOP = new PrintWriter(overriteFile);
		
		while(newIP.hasNext()) {
		
			String s1 = newIP.nextLine();
		
			newOP.close();
		
			if(overriteFile.exists()) overriteFile.delete();
	}
}
}