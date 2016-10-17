import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class SimpleFrame extends Frame {
	
	SimpleFrame(String s){
		super(s);
		setSize(700, 500);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			public void windowClosing (WindowEvent ev) {
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g){
		Random r = new Random();
		int []x = new int[] {100, 250, 500};
		int y = 50, x1;
		Graphics2D g2d=(Graphics2D)g;
		
		x1 = x[r.nextInt(x.length)];
		while (y < 375) {
			g2d.setPaint(Color.yellow);
			g.fillOval(x1, y, 75, 125);
			try {
				Thread.sleep(100);
			} 
			catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			g2d.setPaint(Color.white);
			g.fillOval(x1, y, 75, 125);
			y += 10;
		}
	} 
}