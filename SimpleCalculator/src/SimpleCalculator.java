import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

		panel.setLayout(gbl);

		// создам кнопки и сразу назначу им цифры, а также текстовое поле для ввода
		// значений
		JTextField jTextField = new JTextField(); // текстове поле

		JButton buttonMC = new JButton("MC");
		buttonMC.setContentAreaFilled(false);
		buttonMC.setMargin(new Insets(1, 1, 1, 1));

//		buttonMC.setBorder(null);
		buttonMC.setFont(new Font("Arial", Font.BOLD, 12));
		buttonMC.setMargin(new Insets(1, 1, 1, 1));

//		buttonMC.setHorizontalAlignment(SwingConstants.RIGHT);
//		FontMetrics fontMetrics = buttonMC.getFontMetrics(buttonMC.getFont());
//        int textWidth = fontMetrics.stringWidth(buttonMC.getText());
//        int buttonWidth = buttonMC.getWidth()-10;  //subtract the button's margins, probably a better way to do this
//        if(textWidth > buttonWidth){
//        	buttonMC.setMargin(new Insets(0, 0, 0, 0));
//                  buttonMC.setFont(new Font("Tahoma", Font.PLAIN, textWidth-12));//the button will display ...
//        } 
		JButton buttonMR = new JButton("MR");
		buttonMR.setContentAreaFilled(false);
		buttonMR.setMargin(new Insets(1, 1, 1, 1));

		JButton buttonMS = new JButton("MS");
		buttonMS.setContentAreaFilled(false);
		buttonMS.setMargin(new Insets(1, 1, 1, 1));

		JButton buttonMPlus = new JButton("M+");
		buttonMPlus.setContentAreaFilled(false);
		buttonMPlus.setMargin(new Insets(1, 1, 1, 1));

		JButton buttonMMinus = new JButton("M-");
		buttonMMinus.setContentAreaFilled(false);
		buttonMMinus.setMargin(new Insets(1, 1, 1, 1));

		JButton buttonBack = new JButton("\u2190");
		buttonBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonBack.setMargin(new Insets(1, 1, 1, 1));

		JButton buttonCE = new JButton("CE");
		buttonCE.setFont(new Font("Arial", Font.BOLD, 12));
		buttonCE.setMargin(new Insets(1, 1, 1, 1));

		JButton buttonC = new JButton("C");
		buttonC.setFont(new Font("Arial", Font.BOLD, 12));
		buttonC.setMargin(new Insets(1, 1, 1, 1));

		JButton buttonPlusMinus = new JButton("\u00B1");
		buttonPlusMinus.setFont(new Font("Arial", Font.BOLD, 12));
		buttonPlusMinus.setMargin(new Insets(1, 1, 1, 1));

		JButton buttonSqrt = new JButton("\u221A");
		buttonSqrt.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonSqrt.setMargin(new Insets(1, 1, 1, 1));

		JButton button7 = new JButton("7");
		button7.setFont(new Font("Tahoma", Font.BOLD, 12));
		button7.setMargin(new Insets(1, 1, 1, 1));

		JButton button8 = new JButton("8");
		button8.setFont(new Font("Tahoma", Font.BOLD, 12));
		button8.setMargin(new Insets(1, 1, 1, 1));

		JButton button9 = new JButton("9");
		button9.setFont(new Font("Tahoma", Font.BOLD, 12));
		button9.setMargin(new Insets(1, 1, 1, 1));

		JButton buttonDivide = new JButton("/");
		buttonDivide.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonDivide.setMargin(new Insets(1, 1, 1, 1));

		JButton buttonPercent = new JButton("%");
		buttonPercent.setFont(new Font("Arial", Font.BOLD, 12));
		buttonPercent.setMargin(new Insets(1, 1, 1, 1));

		JButton button4 = new JButton("4");
		button4.setFont(new Font("Tahoma", Font.BOLD, 12));
		button4.setMargin(new Insets(1, 1, 1, 1));

		JButton button5 = new JButton("5");
		button5.setFont(new Font("Tahoma", Font.BOLD, 12));
		button5.setMargin(new Insets(1, 1, 1, 1));

		JButton button6 = new JButton("6");
		button6.setFont(new Font("Tahoma", Font.BOLD, 12));
		button6.setMargin(new Insets(1, 1, 1, 1));

		JButton buttonMultipl = new JButton("*");
		buttonMultipl.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonMultipl.setMargin(new Insets(1, 1, 1, 1));

		JButton buttonOneX = new JButton("1/x");
		buttonOneX.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonOneX.setMargin(new Insets(1, 1, 1, 1));

		JButton button1 = new JButton("1");
		button1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button1.setMargin(new Insets(1, 1, 1, 1));

		JButton button2 = new JButton("2");
		button2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button2.setMargin(new Insets(1, 1, 1, 1));

		JButton button3 = new JButton("3");
		button3.setFont(new Font("Tahoma", Font.BOLD, 12));
		button3.setMargin(new Insets(1, 1, 1, 1));

		JButton buttonMinus = new JButton("-");
		buttonMinus.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonMinus.setMargin(new Insets(1, 1, 1, 1));

		JButton buttonEqual = new JButton("=");
		buttonEqual.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonEqual.setMargin(new Insets(1, 1, 1, 1));

		JButton button0 = new JButton("0");
		button0.setFont(new Font("Tahoma", Font.BOLD, 12));
		button0.setMargin(new Insets(1, 1, 1, 1));
		
		JButton buttonDot = new JButton(".");
		buttonDot.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonDot.setMargin(new Insets(1, 1, 1, 1));

		JButton buttonPlus = new JButton("+");
		buttonPlus.setFont(new Font("Arial", Font.BOLD, 12));
		buttonPlus.setMargin(new Insets(1, 1, 1, 1));

