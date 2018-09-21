import javax.swing.*;

class MyWindow extends JFrame
{
	ImageIcon tick = new ImageIcon("Tick.png");
	ImageIcon cross = new ImageIcon("Cross.png");

	JButton btn = new JButton("Click Me");
	JButton tickBtn = new JButton(tick);
	JButton crossBtn = new JButton("STOP", cross);

	JPanel pnl = new JPanel();
	public MyWindow(){
		super("Окно Swing");
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(pnl);
		pnl.add(btn);
		pnl.add(tickBtn);
		pnl.add(crossBtn);
		setVisible(true);
	}

	public static void main (String[] args){
		MyWindow gui = new MyWindow();
	}
}
