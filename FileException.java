package java2;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileException {
public static void main(String[]args) {
	String str="my name is jeswin jose";
	char[]data=new char[50];
	FileWriter obj=null;
	FileReader obj1=null;
	FileWriter obj2=null;
	try {
		obj=new FileWriter("input.txt");
		obj.write(str);
		obj.flush();
		obj.close();
		obj1=new FileReader("input.txt");
		int size=obj1.read(data);
		obj1.close();
		obj2=new FileWriter("output.txt");
		obj2.write(data);
		obj2.flush();
		obj2.close();
		
	}
	catch(IOException e) {
		e.printStackTrace();
		
	}
}
}
