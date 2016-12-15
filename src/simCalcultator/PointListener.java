package simCalcultator;

import java.awt.event.ActionEvent;
import java.util.LinkedList;

import javax.swing.JTextField;

public class PointListener extends BaseListener {
	/**
	 * constructor
	 * @param list
	 * @param window
	 */
	public PointListener(LinkedList<String> list,JTextField window){
		super(list,window);
	}
	/**
	 * respond to the point button
	 * @param event
	 */
	public void actionPerformed(ActionEvent event){
		switch(List.size()){
		case 1:{
			String num = List.getFirst();
			String s = num.concat(""+".");
			List.clear();
			List.add(s);
			resultWindow.setText(List.getFirst());
		}break;
		case 2:break;
		case 3:{
			String num = List.getLast();
			String s = num.concat("" + ".");
			List.set(2, s);
			resultWindow.setText(List.getFirst() + List.get(1) + List.getLast());
		}break;
		default: break;
		}
	}
}