//		JButton buttonPow2 = new JButton("x"+"\u00B2");
//		buttonPow2.setFont(new Font("Tahoma", Font.BOLD, 12));
//		buttonPow2.setMargin(new Insets(0, 0, 0, 0));

		// створимо одразу меню
		JMenuBar menuBar = new JMenuBar(); // панель
		JMenu file = new JMenu("Файл");
		file.setFont(new Font("Colibri", Font.PLAIN, 11));
		JMenuItem exit = new JMenuItem("Вьіход");
		exit.setFont(new Font("Colibri", Font.PLAIN, 11));
		file.add(exit);
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(1);				
			}
		});;
		
		JMenu edit = new JMenu("Правка");
		edit.setFont(new Font("Colibri", Font.PLAIN, 11));
		JMenuItem copy = new JMenuItem("Копировать");
		copy.setFont(new Font("Colibri", Font.PLAIN, 11));
		JMenuItem paste = new JMenuItem("Вставить");
		paste.setFont(new Font("Colibri", Font.PLAIN, 11));
		edit.add(copy);
		edit.add(paste);
		JMenu help = new JMenu("Справка");
		help.setFont(new Font("Colibri", Font.PLAIN, 11));
		JMenuItem about = new JMenuItem("О программе");
		about.setFont(new Font("Colibri", Font.PLAIN, 11));
		help.add(about);
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(help);
		
		
		panel.add(jTextField, new GridBagConstraints(0, 0, GridBagConstraints.REMAINDER, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(9, 9, 3, 9), 0, 0));
		panel.add(buttonMC, new GridBagConstraints(0, 1, 1, 1, 0.18, 0.1, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(3, 10, 3, 3), 0, 0));
		panel.add(buttonMR, new GridBagConstraints(1, 1, 1, 1, 0.18, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(3, 3, 3, 3), 0, 0));
		panel.add(buttonMPlus, new GridBagConstraints(2, 1, 1, 1, 0.18, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(3, 3, 3, 3), 0, 0));
		panel.add(buttonMMinus, new GridBagConstraints(3, 1, 1, 1, 0.24, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(3, 3, 3, 3), 0, 0));
		panel.add(buttonMS, new GridBagConstraints(4, 1, 1, 1, 0.1, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(3, 3, 3, 10), 0, 0));

		panel.add(buttonBack, new GridBagConstraints(0, 2, 1, 1, 0, 0.1, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(3, 10, 3, 3), 0, 0));
		panel.add(buttonCE, new GridBagConstraints(1, 2, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(3, 3, 3, 3), 0, 0));
		panel.add(buttonC, new GridBagConstraints(2, 2, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(3, 3, 3, 3), 0, 0));
		panel.add(buttonPlusMinus, new GridBagConstraints(3, 2, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(3, 3, 3, 3), 0, 0));
		panel.add(buttonSqrt, new GridBagConstraints(4, 2, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(3, 3, 3, 10), 0, 0));

		panel.add(button7, new GridBagConstraints(0, 4, 1, 1, 0, 0.1, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(3, 10, 3, 3), 0, 0));
		panel.add(button8, new GridBagConstraints(1, 4, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(3, 3, 3, 3), 0, 0));
		panel.add(button9, new GridBagConstraints(2, 4, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(3, 3, 3, 3), 0, 0));
		panel.add(buttonDivide, new GridBagConstraints(3, 4, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(3, 3, 3, 3), 0, 0));
		panel.add(buttonPercent, new GridBagConstraints(4, 4, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(3, 3, 3, 10), 0, 0));

		panel.add(button4, new GridBagConstraints(0, 5, 1, 1, 0, 0.1, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(3, 10, 3, 3), 0, 0));
		panel.add(button5, new GridBagConstraints(1, 5, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(3, 3, 3, 3), 0, 0));
		panel.add(button6, new GridBagConstraints(2, 5, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(3, 3, 3, 3), 0, 0));
		panel.add(buttonMultipl, new GridBagConstraints(3, 5, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(3, 3, 3, 3), 0, 0));
		panel.add(buttonOneX, new GridBagConstraints(4, 5, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(3, 3, 3, 10), 0, 0));

		panel.add(button1, new GridBagConstraints(0, 6, 1, 1, 0, 0.1, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(3, 10, 3, 3), 0, 0));
		panel.add(button2, new GridBagConstraints(1, 6, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(3, 3, 3, 3), 0, 0));
		panel.add(button3, new GridBagConstraints(2, 6, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(3, 3, 3, 3), 0, 0));
		panel.add(buttonMinus, new GridBagConstraints(3, 6, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(3, 3, 3, 3), 0, 0));
		panel.add(buttonEqual, new GridBagConstraints(4, 6, 1, 2, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(3, 3, 12, 10), 0, 0));

		panel.add(button0, new GridBagConstraints(0, 7, 2, 1, 0, 0.1, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(3, 10, 12, 3), 0, 0));
		panel.add(buttonDot, new GridBagConstraints(2, 7, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(3, 3, 12, 3), 0, 0));
		panel.add(buttonPlus, new GridBagConstraints(3, 7, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(3, 3, 12, 3), 0, 0));

		
		JFrame calculator = new JFrame();
		calculator.setJMenuBar(menuBar);
		calculator.setContentPane(panel);
		calculator.setSize(218, 314); // размер фрейма
//		calculator.pack();
		calculator.setResizable(false); // не разрешаем менять размер
		calculator.setVisible(true); // делаем видимым
		calculator.setLocationRelativeTo(null);// не привязываем к краям экрана, пусть где-то в центре появляется
		calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// завершаем программу при закрытии формы

	}

}
