package schedule;

public class Main {

	public static void main(String[] args) {

		//カレンダーの作成
		//予定の表示
		//当日の表示
		//明日の表示
		//予定の登録
		//

		Cal cal = new Cal();//インスタンス
		Schedule sc = new Schedule();
		WriteRead wr = new WriteRead();
		cal.dayMonth();
		cal.youbi();


		System.out.println("本日は" + cal.m + "月" + cal.d + "日" + cal.yb + "曜日");
		System.out.println("今日の授業は、" + sc.ans(cal.m, cal.d));

		String name = "a" + cal.m + cal.d;
		try {//↓エラーが出るのでトライキャッチ int →String の変換に何か方法は…？
			wr.readWrite(name);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
