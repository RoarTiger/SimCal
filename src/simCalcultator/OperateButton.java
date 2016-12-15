package simCalcultator;

import java.awt.*;

import javax.swing.JButton;

/**
 * build operate buttons
 * @author BSX
 *
 */
public class OperateButton extends JButton{
	private static final long serialVersionUID = 1L;
	
	private String Ope = null;
	/**
	 * initialize the button
	 * @param operate the name of the button
	 */
	public OperateButton(String operate){
		Ope = operate;
		this.setText(""+Ope);
		this.setForeground(Color.BLUE);
	}
	
	public String getOperate(){
		return Ope;
	}

}
