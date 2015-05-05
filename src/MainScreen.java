import java.awt.EventQueue;

import javax.swing.JFrame;


public class MainScreen {

	private JFrame StartFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.StartFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		StartFrame = new JFrame();
		StartFrame.setBounds(100, 100, 450, 300);
		StartFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
