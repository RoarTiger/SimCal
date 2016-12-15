package simCalcultator;

import java.awt.event.ActionEvent;
import java.util.LinkedList;

import javax.swing.JTextField;

public class ClearListener extends BaseListener {
	/**
	 * constructor
	 */
	public ClearListener(LinkedList<String> list,JTextField window){
		super(list, window);
	}
	/**
	 * respond to the clearButton
	 * @param event
	 */
	public void actionPerformed(ActionEvent event){
		List.clear();
		resultWindow.setText("0");
	}
	

}
