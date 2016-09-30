package _1_Basics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class _1_Add_Remove_Display implements ActionListener, ItemListener {
	
	JFrame frame;
	
	JLabel interfaceLabel;
	JLabel classLabel;
	JLabel objectLabel;
	JLabel valueLabel;
	
	JComboBox interfaceMenu;
	JComboBox listMenu;
	JComboBox setMenu;
	JComboBox mapMenu;
	
	JTextField objectText;
	JTextField valueText;
	
	JButton addButton;
	JButton removeButton;
	JButton displayButton;

	
	ArrayListClass alc =  new ArrayListClass();
	LinkedListClass llc =  new LinkedListClass();
	HashSetClass hsc =  new HashSetClass();
	LinkedHashSetClass lhsc =  new LinkedHashSetClass();
	TreeSetClass tsc =  new TreeSetClass();
	LinkedHashMapClass lhmc =  new LinkedHashMapClass();
	
	_1_Add_Remove_Display() {
		
		frame = new JFrame("Collection Framework: Add Remove Display");
		frame.setBounds(500, 100, 350, 450);
		
		interfaceLabel = new JLabel("Interface :");
		interfaceLabel.setBounds(30,20,100,50);
		
		classLabel = new JLabel("Class :");
		classLabel.setBounds(30,120,100,50);
		
		objectLabel = new JLabel("Object :");
		objectLabel.setBounds(30,290,100,50);
		
		valueLabel = new JLabel();
		
		interfaceMenu = new JComboBox();
		interfaceMenu.setBounds(130, 30, 170, 30);
		interfaceMenu.addItem("List");
		interfaceMenu.addItem("Set");
		interfaceMenu.addItem("Map");
		interfaceMenu.addItemListener(this);
		
		listMenu = new JComboBox();
		listMenu.setBounds(130, 130, 170, 30);
		listMenu.addItem("ArrayList");
		listMenu.addItem("LinkedList");
		listMenu.addItemListener(this);
		
		setMenu = new JComboBox();
		setMenu.setBounds(130, 130, 170, 30);
		setMenu.addItem("HashSet");
		setMenu.addItem("TreeSet");
		setMenu.addItemListener(this);
		
		mapMenu = new JComboBox();
		mapMenu.setBounds(130, 130, 170, 30);
		mapMenu.addItem("LinkedHashMap");
		mapMenu.addItemListener(this);
		
		objectText = new JTextField();
		objectText.setBounds(130,290,170,40);
		
		valueText = new JTextField();
		
		addButton = new JButton("Add");
		addButton.setBounds(30,360,70,30);
		addButton.addActionListener(this);
		
		removeButton = new JButton("Remove");
		removeButton.setBounds(120,360,80,30);
		removeButton.addActionListener(this);
		
		displayButton = new JButton("Display");
		displayButton.setBounds(220,360,80,30);
		displayButton.addActionListener(this);
		
		frame.add(interfaceLabel);
		frame.add(classLabel);
		frame.add(objectLabel);
		frame.add(valueLabel);
		
		frame.add(interfaceMenu);
		frame.add(listMenu);
		frame.add(setMenu);
		frame.add(mapMenu);
		
		frame.add(objectText);
		frame.add(valueText);
		
		frame.add(addButton);
		frame.add(removeButton);
		frame.add(displayButton);
		
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	
	@Override
	public void actionPerformed(ActionEvent e) {

		String obj = objectText.getText();
		int objInt;
		String key = objectText.getText();
		String value = valueText.getText();
		
		//ArrayList
		if(listMenu.getSelectedIndex()== 0){
			if(e.getSource()==addButton){
				alc.obj = obj;
				alc.add(obj);
				JOptionPane.showMessageDialog(null,"Added: "+obj);
				System.out.println(alc);
			}
			if(e.getSource()==removeButton){
				try{
					if(!alc.isEmpty()){
						objInt = Integer.parseInt(obj);
						alc.remove(objInt);
						System.out.println(alc);
					}
					else{
						JOptionPane.showMessageDialog(null, "The list is empty");
					}
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Input an integer less than: "+alc.size());
				}
			}
			
			if(e.getSource()==displayButton){
				JList list = new JList(alc.toArray());
				JOptionPane.showMessageDialog(null, list);
			}
		}
		
		//LinkedList
		if(listMenu.getSelectedIndex()== 1){
			if(e.getSource()==addButton){
				llc.obj = obj;
				llc.add(obj);
				System.out.println(llc);
				JOptionPane.showMessageDialog(null,"Added: "+obj);
			}
			if(e.getSource()==removeButton){
				try{
					if(!llc.isEmpty()){
						objInt = Integer.parseInt(obj);
						llc.remove(objInt);
						System.out.println(llc);
					}
					else{
						JOptionPane.showMessageDialog(null, "The list is empty");
					}
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Input an integer less than: "+llc.size());
				}
			}
			if(e.getSource()==displayButton){
				JList list = new JList(llc.toArray());
				JOptionPane.showMessageDialog(null, list);
			}
		}
		
		//HashSet
		if(setMenu.getSelectedIndex()== 0){
			if(e.getSource()==addButton){
				hsc .obj = obj;
				hsc .add(obj);
				System.out.println(hsc );
				JOptionPane.showMessageDialog(null,"Added: "+obj);
			}
			if(e.getSource()==removeButton){
				try{
					if(!hsc.isEmpty()){
						
						hsc.remove(obj);
						System.out.println(hsc);
					}
					else{
						JOptionPane.showMessageDialog(null, "The list is empty");
					}
				}catch(Exception e1){

					JList list = new JList(hsc.toArray());
					JOptionPane.showMessageDialog(null, "Input any value from the list to remove it: "+list);
				}
			}
			if(e.getSource()==displayButton){
				JList list = new JList(hsc.toArray());
				JOptionPane.showMessageDialog(null, list);
			}
		}
		
		//LinkedHashSet
		if(setMenu.getSelectedIndex()== 1){
			if(e.getSource()==addButton){
				lhsc .obj = obj;
				lhsc .add(obj);
				System.out.println(lhsc );
				JOptionPane.showMessageDialog(null,"Added: "+obj);
			}
			if(e.getSource()==removeButton){
				int flag = 0;
				if(!lhsc.isEmpty()){
					try{
						Iterator it=lhsc.iterator();
						while(it.hasNext()) {
							   String match=(String) it.next();
							   if(obj.equals(match)){
							      it.remove();						      
							      System.out.println(lhsc);
							      flag = 1;
							      break;
							   }
							   else{
								   flag = 0;
							    }
							 }
						if(flag == 0){
							JList list = new JList(lhsc.toArray());
							JOptionPane.showMessageDialog(null, obj+" is not in the list. "
									+ "Input any value from the list to remove it: ");
						}
					}catch(Exception e1){
						JList list = new JList(lhsc.toArray());
						JOptionPane.showMessageDialog(null, "Input any value from the list to remove it: "+list);
					}
				}
				else{
					JOptionPane.showMessageDialog(null, "Empty list");

				}
				
			}
			if(e.getSource()==displayButton){
				JList list = new JList(lhsc.toArray());
				JOptionPane.showMessageDialog(null, list);
			}
		}
		
		//TreeSet
		if(setMenu.getSelectedIndex()== 2){
			if(e.getSource()==addButton){
				tsc.obj = obj;
				tsc.add(obj);
				System.out.println(tsc );
				JOptionPane.showMessageDialog(null,"Added: "+obj);
			}
			if(e.getSource()==removeButton){
				try{
					if(!tsc.isEmpty()){
						tsc.remove(obj);
						System.out.println(tsc);
					}
					else{
						JOptionPane.showMessageDialog(null, "The list is empty");
					}
				}catch(Exception e1){
					JList list = new JList(tsc.toArray());
					JOptionPane.showMessageDialog(null, "Input any value from the list to remove it: "+list);				}
			}
			if(e.getSource()==displayButton){
				JList list = new JList(tsc.toArray());
				JOptionPane.showMessageDialog(null, list);
			}
		}
		
		//LinkedHashMap
		if(mapMenu.getSelectedIndex() == 0){

			if(e.getSource()==addButton){
				lhmc.key = key;
				lhmc.value = value;
				lhmc.put(key,value);
				System.out.println(lhmc );
			}
			if(e.getSource()==removeButton){
				try{
					if(!lhmc.isEmpty()){
						lhmc.remove(key);
						System.out.println(lhmc);
					}
					else{
						JOptionPane.showMessageDialog(null, "The list is empty");
					}
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Input an integer less than: "+lhmc.size());
				}
			}
			if(e.getSource()==displayButton){
				JList list = new JList(lhmc.keySet().toArray());
				
				JOptionPane.showMessageDialog(null, list);
			}
		}
		
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		int index = ItemEvent.SELECTED;
		
		
		if(e.getStateChange()==ItemEvent.SELECTED){
			if(interfaceMenu.getSelectedIndex()==0){
				listMenu.setVisible(true);
				setMenu.setVisible(false);
				mapMenu.setVisible(false);
				objectLabel.setText("Object : ");
				objectText.setBounds(130,290,170,40);
				valueLabel.setBounds(0,0,0,0);
				valueLabel.setText("");
				valueText.setBounds(0,0,0,0);
			}
			
			if(interfaceMenu.getSelectedIndex()==1){
				listMenu.setVisible(false);
				setMenu.setVisible(true);
				mapMenu.setVisible(false);
				objectLabel.setText("Object : ");
				objectText.setBounds(130,290,170,40);
				valueLabel.setBounds(0,0,0,0);
				valueLabel.setText("");
				valueText.setBounds(0,0,0,0);
			}
			if(interfaceMenu.getSelectedIndex()==2){
				listMenu.setVisible(false);
				setMenu.setVisible(false);
				mapMenu.setVisible(true);
				
				objectLabel.setText("Key : ");
				objectText.setBounds(70,300,70,30);
				
				valueLabel.setBounds(150,290,100,50);
				valueLabel.setText("Value : ");
				valueText.setBounds(200,300,70,30);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new _1_Add_Remove_Display();

	}
	

}
