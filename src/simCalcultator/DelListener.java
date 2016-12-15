package simCalcultator;

import java.awt.event.ActionEvent;
import java.util.LinkedList;

import javax.swing.JTextField;

public class DelListener extends BaseListener {
	/**
	 * constructor
	 * @param list
	 * @param window
	 */
	public DelListener(LinkedList<String> list,JTextField window){
		super(list, window);
	}
	/**
	 * respond to the delete button
	 * @param event
	 */
	public void actionPerformed(ActionEvent event){
		switch(List.size()){
			case 1:{
				String num = List.getFirst();
				if(num.length() !=0){
				num = num.substring(0,num.length()-1);}
				List.clear();
				List.add(num);
				resultWindow.setText(num);
				}break;
			case 2:{
				String num = List.getFirst();
				List.clear();
				List.add(num);
				resultWindow.setText(num);
			}break;
			case 3:{
				String num1 = List.getFirst();
 				String num2 = List.getLast();
 				String opstr = List.get(1);
 				
 				num2 = num2.substring(0,num2.length()-1);
				if(num2.length() != 0){
					List.clear();
					List.add(num1);
					List.add(opstr);
					List.add(num2);
					resultWindow.setText(List.getFirst() + List.get(1) + List.getLast());
				}
				else{
					List.clear();
					List.add(num1);
					List.add(opstr);
					resultWindow.setText(List.getFirst() + List.getLast());
				}
				}break;
			default: break;
		}
	}

}
