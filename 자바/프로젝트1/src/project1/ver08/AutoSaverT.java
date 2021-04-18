package project1.ver08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;


public class AutoSaverT extends Thread {

	private HashSet<PhoneInfo> set;	
	
	public AutoSaverT(HashSet<PhoneInfo> set) {
		this.set = set;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				sleep(5000);
				saveFile("src/project1/ver08/AutoSaveBook.txt");
				
				System.out.println("주소록이 텍스트로 자동저장되었습니다.");

			}
			catch(InterruptedException e) {
				break;
			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void saveFile(String path) throws IOException {
		OutputStream out = new FileOutputStream(path);

		String str = "";
		byte buffer[] = new byte[1024];
		for (PhoneInfo info : set) {
			str += info.getStrAll();
		}
		buffer = str.getBytes();

		out.write(buffer);

		out.close();
	}
}
	

	




