package hydra;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Hydra {

	static Random r = new Random();
	static Dimension tk = Toolkit.getDefaultToolkit().getScreenSize();
	static JFrame frame = new JFrame();
	static JFrame frame2 = new JFrame();
	static JFrame frame3 = new JFrame();
	static JFrame frame4 = new JFrame();

	public static void main(String[] args) throws Exception {
		createDialogOne();
	}

	public static void createDialogOne() {
		JOptionPane optionPane = new JOptionPane();
		optionPane.setMessage("Click me!");
		optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
		JButton jButton = getButton(optionPane, "OK", null);
		optionPane.setOptions(new Object[] { jButton });
		JDialog dialog = optionPane.createDialog(frame, "Hydra");
		dialog.setModal(false);
		dialog.setLocation(r.nextInt(tk.width - 5), r.nextInt(tk.height - 5));
		dialog.setVisible(true);
	}
		
	public static void createDialogTwo() {
		JOptionPane optionPane2 = new JOptionPane();
		optionPane2.setMessage("Click me!");
		optionPane2.setMessageType(JOptionPane.INFORMATION_MESSAGE);
		JButton jButton2 = getButton2(optionPane2, "OK", null);
		optionPane2.setOptions(new Object[] { jButton2 });
		JDialog dialog2 = optionPane2.createDialog(frame2, "Hydra2");
		dialog2.setModal(false);
		dialog2.setLocation(r.nextInt(tk.width - 5), r.nextInt(tk.height - 5));
		dialog2.setVisible(true);
	}

	public static void createDialogThree() {
		JOptionPane optionPane3 = new JOptionPane();
		optionPane3.setMessage("Click me!");
		optionPane3.setMessageType(JOptionPane.INFORMATION_MESSAGE);
		JButton jButton3 = getButton3(optionPane3, "OK", null);
		optionPane3.setOptions(new Object[] { jButton3 });
		JDialog dialog3 = optionPane3.createDialog(frame3, "Hydra3");
		dialog3.setModal(false);
		dialog3.setLocation(r.nextInt(tk.width - 5), r.nextInt(tk.height - 5));
		dialog3.setVisible(true);
	}

	public static void createDialogFour() {
		JOptionPane optionPane4 = new JOptionPane();
		optionPane4.setMessage("Click me!");
		optionPane4.setMessageType(JOptionPane.INFORMATION_MESSAGE);
		JButton jButton4 = getButton4(optionPane4, "OK", null);
		optionPane4.setOptions(new Object[] { jButton4 });
		JDialog dialog4 = optionPane4.createDialog(frame4, "Hydra4");
		dialog4.setModal(false);
		dialog4.setLocation(r.nextInt(tk.width - 5), r.nextInt(tk.height- 5));
		dialog4.setVisible(true);
	}

	public static JButton getButton(final JOptionPane optionPane, String text, Icon icon) {
		final JButton button = new JButton(text, icon);
		ActionListener actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				// Return current text label, instead of argument to method
				optionPane.setValue(button.getText());
				optionPane.setVisible(false);
				createDialogTwo();
				createDialogThree();
				createDialogFour();
			}
		};
		button.addActionListener(actionListener);
		return button;
	}
	
	public static JButton getButton2(final JOptionPane optionPane2, String text, Icon icon) {
		final JButton button2 = new JButton(text, icon);
		ActionListener actionListener2 = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent2) {
				// Return current text label, instead of argument to method
				optionPane2.setValue(button2.getText());
				createDialogOne();
				optionPane2.setVisible(false);
				createDialogThree();
				createDialogFour();
			}
		};
		button2.addActionListener(actionListener2);
		return button2;
	}
	
	public static JButton getButton3(final JOptionPane optionPane3, String text, Icon icon) {
		final JButton button3 = new JButton(text, icon);
		ActionListener actionListener3 = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent3) {
				// Return current text label, instead of argument to method
				optionPane3.setValue(button3.getText());
				createDialogOne();
				createDialogTwo();
				optionPane3.setVisible(false);
				createDialogFour();
			}
		};
		button3.addActionListener(actionListener3);
		return button3;
	}
	
	public static JButton getButton4(final JOptionPane optionPane4, String text, Icon icon) {
		final JButton button4 = new JButton(text, icon);
		ActionListener actionListener4 = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent4) {
				// Return current text label, instead of argument to method
				optionPane4.setValue(button4.getText());
				createDialogOne();
				createDialogTwo();
				createDialogThree();
				optionPane4.setVisible(false);
			}
		};
		button4.addActionListener(actionListener4);
		return button4;
	}

}
