import javax.swing.*;
import java.awt.event.*;
import java.io.FileWriter;

public class Window{
	Window(){
		// Initialize JFrame
		JFrame frame=new JFrame("Student Entry");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,500);
		frame.setLocationRelativeTo(null);
		// Initialize all JLabel components
		JLabel lbName=new JLabel("Student Name");
		lbName.setBounds(50, 100, 150, 50);
		JLabel lbRegNo=new JLabel("Registration number");
		lbRegNo.setBounds(550, 100, 150, 50);
		JLabel lbEmail=new JLabel("email");
		lbEmail.setBounds(50, 250, 150, 50);
		JLabel lbCntNo=new JLabel("Contact number");
		lbCntNo.setBounds(550, 250, 150, 50);
		// Initialize all JTextField components
		JTextField tfName=new JTextField("");
		tfName.setBounds(250, 100, 200, 50);
		JTextField tfRegNo=new JTextField("");
		tfRegNo.setBounds(750, 100, 200, 50);
		JTextField tfEmail=new JTextField("");
		tfEmail.setBounds(250, 250, 200, 50);
		JTextField tfCntNo=new JTextField("");
		tfCntNo.setBounds(750, 250, 200, 50);
		// Initialize JButton
		JButton btEnter=new JButton("Enter");
		btEnter.setBounds(450, 350, 150, 50);
		// Add all components to JFrame
		frame.add(lbName);
		frame.add(lbRegNo);
		frame.add(lbEmail);
		frame.add(lbCntNo);
		frame.add(tfName);
		frame.add(tfRegNo);
		frame.add(tfEmail);
		frame.add(tfCntNo);
		frame.add(btEnter);
		frame.setLayout(null);
		frame.setVisible(true);
		// Add functionality to button
		btEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String name=tfName.getText().trim();
				String email=tfEmail.getText().trim();
				int cntNo;
				int regNo;
				try {
					regNo=Integer.parseInt(tfRegNo.getText());
					cntNo=Integer.parseInt(tfCntNo.getText());
				} catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Only digits allowed in Registration no. and Contact no.");
					return;
				}
				// Write to a file
				FileWriter w;
				try {
					w=new FileWriter("./studentinfo.txt",true);
					w.write(name+","+regNo+","+email+","+cntNo+"\n");
					JOptionPane.showMessageDialog(null, "Entry added successfully");
					w.close();
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
	}
	public static void main(String[] args) {
		new Window();
	}
}