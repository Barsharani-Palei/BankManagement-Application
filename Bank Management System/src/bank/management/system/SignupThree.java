package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class SignupThree extends JFrame implements ActionListener{
	
	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JButton submit,cancel;
	String formno;
    SignupThree(String formno){
    	this.formno=formno;
    	setLayout(null);
    	JLabel l1=new JLabel("Page 3: Account Details");
    	l1.setFont(new Font("Raleway",Font.BOLD,22));
    	l1.setBounds(280,40,400,40);
    	add(l1);
    	
    	//ADDING ACCOUNT TYPE LABEL AND ITS RADIOBUTTONS
    	JLabel typeAc=new JLabel("Account Type");
    	typeAc.setFont(new Font("Raleway",Font.BOLD,22));
    	typeAc.setBounds(100,140,200,40);
    	add(typeAc);
    	
    	r1=new JRadioButton("Saving Accounts");
    	r1.setFont(new Font("Raleway",Font.BOLD,16));
    	r1.setBackground(Color.lightGray);
    	r1.setBounds(100,180,200,20);
    	add(r1);
    	
    	r2=new JRadioButton("Fixed Deposit Account");
    	r2.setFont(new Font("Raleway",Font.BOLD,16));
    	r2.setBackground(Color.lightGray);
    	r2.setBounds(350,180,200,20);
    	add(r2);
    	
    	r3=new JRadioButton("Current Accounts");
    	r3.setFont(new Font("Raleway",Font.BOLD,16));
    	r3.setBackground(Color.lightGray);
    	r3.setBounds(100,220,200,20);
    	add(r3);
    	
    	r4=new JRadioButton("Recurring Deposit Account ");
    	r4.setFont(new Font("Raleway",Font.BOLD,16));
    	r4.setBackground(Color.lightGray);
    	r4.setBounds(350,220,250,20);
    	add(r4);
    	
    	ButtonGroup groupAccount=new ButtonGroup(); 
    	groupAccount.add(r1);   groupAccount.add(r2);
    	groupAccount.add(r3);   groupAccount.add(r4);
    	
    	
    	//ADDING CARD AND CARDNUMBER,CARDDETAIL LABEL 
    	JLabel card=new JLabel("Card Number");
    	card.setFont(new Font("Raleway",Font.BOLD,22));
    	card.setBounds(100,300,200,30);
    	add(card);
    	
    	JLabel cardnumber=new JLabel("XXXX-XXXX-XXXX-4523");
    	cardnumber.setFont(new Font("Raleway",Font.BOLD,22));
    	cardnumber.setBounds(330,300,300,30);
    	add(cardnumber);
    	
    	JLabel carddetail=new JLabel("Your 16 Digit Card Number");
    	carddetail.setFont(new Font("Raleway",Font.BOLD,12));
    	carddetail.setBounds(100,330,300,20);
    	add(carddetail);
    	
    	//ADDING PIN AND PINNUMBER,PINDETAIL LABEL 
    	JLabel pin=new JLabel("Pin");
    	pin.setFont(new Font("Raleway",Font.BOLD,22));
    	pin.setBounds(100,370,100,30);
    	add(pin);
    	
    	JLabel pinnumber=new JLabel("XXXX");
    	pinnumber.setFont(new Font("Raleway",Font.BOLD,22));
    	pinnumber.setBounds(330,370,100,40);
    	add(pinnumber);
    	
    	JLabel pindetail=new JLabel("Your 4 Digit Password");
    	pindetail.setFont(new Font("Raleway",Font.BOLD,12));
    	pindetail.setBounds(100,400,300,20);
    	add(pindetail);
    	
    	
    	//ADDING SERVICE REQUIRED LABEL AND ITS CHECKBOX
    	JLabel services=new JLabel("Service Required:");
    	services.setFont(new Font("Raleway",Font.BOLD,22));
    	services.setBounds(100,450,200,30);
    	add(services);
    	
    	c1=new JCheckBox("ATM Card");
    	c1.setBackground(Color.lightGray);
    	c1.setFont(new Font("Raleway",Font.BOLD,16));
    	c1.setBounds(100,500,200,30);
    	add(c1);
    	
    	c2=new JCheckBox("Internet Banking");
    	c2.setBackground(Color.lightGray);
    	c2.setFont(new Font("Raleway",Font.BOLD,16));
    	c2.setBounds(350,500,200,30);
    	add(c2);
    	
    	c3=new JCheckBox("Mobile Banking");
    	c3.setBackground(Color.lightGray);
    	c3.setFont(new Font("Raleway",Font.BOLD,16));
    	c3.setBounds(100,550,200,30);
    	add(c3);
    	
    	c4=new JCheckBox("Email & SMS alerts");
    	c4.setBackground(Color.lightGray);
    	c4.setFont(new Font("Raleway",Font.BOLD,16));
    	c4.setBounds(350,550,200,30);
    	add(c4);
    	
    	c5=new JCheckBox("Check Book");
    	c5.setBackground(Color.lightGray);
    	c5.setFont(new Font("Raleway",Font.BOLD,16));
    	c5.setBounds(100,600,200,30);
    	add(c5);
    	
    	c6=new JCheckBox("E-Statement");
    	c6.setBackground(Color.lightGray);
    	c6.setFont(new Font("Raleway",Font.BOLD,16));
    	c6.setBounds(350,600,200,30);
    	add(c6);
    	
    	c7=new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge ");
    	c7.setBackground(Color.lightGray);
    	c7.setFont(new Font("Raleway",Font.BOLD,16));
    	c7.setBounds(100,680,700,30);
    	add(c7);
    	
    	
    	//ADDING SUBMIT AND CANCEL BBUTTONS
    	submit=new JButton("Submit");
    	submit.setBackground(Color.BLUE);
    	submit.setForeground(Color.WHITE);
    	submit.setFont(new Font("Raleway",Font.BOLD,14));
    	submit.setBounds(250,720,100,30);
    	submit.addActionListener(this);
    	add(submit);
    	
    	cancel=new JButton("Cancel");
    	cancel.setBackground(Color.BLUE);
    	cancel.setForeground(Color.WHITE);
    	cancel.setFont(new Font("Raleway",Font.BOLD,14));
    	cancel.setBounds(420,720,100,30);
    	cancel.addActionListener(this);
    	add(cancel);
    	
    	getContentPane().setBackground(Color.lightGray);
		setSize(850,820);
		setLocation(350,10);
		setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
    	if(ae.getSource()==submit) {
    		String accountType=null;
    		if(r1.isSelected()) {
    			accountType="Saving Account";
    		}else if(r2.isSelected()) {
    			accountType="Fixed Deposit Account";
    	    }else if(r3.isSelected()) {
    			accountType="Current Account";
    	    }else if(r4.isSelected()) {
    			accountType="Recurring Deposit Account";
    	    }
    		
    		Random random=new Random();
    		String cardnumber=""+Math.abs((random.nextLong()% 90000000L)+5040936000000000L);
    		
    		String pinnumber=""+Math.abs((random.nextLong()% 9000L)+1000L);
            
    		String facility="";
    		if(c1.isSelected()) {
    			facility=facility+" ATM Card";
    		}else if(c2.isSelected()) {
    			facility=facility+" Internet Banking";
    		}else if(c3.isSelected()) {
    			facility=facility+" Mobile Banking";
    		}else if(c4.isSelected()) {
    			facility=facility+" Email & SMS Alerts";
    		}else if(c5.isSelected()) {
    			facility=facility+" Cheque Book";
    		}else if(c6.isSelected()) {
    			facility=facility+" E-Statement";
    		}
    	
    	try {
    		if(accountType.equals("")) {
    			JOptionPane.showMessageDialog(null,"Account Type is required");
    		}else {
    			Conn conn=new Conn();
    			String query1="insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
    			String query2="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
    			conn.s.executeUpdate(query1);
    			conn.s.executeUpdate(query2);
    			JOptionPane.showMessageDialog(null,"Card Number: "+cardnumber+"\n pin: "+pinnumber);
    			setVisible(false);
    			new Deposit(pinnumber).setVisible(true);
    		}
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    	
    	} else if(ae.getSource()==cancel) {
    	   setVisible(false);
    	   new Login().setVisible(true);
        }
   }
	public static void main(String[] args) {
		new SignupThree("");
	}

}
