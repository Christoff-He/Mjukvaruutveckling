package uppgift_6;

import java.awt.EventQueue;

public class Main {
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppFrame appFrame = new AppFrame();
					PersonRegister personReg = new PersonRegister();
					
					Controller controller = new Controller(appFrame, personReg);
					
					appFrame.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

