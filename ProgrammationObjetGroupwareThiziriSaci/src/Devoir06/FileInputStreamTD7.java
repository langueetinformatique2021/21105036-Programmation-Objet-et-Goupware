package Devoir06;
import java.io.*;
import java.util.*;
import java.io.FileOutputStream;
public class FileInputStreamTD7 extends FileInputStream {
	private BufferedReader file;
	public FileInputStreamTD7(File file) throws FileNotFoundException {
		super(file);
		// TODO Auto-generated constructor stub
	}
	public void Copie(file) {
		File newF;
		BufferedReader ts= new (FileReader file);
		PrintWriter tc= newPrintWriter(newF);
		String ligne = ts.readLine();
		if (ligne!=null) {
			newF.println(ligne);
		}
	}
}