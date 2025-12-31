package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SignupTwo extends JFrame implements ActionListener{
	
	JTextField panTextField,adharTextField;
	JButton next;
	JRadioButton syes,sno,eyes,eno;
	JComboBox religionComboBox,categoryComboBox,incomeComboBox,educationComboBox,
	occupationComboBox;
	String formno;
	SignupTwo(String formno){
		this.formno=formno;
		
		setLayout(null);
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2 ");
		
		//ADDING LABELS TO FRAME
		JLabel additionalDetails=new JLabel("Page 2: Additional Detail");
		additionalDetails.setFont(new Font("raleway",Font.BOLD,22));
		additionalDetails.setBounds(290, 80, 400, 30);
		add(additionalDetails);
		
		/*ADDING RELIGION LABEL AND ITS COMBOBOX*/
		JLabel religion=new JLabel("Religion:");
		religion.setFont(new Font("raleway",Font.BOLD,20));
		religion.setBounds(100, 140, 100, 30);
		add(religion);
		
		String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
		religionComboBox=new  JComboBox(valReligion);
		religionComboBox.setBounds(300, 140, 400, 30);
		religionComboBox.setBackground(Color.WHITE);
		add(religionComboBox);
		
		
		/*ADDING CATEGORY LABEL AND ITS COMBOBOX*/
		JLabel fname=new JLabel("Category:");
		fname.setFont(new Font("raleway",Font.BOLD,20));
		fname.setBounds(100, 190, 200, 30);
		add(fname);
		
		String valCategory[]={"General","OBC/SEBC","SC","ST","Other"};
		categoryComboBox=new  JComboBox(valCategory);
		categoryComboBox.setBounds(300, 190, 400, 30);
		categoryComboBox.setBackground(Color.WHITE);
		add(categoryComboBox);
		
		
		/*ADDING INCOME LABEL AND ITS COMBOBOX*/
		JLabel income=new JLabel("Income:");
		income.setFont(new Font("raleway",Font.BOLD,20));
		income.setBounds(100, 240, 200, 30);
		add(income);
		
		String valIncome[]={"Null","< 1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
		incomeComboBox=new  JComboBox(valIncome);
		incomeComboBox.setBounds(300, 240, 400, 30);
		incomeComboBox.setBackground(Color.WHITE);
		add(incomeComboBox);
		
		/*ADDING EDUCATIONAL AND QUALIFICATIONS LABEL AND ITS COMBOBOX*/
		JLabel education=new JLabel("Educational:");
		education.setFont(new Font("raleway",Font.BOLD,20));
		education.setBounds(100, 290, 200, 30);
		add(education);
		
		JLabel qualifi=new JLabel("Qualifications:");
		qualifi.setFont(new Font("raleway",Font.BOLD,20));
		qualifi.setBounds(100, 315, 200, 30);
		add(qualifi);
		
		String educationValues[]= {"Non-Graduate","Graduate","Post graduate","Doctorate","Other"};
		educationComboBox=new  JComboBox(educationValues);
		educationComboBox.setBounds(300, 315, 400, 30);
		educationComboBox.setBackground(Color.WHITE);
		add(educationComboBox);
		
		
		/*ADDING Occupation LABEL AND ITS COMBOBOX*/
		JLabel occupation=new JLabel("Occupation:");
		occupation.setFont(new Font("raleway",Font.BOLD,20));
		occupation.setBounds(100, 390, 200, 30);
		add(occupation);
		
		String occupationValues[]= {"Salaried","Self-Employed","Bussiness","Student","Retired","Other"};
		occupationComboBox=new  JComboBox(occupationValues);
		occupationComboBox.setBounds(300, 390, 400, 30);
		occupationComboBox.setBackground(Color.WHITE);
		add(occupationComboBox);
		
		/*ADDING PAN LABEL AND ITS TEXTFIELD*/
		JLabel pan=new JLabel("PAN Number:");
		pan.setFont(new Font("raleway",Font.BOLD,20));
		pan.setBounds(100, 440, 200, 30);
		add(pan);
		
		panTextField=new  JTextField();
		panTextField.setFont(new Font("raleway",Font.BOLD,14));
		panTextField.setBounds(300, 440, 400, 30);
		add(panTextField);
		
		
		/*ADDING ADHAR NO. LABEL AND ITS TEXTFIELD*/
		JLabel adhar=new JLabel("Adhar Number:");
		adhar.setFont(new Font("raleway",Font.BOLD,20));
		adhar.setBounds(100, 490, 200, 30);
		add(adhar);
		
		adharTextField=new  JTextField();
		adharTextField.setFont(new Font("raleway",Font.BOLD,14));
		adharTextField.setBounds(300, 490, 400, 30);
		add(adharTextField);
		
		/*ADDING SENIOR CITIZEN LABEL AND ITS RADIO BUTTONS*/
		JLabel senior=new JLabel("Senior Citizen:");
		senior.setFont(new Font("raleway",Font.BOLD,20));
		senior.setBounds(100, 540, 200, 30);
		add(senior);
		
		syes=new JRadioButton("Yes");
		syes.setBounds(300,540,100,30);
		syes.setBackground(Color.lightGray);
		add(syes);
		
		sno=new JRadioButton("No");
		sno.setBounds(450,540,100,30);
		sno.setBackground(Color.lightGray);
		add(sno);
		
		ButtonGroup seniorgroup=new ButtonGroup();
		seniorgroup.add(syes);
		seniorgroup.add(sno);
		
		
		/*ADDING EXISITING A/C LABEL AND ITS RADIO BUTTONS*/
		JLabel existingAc=new JLabel("Exisiting Acoount:");
		existingAc.setFont(new Font("raleway",Font.BOLD,20));
		existingAc.setBounds(100, 590, 200, 30);
		add(existingAc);
		
		eyes=new JRadioButton("Yes");
		eyes.setBounds(300,590,100,30);
		eyes.setBackground(Color.lightGray);
		add(eyes);
		
		eno=new JRadioButton("No");
		eno.setBounds(450,590,100,30);
		eno.setBackground(Color.lightGray);
		add(eno);
		
		ButtonGroup existingAccountgroup=new ButtonGroup();
		existingAccountgroup.add(syes);
		existingAccountgroup.add(sno);
		
				
		//ADDING NEXT BUTTON TO FRAME
		JButton next=new JButton("Next");
		next.setBackground(Color.BLUE);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway",Font.BOLD,16));
		next.setBounds(620,660,80,30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.lightGray);
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
	}
		
	public void actionPerformed(ActionEvent ae) {
		
		String religion=(String)religionComboBox.getSelectedItem();
		String category=(String)categoryComboBox.getSelectedItem();;
		String income=(String)incomeComboBox.getSelectedItem();;
		String education=(String)educationComboBox.getSelectedItem();;
		String occupation=(String)occupationComboBox.getSelectedItem();;
		String pan=panTextField.getText();
		String adhar=adharTextField.getText();
		
		String seniorCitizen=null;
		if(syes.isSelected()) {
			seniorCitizen="Yes";
		}else if(sno.isSelected()){
			seniorCitizen="No";
		}
	
		String exisitingAc=null;
		if(eyes.isSelected()) {
			exisitingAc="Yes";
		}else if(eno.isSelected()) {
			exisitingAc="No";
		}
				
		try {
			Conn c=new Conn();
			String query="insert into signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+adhar+"','"+seniorCitizen+"','"+exisitingAc+"')";
			c.s.executeUpdate(query);
			  
			//Signup3 Object
			setVisible(false);
			new SignupThree(formno).setVisible(true);
		}catch(Exception e){
			System.out.print(e);
		}
	}
	
	public static void main(String[] args) {
		new SignupTwo("");
	}

}
