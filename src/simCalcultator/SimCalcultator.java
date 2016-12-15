package simCalcultator;

import java.awt.*;   //���󴰿ڹ��߰����ṩ����������Java��ͼ���û�����Ļ�������
//import java.awt.event.*;//�ṩ������ AWT ����������ĸ����¼��Ľӿں���
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class SimCalcultator extends JFrame {

	private static final long serialVersionUID = 1L;
//	private static final int DEFAULT_WIDTH = 300;
//	private static final int DEFAULT_HEIGHT = 200;
	
	//���ڱ�������
	//��ť
	private NumButton numButton[];
	private OperateButton opeButton[];
	private JButton  delete ,clear ,point ,equal,sin ,sqrt ,reci ,opposite;

	//��ʾ
	private JTextField resultWin;
	//���� �����������������
	private LinkedList<String>  simList;
	
	//����������
	private NumListener  numListener;
	private OpeListener  opeListener;
	private PointListener pointListener;
	private ClearListener clearListener;
	private DelListener delListener;
	private EqualListener equalListenr;
	private SinListener sinListener;
	private SqrtListener sqrtListener;
	private ReciListener reciListener;
	private OppositeListener oppositeListener;
	
	/**
	 * constructor ,finish initializing the window 
	 */
	public SimCalcultator(){
		String[] str = {"*","/","+","-"};
		this.setTitle("Simple Calcultator");
		//���ڷ�Ϊ������
		JPanel panelWhole,panelDown,panelUp;
		panelWhole = new JPanel(new BorderLayout());
				
		panelUp = new JPanel(new BorderLayout());
		panelDown = new JPanel();
		panelDown.setLayout(new BorderLayout());
		
		this.simList = new LinkedList<String>();
		simList.clear();
		//�����ʾ���ڼ����ʼ��
		this.resultWin = new JTextField(10);
		this.resultWin.setHorizontalAlignment(JTextField.RIGHT);
		this.resultWin.setForeground(Color.blue);
		this.resultWin.setFont(new Font("TimesRoman", Font.BOLD, 20));
		this.resultWin.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		this.resultWin.setEditable(false);                                                          
		this.resultWin.setBackground(Color.white);
		this.resultWin.setText("0");
		
		panelUp.add(this.resultWin,BorderLayout.NORTH);//��ӵ����
		
		//���ְ�ť��ʼ��
		this.numButton = new NumButton[10];
		this.numListener = new NumListener(this.simList, this.resultWin);
		for(int i = 0;i < 10;i++){
			this.numButton[i] = new NumButton(i);
			this.numButton[i].setFont(new Font("Arial",Font.BOLD,20));
			this.numButton[i].addActionListener(this.numListener);
		}
		
		//��ť��
		JPanel  panelDown_Center = new JPanel();
		JPanel  panelDown_Left = new JPanel();
		JPanel  panelDown_Right = new JPanel();
		
		//clear,delete��ť��ʼ��������������
		this.clear = new JButton("Clear");
		this.clearListener = new ClearListener(this.simList, this.resultWin);
		this.clear.addActionListener(this.clearListener);
		this.clear.setFont(new Font("΢���ź�",Font.BOLD,16));
		this.clear.setForeground(Color.GREEN);
		this.delete = new JButton("Delete");
		this.delListener = new DelListener(this.simList, this.resultWin);
		this.delete.addActionListener(this.delListener);
		this.delete.setFont(new Font("΢���ź�",Font.BOLD,16));
		this.delete.setForeground(Color.GREEN);
		//.��=��ť
		this.point = new JButton(".");
		this.pointListener = new PointListener(this.simList, this.resultWin);
		this.point.addActionListener(this.pointListener);
		this.point.setFont(new Font("΢���ź�",Font.BOLD,16));
		this.point.setForeground(Color.BLACK);
		this.equal = new JButton("=");
		this.equalListenr = new EqualListener(this.simList, this.resultWin);
		this.equal.addActionListener(this.equalListenr);
		this.equal.setFont(new Font("΢���ź�",Font.BOLD,16));
		this.equal.setForeground(Color.BLACK);
		//������ť+-*/ 
		this.opeButton = new OperateButton[4];
		this.opeListener = new OpeListener(this.simList,this.resultWin);
		for(int i = 0; i < 4; i++){
			this.opeButton[i] = new OperateButton(str[i]);
			this.opeButton[i].setFont(new Font("΢���ź�",Font.BOLD,19));
			this.opeButton[i].addActionListener(this.opeListener);
		}
		//sin reci 1/x sqrt��ť
		this.sin = new JButton("sin");
		this.sinListener = new SinListener(this.simList, this.resultWin);
		this.sin.addActionListener(this.sinListener);
		this.sin.setFont(new Font("΢���ź�",Font.BOLD,18));
		this.sin.setForeground(Color.BLACK);
		this.sqrt = new JButton("sqrt");
		this.sqrtListener = new SqrtListener(this.simList, this.resultWin);
		this.sqrt.addActionListener(this.sqrtListener);
		this.sqrt.setFont(new Font("΢���ź�",Font.BOLD,18));
		this.sqrt.setForeground(Color.BLACK);
		this.reci = new JButton("1/x");
		this.reciListener = new ReciListener(this.simList, this.resultWin);
		this.reci.addActionListener(this.reciListener);
		this.reci.setFont(new Font("΢���ź�",Font.BOLD,18));
		this.reci.setForeground(Color.BLACK);
		this.opposite = new JButton("oppo");
		this.oppositeListener = new OppositeListener(this.simList, this.resultWin);
		this.opposite.addActionListener(this.oppositeListener);
		this.opposite.setFont(new Font("΢���ź�",Font.BOLD,18));
		this.opposite.setForeground(Color.BLACK);
		
		panelDown.add(panelDown_Center,BorderLayout.NORTH);
		panelDown_Center.setLayout(new GridLayout(1,2,30,30));
		panelDown_Center.add(clear);
		panelDown_Center.add(delete);  
	
		//������ְ�ť�������
		panelDown.add(panelDown_Left,BorderLayout.WEST);
		panelDown_Left.setLayout(new GridLayout(4,3,17,8));
		panelDown_Left.add(numButton[7]);
		panelDown_Left.add(numButton[8]);
		panelDown_Left.add(numButton[9]);
		panelDown_Left.add(numButton[4]);
		panelDown_Left.add(numButton[5]);
		panelDown_Left.add(numButton[6]);
		panelDown_Left.add(numButton[1]);
		panelDown_Left.add(numButton[2]);
		panelDown_Left.add(numButton[3]);
		panelDown_Left.add(numButton[0]);
		panelDown_Left.add(this.point);
		panelDown_Left.add(this.equal);
		
		//��Ӳ�����ť�������
		panelDown.add(panelDown_Right, BorderLayout.EAST);
		panelDown_Right.setLayout(new GridLayout(4,2,9,8));
		panelDown_Right.add(opeButton[0]);
		panelDown_Right.add(opeButton[1]);
		panelDown_Right.add(opeButton[2]);
		panelDown_Right.add(opeButton[3]);
		panelDown_Right.add(this.sin);
		panelDown_Right.add(this.sqrt);
		panelDown_Right.add(this.reci);
		panelDown_Right.add(this.opposite);
		
		panelWhole.add(panelUp, BorderLayout.NORTH);
		panelWhole.add(panelDown, BorderLayout.CENTER);
		getContentPane().add(panelWhole);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		setBounds(500,350,390,280);
		validate();
	}
	
	public static void main(String[] args){
		new SimCalcultator();
	}
}
