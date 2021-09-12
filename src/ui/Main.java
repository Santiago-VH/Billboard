package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	int EXIT_OPTION = 5;
	
	public static void main(String[] args) {
		
	}
	
	
	public static void usarBufferConsola() throws IOException {
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		System.out.println("INPUT DATA: \n");
		line = br.readLine();
		//System.out.println(line);
		line = br.readLine();
		//System.out.println(line);
		
		bw.write(line);
		
		br.close();
		bw.close();
	}

}

