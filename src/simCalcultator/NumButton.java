package simCalcultator;

import java.awt.*;   //抽象窗口工具包，提供建立和设置Java的图形用户界面的基本工具
import javax.swing.JButton;
/**
 * button info initialize 
 * @author BSX
 *
 */
public class NumButton extends JButton{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int num = -1;
	/*
	 * to create number button
	 * @param number the value of the button
	 */
	public NumButton(int number){
		num = number;
		this.setText(""+num);
		this.setForeground(Color.BLUE);
	}
	
	/**
	 * to return the value of the number button
	 * @return the number value
	 */
	public int getNumber(){
		return num;
	}
	

}
