package dataReadAPI;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class DataReader {

	public static void main(String[] args) {
		String path = "C:\\Users\\[path.....]workspace\\HomeWork_3\\src\\dataReadAPI\\windows_problems.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(path);
		} catch (FileNotFoundException e) {
			System.out.println("Sorry!! File is not found");
			e.printStackTrace();
		}
		br = new BufferedReader(fr);
		String text = "";
		try {
			while((text = br.readLine())!=null){
				
				System.out.println(text);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally{
			try {
				if(fr!=null){
					fr.close();
				}
			} catch (IOException e){
				e.printStackTrace();
			}
		}
		

	}

}
