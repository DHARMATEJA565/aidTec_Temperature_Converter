import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Temp_Converter{

	public static void main(String[] args){

		Conv obj = new Conv();

	}
}

class Conv extends JFrame implements ActionListener {
	JLabel title,label1,label2,label3,label4;

	JTextField t1,t2,t3;

	JButton b1,b2;

	public Conv () {

		title = new JLabel("               TEMPERATURE CONVERTER");
		title.setBounds(0,5,780,40);
		title.setForeground(Color.RED);
		title.setFont(new Font(Font.SERIF,Font.BOLD,28));
		title.setBackground(Color.WHITE);
		title.setOpaque(true);
		add(title);

		label1 = new JLabel("Celsius :");
		label1.setBounds(100,150,100,25);
		label1.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
		label1.setForeground(Color.RED);
		add(label1);

		t1 = new JTextField();
		t1.setBounds(220,150,80,20);
		add(t1);

		label2 = new JLabel("Fahrenheit :");
		label2.setBounds(100,200,120,25);
		label2.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
		label2.setForeground(Color.GREEN);
		add(label2);

		t2 = new JTextField();
		t2.setBounds(220,200,80,20);
		add(t2);

		label3 = new JLabel("Kelvin :");
		label3.setBounds(100,250,100,25);
		label3.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
		label3.setForeground(Color.BLUE);
		add(label3);

		t3 = new JTextField();
		t3.setBounds(220,250,80,20);
		add(t3);

		b1 = new JButton("CONVERT");
		b1.setBounds(80,350,100,25);//x axis,yaxis,width,height
		add(b1);

		b2 = new JButton("RESET");
		b2.setBounds(250,350,100,25);//x axis,yaxis,width,height
		add(b2);
		
		label4 = new JLabel("Temperature");
		label4.setIcon(new ImageIcon("C:/Users/LENOVO/Desktop/dharma/Internship/temp.jpg"));
		label4.setBounds(360,50,400,500);
		add(label4);

		b1.addActionListener(this);
		b2.addActionListener(this);
		setSize(780,560);  //width and height 
		setLayout(null);
		setVisible(true);
		setTitle("TEMPERATURE CONVERTER");
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
 	}

	public void actionPerformed(ActionEvent ae) {

	     Double val1,val2;

	     try{
			
		if(ae.getSource()==b1){

			if(!(t1.getText().isEmpty())){

	     			Double num1 = Double.parseDouble(t1.getText());
                	
				val1 = (num1 *9/5)+32;
				val2 = num1 + 273.15;

				t2.setText(String.format("%.2f",val1) + "\u00B0"+"F");
				t3.setText(String.format("%.2f",val2)+ "K");
			}

			else if(!(t2.getText().isEmpty())){
				Double num2 = Double.parseDouble(t2.getText());
				val1 = (num2 -32)*5/9;
				val2 = val1+273.15;

				t1.setText(String.format("%.2f",val1)+ "\u00B0"+"C");
				t3.setText(String.format("%.2f",val2)+ "K");

			}

			else if(!(t3.getText().isEmpty())){
				
				Double num3 = Double.parseDouble(t3.getText());
				val1 = num3 - 273.15;
				val2 = ((num3 - 273.15)*9/5 )+32;

				t1.setText(String.format("%.2f",val1) +"\u00B0"+"C");
				t2.setText(String.format("%.2f",val2)+"\u00B0"+"F");


			}
		}
		
		else if(ae.getSource()==b2){
			
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	     }
    	     
	    catch(Exception e){

		
	     }

	}	
}