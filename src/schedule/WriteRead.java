package schedule;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteRead {


	public void readWrite(String name) throws FileNotFoundException ,Exception{//ファイルの読み
		String filename = "C:\\Users\\am\\Documents\\WriteRead\\" + name + ".txt";
		FileWriter fw = new FileWriter(filename);
		System.out.println("本日の予定");//予定の表示
		FileReader fr = new FileReader(filename);
		char c1 = (char) fr.read();
		System.out.println(c1);

		//FileWriter fw = new FileWriter(filename);//予定の書き込み
		System.out.println("追加の予定を入力 完了の場合はスペース");
		//int a = 0;
		//if(a != KeyEvent.VK_SPACE) {//スペースが押されたら

		String nyr = new java.util.Scanner(System.in).nextLine();
		fw.write(nyr);
		//}
		fw.close();
	}

}
