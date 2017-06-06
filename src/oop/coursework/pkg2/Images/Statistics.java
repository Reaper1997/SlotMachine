package oop.coursework.pkg2.Images;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Steven
 */
public class Statistics extends JFrame {
    public Statistics(int noOfWins,int noofLosses,int totalCredits){
        double avgCredits=(totalCredits*1.0)/(noOfWins*1.0);
		if(noOfWins==0){
			avgCredits = 0;
		}
		JFrame frame = new JFrame("Statistics");
		JLabel win = new JLabel();
		JLabel lose = new JLabel();
		JLabel avg = new JLabel();
		JLabel winningLabels= new JLabel("Wins: ");
		JLabel LosingLabels= new JLabel("Loses: ");
		JLabel AvgLabels = new JLabel("Average Credit Netted: ");
		JButton Save = new JButton("Save Statistics");
		win.setText(""+noOfWins);
		lose.setText(""+noofLosses);
		avg.setText(""+avgCredits);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,1,5,5));
                panel.add(winningLabels);
                panel.add(win);
                panel.add(LosingLabels);
                panel.add(lose);
                panel.add(AvgLabels);
                panel.add(avg);
                panel.add(Save);
		frame.add(panel);
		frame.setSize(200, 130);
		frame.setVisible(true);
		String message="Win count: "+noOfWins+" \tLose count: "+noofLosses+" \tAverage credit netted: "+avgCredits;
		Save.addActionListener(new ActionListener() {
			
                    @Override
			public void actionPerformed(ActionEvent e) {
				try {
					long time =System.currentTimeMillis();
					PrintWriter printwriter = new PrintWriter(""+time+".txt");
					printwriter.println(message);
					System.out.println("File Saved");
					printwriter.close();
				} catch (FileNotFoundException e1) {
					JOptionPane.showMessageDialog(null,"No Such file found","Error!",JOptionPane.ERROR_MESSAGE);
					
				}
				System.exit(0);
			}
		});
		
		
	}
	
	
	
}
