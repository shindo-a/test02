package schedule;

import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteRead {

	public void readWrite(String name) throws FileNotFoundException ,Exception{//ファイルの読み
		String filename = "C:\\Users\\am\\Documents\\WriteRead\\" + name + ".txt";
		FileWriter fw = new FileWriter(filename, true);
		FileReader fr = new FileReader(filename);
		PrintWriter pr = new PrintWriter(fw);

		//System.out.println("\n本日の予定\n");//予定の表示

		int ch = fr.read();
		//char c1 = (char) fr.read();
		while(ch != -1) {
			System.out.print((char)ch);
			ch = fr.read();
		}
		fr.close();
		//System.out.println(c1);

		//FileWriter fw = new FileWriter(filename);//予定の書き込み
		System.out.println("追加の予定を入力");

		String nyr = new java.util.Scanner(System.in).nextLine();

		pr.println(nyr);
		int a = 0;
		if(a != KeyEvent.VK_SPACE) {//スペースが押されたら

		pr.close();

		}
	}

}
