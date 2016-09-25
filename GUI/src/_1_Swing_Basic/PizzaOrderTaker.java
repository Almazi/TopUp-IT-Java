package _1_Swing_Basic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class PizzaOrderTaker implements ActionListener, ItemListener {
	
	JFrame frame;
	JLabel nameLabel;
	JLabel addressLabel;
	JLabel pizzaTypeLabel;
	JLabel pizzaSizeLabel;
	JLabel toppingsLabel;
	JLabel quantityLabel;
	JLabel totalLabel;
	JLabel totalFinalLabel;
	
	JTextField nameText;
	JTextArea addressText;
	
	JComboBox typeMenu;
	JComboBox quantityMenu;
	
	JRadioButton largeRadioButton;
	JRadioButton mediumRadioButton;
	JRadioButton smallRadioButton;
	ButtonGroup sizeButtonGroup;
	
	JCheckBox toppingCheeseBox;
	JCheckBox toppingSausageBox;
	JCheckBox toppingBaconBox;
	
	JButton orderButton;
	JButton cancelButton;
	
	
	PizzaOrderTaker(){
		frame = new JFrame("Take The Order");
		frame.setBounds(500, 100, 350, 550);
		nameLabel = new JLabel("Name :");
		nameLabel.setBounds(30,20,100,50);
		
		addressLabel = new JLabel("Address :");
		addressLabel.setBounds(30,70,100,50);
		
		pizzaTypeLabel = new JLabel("Type :");
		pizzaTypeLabel.setBounds(30,170,100,50);
		
		pizzaSizeLabel = new JLabel("Size :");
		pizzaSizeLabel.setBounds(30,220,100,50);
		
		toppingsLabel = new JLabel("Toppings :");
		toppingsLabel.setBounds(30,275,100,50);

		quantityLabel = new JLabel("Quantity :");
		quantityLabel.setBounds(30,400,100,50);
		
		totalLabel = new JLabel("Total: ");
		totalLabel.setBounds(220,460,50,30);
		
		totalFinalLabel = new JLabel("0 /-");
		totalFinalLabel.setBounds(270,460,50,30);
		
		
		nameText = new JTextField();
		nameText.setBounds(130,30,170,30);
		
		addressText = new JTextArea();
		addressText.setBounds(130,80,170,80);

		typeMenu = new JComboBox();
		typeMenu.setBounds(130, 180, 170, 30);
		typeMenu.addItem("New York-Style Pizza");
		typeMenu.addItem("Neapolitan Pizza");
		typeMenu.addItem("Deep Dish Pizza");

		largeRadioButton = new JRadioButton("Large for 6 Person");
		largeRadioButton.setBounds(120, 220, 170, 30);
		mediumRadioButton = new JRadioButton("Medium for 4 Person");
		mediumRadioButton.setBounds(120, 240, 170, 30);
		smallRadioButton = new JRadioButton("Small for 2 Person");
		smallRadioButton.setBounds(120, 260, 170, 30);
		
		sizeButtonGroup =  new ButtonGroup();
		sizeButtonGroup.add(largeRadioButton);
		sizeButtonGroup.add(mediumRadioButton);
		sizeButtonGroup.add(smallRadioButton);
		
		
		toppingCheeseBox = new JCheckBox("Extra Cheese!");
		toppingCheeseBox.setBounds(120, 290, 170, 30);
		
		toppingSausageBox = new JCheckBox("Sausage!");
		toppingSausageBox.setBounds(120, 320, 170, 30);
		
		toppingBaconBox = new JCheckBox("Bacon!");
		toppingBaconBox.setBounds(120, 350, 170, 30);
		
		
		quantityMenu = new JComboBox();
		quantityMenu.setBounds(130, 415, 100, 30);
		quantityMenu.addItem("1");
		quantityMenu.addItem("2");
		quantityMenu.addItem("3");
		quantityMenu.addItem("4");
		quantityMenu.addItem("5");
		quantityMenu.addItem("6");
		quantityMenu.addItem("7");
		quantityMenu.addItem("8");
		quantityMenu.addItem("9");
		quantityMenu.addItem("10");
		
		orderButton = new JButton("Order");
		orderButton.setBounds(30,460,70,30);
		orderButton.addActionListener(this);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBounds(120,460,80,30);
		cancelButton.addActionListener(this);
		
		frame.add(nameLabel);
		frame.add(addressLabel);
		frame.add(pizzaTypeLabel);
		frame.add(pizzaSizeLabel);
		frame.add(toppingsLabel);
		frame.add(quantityLabel);
		frame.add(nameText);
		frame.add(addressText);
		frame.add(typeMenu);
		frame.add(largeRadioButton);
		frame.add(mediumRadioButton);
		frame.add(smallRadioButton);
		frame.add(toppingCheeseBox);
		frame.add(toppingSausageBox);
		frame.add(toppingBaconBox);
		frame.add(quantityMenu);
		frame.add(orderButton);
		frame.add(cancelButton);
		frame.add(totalLabel);
		frame.add(totalFinalLabel);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String name;
		String address;
		String total;
		int pizzaPrice = 0;
		int toppingPrice = 0;;
		int totals = 0;
		int quantity = 0;
		
		String type;
		String size = null;
		String toppings = " ";
		String quantityString;
		
		if(e.getSource() == orderButton){
			System.out.println(pizzaPrice);
			name = nameText.getText();
			address = addressText.getText();
			type = typeMenu.getSelectedItem().toString();
			if(largeRadioButton.isSelected()){
				size = largeRadioButton.getText();
				pizzaPrice = 1099;
			}
			if(mediumRadioButton.isSelected()){
				size = mediumRadioButton.getText();
				pizzaPrice = 799;
			}
			if(smallRadioButton.isSelected()){
				size = smallRadioButton.getText();
				pizzaPrice = 599;
			}
			if(toppingCheeseBox.isSelected()){
				toppings = toppings + toppingCheeseBox.getText() + ", ";
				toppingPrice = toppingPrice + 60;
			}
			if(toppingSausageBox.isSelected()){
				toppings = toppings + toppingSausageBox.getText() + ", ";
				toppingPrice = toppingPrice + 90;
			}
			if(toppingBaconBox.isSelected()){
				toppings = toppings + toppingBaconBox.getText() + ", ";
				toppingPrice = toppingPrice + 120;
			}
			quantity = quantityMenu.getSelectedIndex()+1;
			quantityString = quantityMenu.getSelectedItem().toString();
			
			totals = quantity * (pizzaPrice + toppingPrice); 
			total = totals+" /-";
			totalFinalLabel.setText(total);
			JOptionPane.showMessageDialog(null, "Order Detail:\n"+"Name: "+name+
					"\nAddress: "+address+"\nType: "+type+"\nSize: "+size+"\nQuantity: "+
					quantityString+"\nToppings: "+toppings+"\nTotal: "+total);
		}
		else{
			nameText.setText("");
			addressText.setText("");
			typeMenu.setSelectedIndex(0);;
			sizeButtonGroup.clearSelection();
			toppingCheeseBox.setSelected(false);
			toppingSausageBox.setSelected(false);
			toppingBaconBox.setSelected(false);
			quantityMenu.setSelectedIndex(0);
			totalFinalLabel.setText("0 /-");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PizzaOrderTaker();

	}

}
