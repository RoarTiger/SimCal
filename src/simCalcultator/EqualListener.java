package simCalcultator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.LinkedList;

public class EqualListener extends BaseListener{
	/**
	 * constructor
	 * @param equalList
	 * @param equalWindow
	 */
	public EqualListener(LinkedList<String> equalList,JTextField equalWindow){
		super(equalList,equalWindow);
	}
	/**
	 * respond to the equalButton
	 * @param event
	 */
	public void actionPerformed(ActionEvent event){
		switch(List.size()){
		case 1:{
			String equal = List.getFirst();
			resultWindow.setText(equal);    //可能有问题*******
		}break;
		case 2:{
			String Num1 = List.getFirst();
			String opStr = List.get(1);
			
			try{
				double num1 = Double.parseDouble(Num1);
				double num2 = Double.parseDouble(Num1);
				double equal =0;
				
				switch(opStr)
				{
				case "+":equal = num1 + num2;break;
				case "-":equal = num1 - num2;break;
				case "*":equal = num1 * num2;break;
				case "/":equal = num1 / num2;break;
				default: break;
				}
				resultWindow.setText(""+equal);
				String res = Double.toString(equal);
				List.clear();
				List.add(res);
			}
			catch(Exception e){
				resultWindow.setText("ERROR!");
				throw new RuntimeException(e);
			}
		}break;
		case 3:{
			String Num1 = List.getFirst();
			String Num2 = List.getLast();
			String opStr = List.get(1);
			
			try{
				double num1 = Double.parseDouble(Num1);
				double num2 = Double.parseDouble(Num2);
				double equal = 0;
				
				switch(opStr)
				{
				case "+":equal = num1 + num2;break;
				case "-":equal = num1 - num2;break;
				case "*":equal = num1 * num2;break;
				case "/":equal = num1 / num2;break;
				default: break;
				}
				resultWindow.setText(""+equal);
				String res = Double.toString(equal);
				List.clear();
				List.add(res);
			}
			catch(Exception e){
				resultWindow.setText("ERROR!");
				throw new RuntimeException(e);
			}
		}break;
		default: break;
		}
	}
	
}
