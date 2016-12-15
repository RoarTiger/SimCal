package simCalcultator;

import java.awt.event.ActionEvent;
import java.util.LinkedList;

import javax.swing.JTextField;

public class SqrtListener extends BaseListener {
	/**
	 * constructor
	 * @param list
	 * @param window
	 */
	public SqrtListener(LinkedList<String> list,JTextField window){
		super(list, window);
	}
	/**
	 * respond to the sqrt button
	 * @param event
	 */
	public void actionPerformed(ActionEvent event){
		switch(List.size()){
			case 1:{
				String num1 = List.getFirst();
				double num = Double.parseDouble(num1);
				double ans = Math.sqrt(num);
				
				String res = Double.toString(ans);
				resultWindow.setText(res);
				List.clear();
				List.add(res);}break;
			case 2:break;
			case 3:break;
			default: break;
		}
	}

}
