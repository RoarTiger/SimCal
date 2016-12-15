package simCalcultator;

import java.util.LinkedList;
import javax.swing.*;
import java.awt.event.*;

public class NumListener extends BaseListener {
	
	/**
	 * constructor
	 * @param LinkList
	 * @param windowRes
	 */
	public NumListener(LinkedList<String> numLinkList,JTextField numwindowRes){
		super(numLinkList,numwindowRes);
	}
	
	/**
	 * respond to the number button
	 * @param event
	 */
	 
	public void actionPerformed(ActionEvent event){
		NumButton Num = (NumButton) event.getSource();
		switch(List.size()){
		case 0:{
			int number = Num.getNumber();
			List.add(""+number);
			resultWindow.setText(""+number);
		}break;
		case 1:{
			int number = Num.getNumber();
			String num = List.getFirst();
			String s = num.concat(""+number);
			List.set(0, s);
			resultWindow.setText(s);
		}break;
		case 2:{
			int number = Num.getNumber();
			List.add(""+number);
			resultWindow.setText(List.getFirst()+List.get(1)+""+number);
		}break;
		case 3:{
			int number = Num.getNumber();
			String num = List.getLast();
			String s = num.concat(""+number);
			List.set(2, s);
			resultWindow.setText(List.getFirst()+List.get(1)+s);
		}break;
		default: break;
		}
	}
}
