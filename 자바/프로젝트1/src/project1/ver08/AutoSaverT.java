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
				saveFile("C:/02Workspaces/Project01A/src/project1/ver08/AutoSaveBook.txt");
				
				System.out.println("주소록이 텍스트로 자동저장되었습니다.");					

				
			}
			catch(InterruptedException e) {
				break;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void saveFile(String path) throws IOException {
		OutputStream out = new FileOutputStream(path);
		
		String str = "";
		byte buffer[] = new byte[1024];
		for(PhoneInfo info : set) {
			str += info.getStrAll();
		}
		buffer = str.getBytes();
		
		out.write(buffer);
		
		out.close();
	}
}

//class DaemonThread extends Thread
//{
//	@Override
//	public void run() {
//		while(true) {
//			System.out.println(
//				String.format("[쓰레드명:%s]Jazz가 흘러요~",
//					getName())
//			);
//			try {
//				sleep(3000);
//				System.out.println("3초마다 자동저장!!");
//			}
//			catch(InterruptedException e) {
//				System.out.println("자동저장시 오류발생 ㅜㅜ");
//			}
//		}
//	}
//}