package schedule;

import java.awt.Frame;
import java.awt.TextArea;

public class MyFrame extends Frame {

	TextArea t;

	public void MyFrame(String text) {
		setSize(200, 200);
		addWindowListener(new MyWindowAdapter());
		t = new TextArea(text, 6, 20);
		add(t);
	}
	public MyFrame() {

	}

}
