package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramReadFile3 {

	public static void main(String[] args) {
		
		String path = "c:\\temp\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader (path))){
		//Bloco try-with-resources declara um ou mais recursos e garante
		//que estes recursos serão fechados no final do blco	
			String line = br.readLine();
			while (line != null) {
			   System.out.println(line);
			   line = br.readLine();
			}
		}
        catch(IOException e) {
        	System.out.println("Error: "+ e.getMessage());
        }
	}

}
