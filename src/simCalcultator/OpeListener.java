package simCalcultator;

import java.awt.event.ActionEvent;
import java.util.LinkedList;
import javax.swing.JTextField;

public class OpeListener extends BaseListener {
	/**
	 * CONSTRUCT
	 */
	public OpeListener(LinkedList<String> opeLink,JTextField operesultWin){
		super(opeLink,operesultWin);
	}
	
	/**
	 * respond to the ope button 
	 */
	public void actionPerformed(ActionEvent event){
		OperateButton ope = (OperateButton) event.getSource();
		switch(List.size()){
		case 1:{
			String opeStr = ope.getOperate();
			List.add(opeStr);
			resultWindow.setText(List.getFirst()+""+opeStr);
		}break;
		case 2:{
			String opeStr = ope.getOperate();
			List.set(1, opeStr);
			resultWindow.setText(List.getFirst()+""+opeStr);
		}break;
		case 3:{
			String num1 = List.getFirst();
			String num2 = List.getLast();
			String opStr = List.get(1);
			
			try{
				double n1 = Double.parseDouble(num1);
				double n2 = Double.parseDouble(num2);
				double result = 0;
				
				switch(opStr){
				case "+": result = n1 + n2;break;
				case "-": result = n1 - n2;break;
				case "*": result = n1 * n2;break;
				case "/": result = n1 / n2;break;
				}
				
				String res = Double.toString(result);
				
				String opeStr = ope.getOperate();
				List.clear();
				List.add(res);        //可能有问题
				List.add(opeStr);
				resultWindow.setText(""+res);
			}
			catch(Exception e){
				resultWindow.setText("ERROR");
				throw new RuntimeException(e);
			}
		}break;
		default: break;
		}
		
	}
}
