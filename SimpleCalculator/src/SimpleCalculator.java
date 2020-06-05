import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator {

	public static void main(String[] args) {
		// создал панель, лейаут и назначил лейаут єтой панели
		JPanel panel = new JPanel();
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		panel.setLayout(gbl);
		
		//создам кнопки и сразу назначу им цифры, а также текстовое поле для ввода значений
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button0 = new JButton("0");
		JButton buttonPlus = new JButton("+");
		JButton buttonEqual = new JButton("=");
		JButton buttonMinus = new JButton("-");
		JButton buttonMultipl = new JButton("*");
		JButton buttonDivide = new JButton("/");
		JButton buttonPercent = new JButton("%");
		JButton buttonOneX = new JButton("1/x");
		JButton buttonSqrt = new JButton("\\u221A");
		JButton buttonPlusMinus = new JButton("\\u00B1");
		JButton buttonC = new JButton("C");
		JButton buttonCE = new JButton("CE");
		JButton buttonBack = new JButton("\\u232B)");
		JButton buttonMC = new JButton("MC");
		JButton buttonMR = new JButton("MR");
		JButton buttonMS = new JButton("MS");
		JButton buttonMPlus = new JButton("M+");
		JButton buttonMMinus = new JButton("M-");
		JTextField jTextField = new JTextField(); //текстове поле
		
		//створимо одразу меню
		JMenuBar menuBar = new JMenuBar(); //панель
		JMenu file = new JMenu("Файл");
		JMenuItem exit = new JMenuItem("Вьіход");
		file.add(exit);
		JMenu edit = new JMenu("Правка");
		JMenu about = new JMenu("О программе");
		JMenuBar.;
		
		
		
		
		panel.add(buttonMMinus);
		
		panel.add(jTextField);
		
		JFrame calculator = new JFrame();
		calculator.setContentPane(panel);
		calculator.setSize(200, 300);
		calculator.setVisible(true);
		
		
		
		
		
	}

}
