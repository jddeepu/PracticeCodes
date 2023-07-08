import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Mywindo extends JFrame {
	private JLabel heading;
	private JLabel clocklabel;
	private Font font = new Font("", Font.BOLD, 35);

	Mywindo() {
		super.setTitle(" deepu's clock");
		super.setSize(400, 400); // wide height
		super.setLocation(200, 50); // x=300,y=50
		this.creatGUI();
		super.setVisible(true);

	}

	public void creatGUI() {
		heading = new JLabel("my clock");
		clocklabel = new JLabel("clock");
		heading.setFont(font);
		clocklabel.setFont(font);
		this.setLayout(new GridLayout(2, 1));
       this.startclock();
		this.add(heading);
		this.add(clocklabel);

	}

	public void  startclock() {
	Timer timer =new Timer( 1000 ,new ActionListener() {
	    @Override
		public void actionPerformed(ActionEvent e) {
            String datetime = new Date().toLocaleString();
			clocklabel.setText(datetime);
		}
	});
	timer.start();
		
		
	}

}