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
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


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
		
		JPanel firstPanel = new JPanel();
		
		JPanel bookPanel = new JPanel();
		
		JPanel mapPanel = new JPanel();
		mainPanel.setLayout(new CardLayout(0, 0));
		mainPanel.add(firstPanel, "firstPanel");
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\hukkei\\Pictures\\05.jpg"));
		
		JButton btnInfo = new JButton("New button");
		
		JLabel lblGULogo = new JLabel("New label");
		
		JLabel lblChalmersLogo = new JLabel("New label");
		GroupLayout gl_firstPanel = new GroupLayout(firstPanel);
		gl_firstPanel.setHorizontalGroup(
			gl_firstPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_firstPanel.createSequentialGroup()
					.addGroup(gl_firstPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_firstPanel.createSequentialGroup()
							.addGap(26)
							.addComponent(lblGULogo))
						.addGroup(gl_firstPanel.createSequentialGroup()
							.addGap(38)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
					.addGroup(gl_firstPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_firstPanel.createSequentialGroup()
							.addComponent(lblChalmersLogo)
							.addGap(47))
						.addGroup(Alignment.TRAILING, gl_firstPanel.createSequentialGroup()
							.addComponent(btnInfo)
							.addGap(28))))
		);
		gl_firstPanel.setVerticalGroup(
			gl_firstPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_firstPanel.createSequentialGroup()
					.addGap(61)
					.addGroup(gl_firstPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnInfo, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
					.addGroup(gl_firstPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGULogo)
						.addComponent(lblChalmersLogo))
					.addGap(108))
		);
		firstPanel.setLayout(gl_firstPanel);
		mainPanel.add(bookPanel, "bookPanel");
		
		JButton btnReserve = new JButton("New button");
		
		JButton btnUnreserve = new JButton("New button");
		
		JButton btnHistory = new JButton("New button");
		btnHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GroupLayout gl_bookPanel = new GroupLayout(bookPanel);
		gl_bookPanel.setHorizontalGroup(
			gl_bookPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_bookPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_bookPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnReserve, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
						.addComponent(btnUnreserve, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
						.addComponent(btnHistory, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(26))
		);
		gl_bookPanel.setVerticalGroup(
			gl_bookPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_bookPanel.createSequentialGroup()
					.addGap(92)
					.addComponent(btnReserve, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(41)
					.addComponent(btnUnreserve, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(48)
					.addComponent(btnHistory, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(210, Short.MAX_VALUE))
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
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(mainPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(mainPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		);
		frame.getContentPane().setLayout(groupLayout);
		
		
		
		
	}
}
