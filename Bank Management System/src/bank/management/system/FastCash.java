package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;
public class FastCash extends JFrame implements ActionListener{

	JButton withdraw100,withdraw500,withdraw1000,withdraw2000,withdraw5000,withdraw10000,back;
	String pinnumber;
	FastCash(String pinnumber) {
		this.pinnumber=pinnumber;
		setLayout(null);
		
		//ADDING ATM IMAGE TO THE FRAME
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
	    JLabel image=new JLabel(i3);
	    image.setBounds(0, 0, 900, 900);
	    add(image);
	    
	    JLabel text=new JLabel("SELECT WITHDRAWL AMOUNT");
	    text.setBounds(210,300,700,35);
	    text.setForeground(Color.WHITE);
	    text.setFont(new Font("System",Font.BOLD,16));
	    image.add(text);
	    
	    //ADDING BUTTONS TO SCREEN
	    withdraw100=new JButton("Rs 100");
	    withdraw100.setBounds(170,415,150,30);
	    withdraw100.setBackground(Color.BLUE);
	    withdraw100.setForeground(Color.WHITE);
	    withdraw100.addActionListener(this);
	    image.add(withdraw100);
	    
	    withdraw500=new JButton("Rs 500");
	    withdraw500.setBounds(355,415,150,30);
	    withdraw500.setBackground(Color.BLUE);
	    withdraw500.setForeground(Color.WHITE);
	    withdraw500.addActionListener(this);
	    image.add(withdraw500);
	    
	    withdraw1000=new JButton("Rs 1000");
	    withdraw1000.setBounds(170,450,150,30);
	    withdraw1000.setBackground(Color.BLUE);
	    withdraw1000.setForeground(Color.WHITE);
	    withdraw1000.addActionListener(this);
	    image.add(withdraw1000);
	    
	    withdraw2000=new JButton("Rs 2000");
	    withdraw2000.setBounds(355,450,150,30);
	    withdraw2000.setBackground(Color.BLUE);
	    withdraw2000.setForeground(Color.WHITE);
	    withdraw2000.addActionListener(this);
	    image.add(withdraw2000);
	    
	    withdraw5000=new JButton("Rs 5000");
	    withdraw5000.setBounds(170,485,150,30);
	    withdraw5000.setBackground(Color.BLUE);
	    withdraw5000.setForeground(Color.WHITE);
	    withdraw5000.addActionListener(this);
	    image.add(withdraw5000);
	    
	    withdraw10000=new JButton("Rs 10000");
	    withdraw10000.setBounds(355,485,150,30);
	    withdraw10000.setBackground(Color.BLUE);
	    withdraw10000.setForeground(Color.WHITE);
	    withdraw10000.addActionListener(this);
	    image.add(withdraw10000);
	    
	    back=new JButton("Back");
	    back.setBounds(355,520,150,30);
	    back.setBackground(Color.BLUE);
	    back.setForeground(Color.WHITE);
	    back.addActionListener(this);
	    image.add(back);
	  
		setSize(900,900);
		setLocation(300,0);
		/*setDecorated(false);*/
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==back) {
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}else{
			String amount=((JButton)ae.getSource()).getText().substring(3);
			Conn c=new Conn();
			try {
				ResultSet rs=c.s.executeQuery("select *from bank where Pin='"+pinnumber+"'");
				int balance=0;
				while(rs.next()) {
					if(rs.getString("Type").equals("Deposit")) {
						balance+=Integer.parseInt(rs.getString("Amount"));
					}else {
						balance-=Integer.parseInt(rs.getString("Amount"));
					}
				}
				
				if(ae.getSource() !=back && balance < Integer.parseInt(amount)) {
					JOptionPane.showMessageDialog(null,"Insufficient Balance");
					return;
				}
				
				Date date=new Date();
				String query="insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
				c.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Rs"+amount+"Debited Successfully");
				
				setVisible(true);
				new Transactions(pinnumber).setVisible(true);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		new FastCash("");
	}

}
