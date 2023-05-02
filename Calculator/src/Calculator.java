import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener {
	boolean isOperationClicked=false;
	JFrame sc;
	JButton sevenbutton;
	JLabel displaylabel;
	JButton eightbutton;
	JButton ninebutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton dotbutton;
	JButton zerobutton;
	JButton equalbutton;
	JButton divbutton;
	JButton mulbutton;
	JButton minusbutton;
	JButton plusbutton;
	JButton clearbutton;
	String oldvalue;

	public Calculator() {
	sc=new JFrame("calculator");
	sc.setLayout(null);
	sc.setSize(600,600);
	sc.setVisible(true);
	sc.setLocation(300, 50);
	sc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	 displaylabel=new JLabel("");
	displaylabel.setBounds(30, 50, 540, 40);
	displaylabel.setBackground(Color.gray);
	displaylabel.setOpaque(true);
	displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
	displaylabel.setForeground(Color.white);
	sc.add(displaylabel);
	
	 sevenbutton=new JButton("7");
	sevenbutton.setBounds(30, 130, 80, 80);
	sc.add(sevenbutton);
	sevenbutton.addActionListener(this);
	
    eightbutton=new JButton("8");
	eightbutton.setBounds(130, 130, 80, 80);
	eightbutton.addActionListener(this);
	sc.add(eightbutton);
	

    ninebutton=new JButton("9");
	ninebutton.setBounds(230, 130, 80, 80);
	ninebutton.addActionListener(this);
	sc.add(ninebutton);
	
	
 fourbutton=new JButton("4");
fourbutton.setBounds(30, 230, 80, 80);
fourbutton.addActionListener(this);
	sc.add(fourbutton);
	

	fivebutton=new JButton("5");
fivebutton.setBounds(130, 230, 80, 80);
fivebutton.addActionListener(this);
	sc.add(fivebutton);
	
	

	 sixbutton=new JButton("6");
sixbutton.setBounds(230, 230, 80, 80);
sixbutton.addActionListener(this);
	sc.add(sixbutton);
	


	 onebutton=new JButton("1");
	onebutton.setBounds(30, 330, 80, 80);
	onebutton.addActionListener(this);
	sc.add(onebutton);
	

	 twobutton=new JButton("2");
	twobutton.setBounds(130, 330, 80, 80);
	twobutton.addActionListener(this);
	sc.add(twobutton);
	
	

	threebutton=new JButton("3");
	threebutton.setBounds(  230, 330, 80, 80);
	threebutton.addActionListener(this);
	sc.add(threebutton);
	
	 dotbutton=new JButton(".");
dotbutton.setBounds(30, 430, 80, 80);
dotbutton.addActionListener(this);
	sc.add(dotbutton);
	

	 zerobutton=new JButton("0");
zerobutton.setBounds(130, 430, 80, 80);
zerobutton.addActionListener(this);
	sc.add(zerobutton);
	
	

	 equalbutton=new JButton("=");
equalbutton.setBounds(230,430, 80, 80);
equalbutton.addActionListener(this);
	sc.add(equalbutton);
	

    plusbutton=new JButton("+");
	plusbutton.setBounds(330,430, 80, 80);
	plusbutton.addActionListener(this);
	sc.add(plusbutton);
	
	
	 mulbutton=new JButton("*");
		mulbutton.setBounds(330, 230, 80, 80);
		mulbutton.addActionListener(this);
		sc.add(mulbutton);
		
		


		 divbutton=new JButton("/");
		divbutton.setBounds(  330, 130, 80, 80);
		divbutton.addActionListener(this);
		sc.add(divbutton);
		
		
	
	
	

	minusbutton=new JButton("-");
	minusbutton.setBounds(330, 330, 80, 80);
	minusbutton.addActionListener(this);
	sc.add(minusbutton);
	
	

	

    clearbutton=new JButton("clear");
	clearbutton.setBounds(430,430, 80, 80);
	clearbutton.addActionListener(this);
	sc.add(clearbutton);


	
	

	
	
	
	
	
	
}


public static void main(String[] args) {
	new Calculator();
}



			@Override
			public void actionPerformed(ActionEvent e) {
			    if(e.getSource()==sevenbutton) {
			        if(isOperationClicked) {
			            displaylabel.setText("7");
			        }else {
			            displaylabel.setText(displaylabel.getText()+"7");
			        }
			    }else if(e.getSource()==eightbutton){
			        if(isOperationClicked) {
			            displaylabel.setText("8");
			        }else {
			            displaylabel.setText(displaylabel.getText()+"8");
			        }
			    }else if(e.getSource()==ninebutton) {
			        if(isOperationClicked) {
			            displaylabel.setText("9");
			        }else {
			            displaylabel.setText(displaylabel.getText()+"9");
			        }
			    }else if(e.getSource()==fourbutton) {
			        if(isOperationClicked) {
			            displaylabel.setText("4");
			        }else {
			            displaylabel.setText(displaylabel.getText()+"4");
			        }
			    }else if(e.getSource()==fivebutton) {
			        if(isOperationClicked) {
			            displaylabel.setText("5");
			        }else {
			            displaylabel.setText(displaylabel.getText()+"5");
			        }
			    }else if(e.getSource()==sixbutton) {
			        if(isOperationClicked) {
			            displaylabel.setText("6");
			        }else {
			            displaylabel.setText(displaylabel.getText()+"6");
			        
			        }

			    }else if(e.getSource()==onebutton){	       
		if(isOperationClicked) {
			displaylabel.setText("1");
	}else {
		displaylabel.setText(displaylabel.getText()+"1");
		}	
		
		displaylabel.setText(displaylabel.getText()+"1");
		
		
	}else if(e.getSource()==twobutton) {
		if(isOperationClicked) {
			displaylabel.setText("2");
	}else {
		displaylabel.setText(displaylabel.getText()+"2");
		}	}else if(e.getSource()==twobutton){
		
		displaylabel.setText(displaylabel.getText()+"2");
	
		}else if(e.getSource()==threebutton) {
			if(isOperationClicked) {
				displaylabel.setText("3");
		}else {
			displaylabel.setText(displaylabel.getText()+"3");
			}	}else if(e.getSource()==threebutton){
			
		displaylabel.setText(displaylabel.getText()+"3");
	
	}else if(e.getSource()==dotbutton) {
		displaylabel.setText(".");
	}else if(e.getSource()==zerobutton) {
		displaylabel.setText("0");
	}else if(e.getSource()==equalbutton) {
		    String newvalue=displaylabel.getText();
		    float oldvaluef=Float.parseFloat(oldvalue);
		    float newvaluef=Float.parseFloat(newvalue);
		    float result=oldvaluef+newvaluef;
		    displaylabel.setText(result+"");
	}else if(e.getSource()==plusbutton) {
		isOperationClicked=true;
		displaylabel.getText();
	}else if(e.getSource()==mulbutton) {
		displaylabel.setText("*");
	
		

	}else if(e.getSource()==divbutton) {
		
		displaylabel.setText("/");
		
	}else if(e.getSource()==minusbutton) {
		
		displaylabel.setText("-");
		
	
	}	else if(e.getSource()==clearbutton) {
				displaylabel.setText("");
		
	}
			}}