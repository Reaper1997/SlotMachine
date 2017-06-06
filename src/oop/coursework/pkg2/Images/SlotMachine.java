
package oop.coursework.pkg2.Images;

/**
 *
 * @author Steven
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
//import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
//import javax.swing.ImageIcon;

public class SlotMachine extends JFrame implements Runnable {

    ImageIcon plum = new ImageIcon("C:\\\\Users\\\\Steven\\\\Documents\\\\NetBeansProjects\\\\OOP coursework 2\\\\src\\\\oop\\\\coursework\\\\pkg2\\\\Images\\\\plum.png");
    Image plumImage = plum.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
    ImageIcon plum2 = new ImageIcon(plumImage);

    ImageIcon cherry = new ImageIcon("C:\\\\Users\\\\Steven\\\\Documents\\\\NetBeansProjects\\\\OOP coursework 2\\\\src\\\\oop\\\\coursework\\\\pkg2\\\\Images\\\\cherry.png");
    Image cherryImage = cherry.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
    ImageIcon cherry2 = new ImageIcon(cherryImage);

    ImageIcon lemon = new ImageIcon("C:\\\\Users\\\\Steven\\\\Documents\\\\NetBeansProjects\\\\OOP coursework 2\\\\src\\\\oop\\\\coursework\\\\pkg2\\\\Images\\\\lemon.png");
    Image lemonImage = lemon.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
    ImageIcon lemon2 = new ImageIcon(lemonImage);

    ImageIcon bell = new ImageIcon("C:\\\\Users\\\\Steven\\\\Documents\\\\NetBeansProjects\\\\OOP coursework 2\\\\src\\\\oop\\\\coursework\\\\pkg2\\\\Images\\\\bell.png");
    Image bellImage = bell.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
    ImageIcon bell2 = new ImageIcon(bellImage);

    ImageIcon redseven = new ImageIcon("C:\\\\Users\\\\Steven\\\\Documents\\\\NetBeansProjects\\\\OOP coursework 2\\\\src\\\\oop\\\\coursework\\\\pkg2\\\\Images\\\\redseven.png");
    Image redsevenImage = redseven.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
    ImageIcon redseven2 = new ImageIcon(redsevenImage);

    ImageIcon watermelon = new ImageIcon("C:\\\\Users\\\\Steven\\\\Documents\\\\NetBeansProjects\\\\OOP coursework 2\\\\src\\\\oop\\\\coursework\\\\pkg2\\\\Images\\\\watermelon.png");
    Image watermelonImage = watermelon.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
    ImageIcon watermelon2 = new ImageIcon(watermelonImage);

    
    JFrame frame;
    JPanel panel;
    JLabel label;
    JLabel label2;
    JLabel label3;
    JButton button;
    SlotMachine object;
    int imageID;
    int imageID2;
    int imageID3;
    int noOfWins;
    int creditsWon;
    int count;
    int noOflosses;
    
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    int credits = 10;
    int betCredits = 0;
    int totalCreditsWon;
    int totalCredits;
    Reel reel = new Reel();
    Reel reel2 = new Reel();
    Reel reel3 = new Reel();

    ArrayList<JButton> buttonlist = new ArrayList<JButton>();
    ArrayList<Symbol> list1 = new ArrayList<Symbol>();
    ArrayList<Symbol> list2 = new ArrayList<Symbol>();
    ArrayList<Symbol> list3 = new ArrayList<Symbol>();
    
    public int SlotMachineCalculation(){
        int message =0;
		count++;
		if(count%3==0){
			long i = Thread.currentThread().getId();
			if(Thread.currentThread().getId()==i){
				
				if(button.getIcon().equals(button2.getIcon())&& button.getIcon().equals(button3.getIcon())&& 
						button2.getIcon().equals(button3.getIcon())){
					noOfWins++;	
					creditsWon= betCredits * imageID ;
					totalCreditsWon=totalCreditsWon + creditsWon;
					credits = credits + creditsWon;
					label.setText("Credits:"+credits);
					message = 1;
					
				}else if(button.getIcon().equals(button2.getIcon())){
					
					credits = credits + creditsWon;
					label.setText("Credits:"+credits);
					message = 2;
					
				}else if(button.getIcon().equals(button3.getIcon())){
					
					credits = credits + creditsWon;
					label.setText("Credits:"+credits);
					message = 3;
				
				}else if(button2.getIcon().equals(button3.getIcon())){
					
					credits = credits + creditsWon;
					label.setText("Credits:"+credits);
					message = 4;
				
				}else{
					noOflosses++;
					message = 5;
					
				}
				betCredits = betCredits - betCredits;
				label2.setText(""+betCredits);
				button7.setEnabled(false);
				System.out.println("Credits:"+credits);
				if(credits <=0 && betCredits == 0){
					message = 6;
					
				}
			}
		}
		return message;
		
	}


    public void spin(ArrayList<Symbol> list) {
        
        while (true) {

            for (int i = 0; i < list.size(); i++) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
                if (list.equals(list1)) {
                    if (list.get(i).value == 7) {

                        imageID = 7;
                        button.setIcon(redseven2);
                        list.get(i).setImage(redseven2);

                    } else if (list.get(i).value == 6) {

                        imageID = 6;
                        button.setIcon(bell2);
                        list.get(i).setImage(bell2);
                    } else if (list.get(i).value == 5) {

                        imageID= 5;
                        button.setIcon(watermelon2);
                        list.get(i).setImage(watermelon2);
                    } else if (list.get(i).value == 4) {

                        imageID = 4;
                        button.setIcon(plum2);
                        list.get(i).setImage(plum2);
                    } else if (list.get(i).value == 3) {

                        imageID = 3;
                        button.setIcon(lemon2);
                        list.get(i).setImage(lemon2);
                    } else if (list.get(i).value == 2) {

                        imageID= 2;
                        button.setIcon(cherry2);
                        list.get(i).setImage(cherry2);
                    }

                } else if (list.equals(list2)) {
                    if (list.get(i).value == 7) {

                        imageID2 = 7;
                        button2.setIcon(redseven2);
                        list.get(i).setImage(redseven2);
                    } else if (list.get(i).value == 6) {

                        imageID2 = 6;
                        button2.setIcon(bell2);
                        list.get(i).setImage(bell2);
                    } else if (list.get(i).value == 5) {

                        imageID2 = 5;
                        button2.setIcon(watermelon2);
                        list.get(i).setImage(watermelon2);
                    } else if (list.get(i).value == 4) {

                        imageID2 = 4;
                        button2.setIcon(plum2);
                        list.get(i).setImage(plum2);
                    } else if (list.get(i).value == 3) {

                       imageID2 = 3;
                        button2.setIcon(lemon2);
                        list.get(i).setImage(lemon2);
                    } else if (list.get(i).value == 2) {

                        imageID2 = 2;
                        button2.setIcon(cherry2);
                        list.get(i).setImage(cherry2);
                    }
                } else if (list.equals(list3)) {
                    if (list.get(i).value == 7) {

                        imageID3 = 7;
                        button3.setIcon(redseven2);
                        list.get(i).setImage(redseven2);
                    } else if (list.get(i).value == 6) {

                        imageID3 = 6;
                        button3.setIcon(bell2);
                        list.get(i).setImage(bell2);
                    } else if (list.get(i).value == 5) {

                        imageID3 = 5;
                        button3.setIcon(watermelon2);
                        list.get(i).setImage(watermelon2);
                    } else if (list.get(i).value == 4) {

                        imageID3 = 4;
                        button3.setIcon(plum2);
                        list.get(i).setImage(plum2);
                    } else if (list.get(i).value == 3) {

                        imageID3 = 3;
                        button3.setIcon(lemon2);
                        list.get(i).setImage(lemon2);
                    } else if (list.get(i).value == 2) {

                        imageID3 = 2;
                        button3.setIcon(cherry2);
                        list.get(i).setImage(cherry2);
                    }
                }

            }

        }

    }
    

        
    
    

    
    
    
    

    
     
    public SlotMachine() {

        frame = new JFrame("Real Test");
        frame.setSize(700, 400);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 3, 5, 5));

        label = new JLabel("Credits:" + credits);
        label2 = new JLabel("Bet one:" + betCredits);
        label3 = new JLabel("");

        button = new JButton();
        button2 = new JButton();
        button3 = new JButton();
  
        button4 = new JButton("Add coins");
        button5 = new JButton("Bet One");
        button6 = new JButton("Bet Max");
        button7 = new JButton("Spin");
        button8 = new JButton("Reset");
        button9 = new JButton("Statistics");
        button7.setEnabled(false);
       
        panel.add(button);

        panel.add(button2);

        panel.add(button3);
        panel.add(label);
        panel.add(label2);
        panel.add(label3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        
        panel.add(button8);
        panel.add(button9);
       
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                button7.setEnabled(true);
                betCredits++;
                credits = credits - betCredits;
                label.setText("Credits" + credits);
                label2.setText("Bet one:" + betCredits);
                if (credits <= 0) {
                    button5.setEnabled(false);
                    credits = 0;
                    label.setText("Credits" + credits);

                }

            }
            
        });
        
        
        
        

        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                Statistics jframe=new Statistics(noOfWins,noOflosses,totalCredits);
                frame.setVisible(false);

            }
        });

        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                credits = 10;
                betCredits = 0;
                label.setText("Credits:" + credits);
                label2.setText("Bet one:" + betCredits);
                button5.setEnabled(true);
                button6.setEnabled(true);
                button7.setEnabled(false);
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                credits++;
                label.setText("Credits"+credits);
            }
        });
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                betCredits += 3;
                credits = credits - betCredits;
                label.setText("Credits" + credits);
                label2.setText("Bet one:" + betCredits);
                if (credits <= 0) {
                    
                    button6.setEnabled(false);
                    credits = 0;
                    label.setText("Credits" + credits);
                }
            }
        });

        Thread t1 = new Thread(object, "t1") {
            public void run() {
                while (true) {
                    list1 = reel.Spin();

                    spin(list1);
                    Thread.currentThread().suspend();

                }
            }
        };
        Thread t2 = new Thread(object, "t2") {
            public void run() {
                while (true) {

                    list2 = reel2.Spin();

                    spin(list2);
                    Thread.currentThread().suspend();;

                }
            }
        };
        Thread t3 = new Thread(object, "t3") {
            public void run() {

                while (true) {

                    list3 = reel3.Spin();
                    spin(list3);
                    Thread.currentThread().suspend();

                }
            }

        };
        

        t1.start();
        t1.suspend();
        t2.start();
        t2.suspend();
        t3.start();
        t3.suspend();
        
        buttonlist.add(button);
        buttonlist.add(button2);
        buttonlist.add(button3);
        list1 = reel.Spin();
        list2 = reel2.Spin();
        list3 = reel3.Spin();

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                t1.suspend();
            }
        });
        
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                t2.suspend();
            }
        });
        
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                t3.suspend();
            }
        });
     
        
        button7.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
               
                
                    
                     button.setEnabled(true);
                     button2.setEnabled(true);
                     button3.setEnabled(true);
                     
                     t1.resume();
                     t2.resume();
                     t3.resume();
                
               
                

            }

        });
        
        button.addMouseListener(new MouseListener(){

                        @Override
			public void mouseClicked(MouseEvent e) {
				
				int val =SlotMachineCalculation();
				t1.suspend();
				if(val==1){
					JOptionPane.showMessageDialog(null, "You Have Won " + creditsWon +" credits. "
							,"Congratulations!!!",JOptionPane.INFORMATION_MESSAGE);
				}else if(val==2){
					JOptionPane.showMessageDialog(null, "You got another chance to spin. "
							,"Congratulations!!!",JOptionPane.INFORMATION_MESSAGE);
				}else if(val==3){
					JOptionPane.showMessageDialog(null, "You got another chance to spin. "
							,"Congratulations!!!",JOptionPane.INFORMATION_MESSAGE);
				}else if(val==4){
					JOptionPane.showMessageDialog(null, "You got another chance to spin. "
							,"Congratulations!!!",JOptionPane.INFORMATION_MESSAGE);
				}else if(val==5){
					JOptionPane.showMessageDialog(null, "You Have Lost! ","How Unfortunate",JOptionPane.INFORMATION_MESSAGE);
				}else if(val ==6){
					JOptionPane.showMessageDialog(null,"Game Over!","Better Luck Next Time!", JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			}
                        
			public void mouseEntered(MouseEvent e) {		
			}
                     
			public void mouseExited(MouseEvent e) {
			}
                       
			public void mousePressed(MouseEvent e) {
			}
                        
			public void mouseReleased(MouseEvent e) {
			}			
		});
        
        button2.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				
				int val =SlotMachineCalculation();
				t2.suspend();
				if(val==1){
					JOptionPane.showMessageDialog(null, "You Have Won " + creditsWon +" credits. "
							,"Congratulations!!!",JOptionPane.INFORMATION_MESSAGE);
				}else if(val==2){
					JOptionPane.showMessageDialog(null, "You got another chance to spin. "
							,"Congratulations!!!",JOptionPane.INFORMATION_MESSAGE);
				}else if(val==3){
					JOptionPane.showMessageDialog(null, "You got another chance to spin. "
							,"Congratulations!!!",JOptionPane.INFORMATION_MESSAGE);
				}else if(val==4){
					JOptionPane.showMessageDialog(null, "You got another chance to spin. "
							,"Congratulations!!!",JOptionPane.INFORMATION_MESSAGE);
				}else if(val==5){
					JOptionPane.showMessageDialog(null, "You Have Lost! ","How Unfortunate",JOptionPane.INFORMATION_MESSAGE);
				}else if(val ==6){
					JOptionPane.showMessageDialog(null,"Game Over!","Better Luck Next Time!", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
			public void mouseEntered(MouseEvent e) {		
			}
			public void mouseExited(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseReleased(MouseEvent e) {
			}			
		});
			
		button3.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				
				int val =SlotMachineCalculation();
				t3.suspend();
				if(val==1){
					JOptionPane.showMessageDialog(null, "You Have Won " + creditsWon +" credits. "
							,"Congratulations!!!",JOptionPane.INFORMATION_MESSAGE);
				}else if(val==2){
					JOptionPane.showMessageDialog(null, "You got another chance to spin. "
							,"Congratulations!!!",JOptionPane.INFORMATION_MESSAGE);
				}else if(val==3){
					JOptionPane.showMessageDialog(null, "You got another chance to spin. "
							,"Congratulations!!!",JOptionPane.INFORMATION_MESSAGE);
				}else if(val==4){
					JOptionPane.showMessageDialog(null, "You got another chance to spin. "
							,"Congratulations!!!",JOptionPane.INFORMATION_MESSAGE);
				}else if(val==5){
					JOptionPane.showMessageDialog(null, "You Have Lost! ","How Unfortunate",JOptionPane.INFORMATION_MESSAGE);
				}else if(val ==6){
					JOptionPane.showMessageDialog(null,"Game Over!","Better Luck Next Time!", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			public void mouseEntered(MouseEvent e) {		
			}
			public void mouseExited(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseReleased(MouseEvent e) {
			}			
		});

    }
    
    
            

    

    public static void main(String[] args) {

        new SlotMachine();

    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
