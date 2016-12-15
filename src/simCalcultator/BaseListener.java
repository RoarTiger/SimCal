package simCalcultator;

import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.JTextField;

public abstract class BaseListener implements ActionListener {
	
	protected LinkedList<String> List;
	protected JTextField resultWindow;
	
	public BaseListener(){}
	
	public BaseListener(LinkedList<String> list,JTextField ResultWin){
		this.List = list;
		this.resultWindow = ResultWin;
	}

}
