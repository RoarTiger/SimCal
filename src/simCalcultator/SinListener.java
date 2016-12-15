package simCalcultator;

import java.awt.event.ActionEvent;
import java.util.LinkedList;

import javax.swing.JTextField;

public class SinListener extends BaseListener {
	/**
	 * constructor
	 * @param sinList
	 * @param sinWindow
	 */
	public SinListener(LinkedList<String> sinList, JTextField sinWindow){
		super(sinList,sinWindow);
	}
	/**
	 * respond to the sin button
	 * @param event
	 */
	public void actionPerformed(ActionEvent event){
		switch(List.size()){
		case 1:{
			String num1 = List.getFirst();
			double num = Double.parseDouble(num1);
			double ans = Math.sin(num*Math.PI/180);
			
			String res = Double.toString(ans);
			resultWindow.setText(res);
			List.clear();
			List.add(res);
		}break;
		case 2:break;
		case 3:break;
		default:break;
		}
	}

}
