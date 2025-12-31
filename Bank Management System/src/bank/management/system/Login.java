package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener {
    
	JTextField cardTextField;
	JButton login,signup,clear;
	JPasswordField pinTextField;
	Login(){
		setTitle("ATM");
		setLayout(null);
		//ADDING IMAGE ICON TO THE FRAME
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("bank-icon.jpg"));
		Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel label=new JLabel(i3);
		label.setBounds(70, 10, 100, 100);	
		add(label);
		
		//ADDING WELCOME LABEL TO THE FRAME
		JLabel text=new JLabel("Welcome to ATM");
		text.setFont(new Font("Osward",Font.BOLD,38));
		text.setBounds(200,40 ,400 ,40 );
		add(text);
		
		//ADDING CARDNO LABEL TO THE FRAME
		JLabel cardno=new JLabel("Card No:");
		cardno.setFont(new Font("Raleway",Font.BOLD,28));
		cardno.setBounds(120,150 ,150 ,40 );
		add(cardno);	
		//ADDING TEXTFIELD FOR CARDNO TO THE FRAME
		cardTextField=new JTextField();
		cardTextField.setBounds(300,150 ,230 ,30 );
		cardTextField.setFont(new Font("Arial",Font.BOLD,14));
		add(cardTextField);
		
		//ADDING PIN LABEL TO THE FRAME
		JLabel pin=new JLabel("PIN:");
		pin.setFont(new Font("Raleway",Font.BOLD,28));
		pin.setBounds(120,220 ,250 ,30 );
		add(pin);
		//ADDING PASSWORDFIELD FOR PIN TO THE FRAME
		pinTextField=new JPasswordField();
		pinTextField.setBounds(300,220 ,230 ,30 );
		pinTextField.setFont(new Font("Arial",Font.BOLD,14));
	    add(pinTextField);
	    
	    //ADDING SIGN IN BUTTON 
	    login=new JButton("SIGN IN");
	    login.setBounds(300,300,100,30);
	    login.setBackground(Color.BLUE);
	    login.setForeground(Color.WHITE);
	    login.addActionListener(this);
	    add(login);
		//ADDING CLEAR BUTTON TO FRAME	
	    clear=new JButton("CLEAR");
	    clear.setBounds(430,300,100,30);
	    clear.setBackground(Color.BLUE);
	    clear.setForeground(Color.WHITE);
	    clear.addActionListener(this);
	    add(clear);
	    //ADDING SIGN UP BUTTON TO THE FRAME	
	    signup=new JButton("SIGN UP");
	    signup.setBounds(300,350,230,30);
	    signup.setBackground(Color.BLUE);
	    signup.setForeground(Color.WHITE);
	    signup.addActionListener(this);
	    add(signup);
	    
		getContentPane().setBackground(Color.lightGray);
		setSize(800,480);
		setVisible(true);
		setLocation(350,200);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==clear) {
			cardTextField.setText("");
			pinTextField.setText("");
		}else if(ae.getSource()==login) {
			Conn conn=new Conn();
			String cardnumber=cardTextField.getText();
			String pinnumber=pinTextField.getText();
			String query="select *from login where cardnumber='"+cardnumber+"' and Pin='"+pinnumber+"'";
			try {
				ResultSet rs=conn.s.executeQuery(query);
				if(rs.next()) {
					setVisible(false);
					new Transactions(pinnumber).setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
				}
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(ae.getSource()==signup) {
			setVisible(false);
			new SignupOne().setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new Login();
	}

}
