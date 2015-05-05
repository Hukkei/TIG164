import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;


public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 320, 568);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel();
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		
		JPanel firstPanel = new JPanel();
		
		JPanel bookPanel = new JPanel();
		
		JPanel mapPanel = new JPanel();
		mainPanel.setLayout(new CardLayout(0, 0));
		mainPanel.add(firstPanel, "firstPanel");
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\hukkei\\Pictures\\05.jpg"));
		GroupLayout gl_firstPanel = new GroupLayout(firstPanel);
		gl_firstPanel.setHorizontalGroup(
			gl_firstPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_firstPanel.createSequentialGroup()
					.addGap(40)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(170, Short.MAX_VALUE))
		);
		gl_firstPanel.setVerticalGroup(
			gl_firstPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_firstPanel.createSequentialGroup()
					.addGap(41)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(403, Short.MAX_VALUE))
		);
		firstPanel.setLayout(gl_firstPanel);
		mainPanel.add(bookPanel, "bookPanel");
		GroupLayout gl_bookPanel = new GroupLayout(bookPanel);
		gl_bookPanel.setHorizontalGroup(
			gl_bookPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 10, Short.MAX_VALUE)
		);
		gl_bookPanel.setVerticalGroup(
			gl_bookPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 529, Short.MAX_VALUE)
		);
		bookPanel.setLayout(gl_bookPanel);
		mainPanel.add(mapPanel, "mapPanel");
		GroupLayout gl_mapPanel = new GroupLayout(mapPanel);
		gl_mapPanel.setHorizontalGroup(
			gl_mapPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 10, Short.MAX_VALUE)
		);
		gl_mapPanel.setVerticalGroup(
			gl_mapPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 529, Short.MAX_VALUE)
		);
		mapPanel.setLayout(gl_mapPanel);
		
		final CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
		//cardLayout.show(mainPanel, "firstPanel");
		
		
		
	}
}
