import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SimpleCalculator {

	public static void main(String[] args) {
		// создал панель, лейаут и назначил лейаут єтой панели
		
		JPanel panel = new JPanel();
		GridBagLayout gbl = new GridBagLayout();

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
		buttonPercent.setFont(new Font("Arial", Font.BOLD, 12));
		buttonPercent.setMargin(new Insets(0, 0, 0, 0));
		JButton buttonOneX = new JButton("1/x");
		JButton buttonSqrt = new JButton("\\u221A");
		JButton buttonPlusMinus = new JButton("\\u00B1");
		JButton buttonC = new JButton("C");
		buttonC.setFont(new Font("Arial", Font.BOLD, 12));
		buttonC.setMargin(new Insets(0, 0, 0, 0));
		JButton buttonCE = new JButton("CE");
		buttonCE.setFont(new Font("Arial", Font.BOLD, 12));
		buttonCE.setMargin(new Insets(0, 0, 0, 0));
		JButton buttonBack = new JButton("\u2190");
		buttonBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonBack.setMargin(new Insets(0, 0, 0, 0));
		JButton buttonMC = new JButton("MC");
		buttonMC.setContentAreaFilled(false);
//		buttonMC.setMargin(new Insets(1, 1, 1, 1));
		
//		buttonMC.setBorder(null);
		buttonMC.setFont(new Font("Arial", Font.BOLD, 12));
		buttonMC.setMargin(new Insets(5, 0, 5, 0));
//		buttonMC.setHorizontalAlignment(SwingConstants.RIGHT);
//		FontMetrics fontMetrics = buttonMC.getFontMetrics(buttonMC.getFont());
//        int textWidth = fontMetrics.stringWidth(buttonMC.getText());
//        int buttonWidth = buttonMC.getWidth()-10;  //subtract the button's margins, probably a better way to do this
//        if(textWidth > buttonWidth){
//        	buttonMC.setMargin(new Insets(0, 0, 0, 0));
//                  buttonMC.setFont(new Font("Tahoma", Font.PLAIN, textWidth-12));//the button will display ...
//        } 
		JButton buttonMR = new JButton("MR");
		buttonMR.setFont(new Font("Arial", Font.BOLD, 12));
		buttonMR.setMargin(new Insets(5, 0, 5, 0));
		JButton buttonMS = new JButton("MS");
		buttonMS.setFont(new Font("Arial", Font.BOLD, 12));
		buttonMS.setMargin(new Insets(5, 0, 5, 0));
		JButton buttonMPlus = new JButton("M+");
		buttonMPlus.setFont(new Font("Arial", Font.BOLD, 12));
		buttonMPlus.setMargin(new Insets(5, 0, 5, 0));
		JButton buttonMMinus = new JButton("M-");
		buttonMMinus.setFont(new Font("Arial", Font.BOLD, 1
));
		buttonMMinus.setMargin(new Insets(5, 0, 5, 0));
		JTextField jTextField = new JTextField(); //текстове поле
		
		//створимо одразу меню
		JPanel menuJPanel = new JPanel(new FlowLayout());
		JMenuBar menuBar = new JMenuBar(); //панель
		JMenu file = new JMenu("Файл");
		JMenuItem exit = new JMenuItem("Вьіход");
		file.add(exit);
		JMenu edit = new JMenu("Правка");
		JMenu about = new JMenu("О программе");
//		menuBar.add(file, edit,about);
		menuJPanel.add(menuBar);
		
		
		
		
		
		panel.add(jTextField, new GridBagConstraints(0, 0, GridBagConstraints.REMAINDER, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(11, 11, 11, 5)
				, 0, 30));
		panel.add(buttonMC, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 11, 5, 5)
				, 0, 0));
		panel.add(buttonMR, new GridBagConstraints(1, 1, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 11, 5, 5)
				, 0, 0));
		panel.add(buttonMS, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 11, 5, 5)
				, 0, 0));
		panel.add(buttonMPlus, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 11, 5, 5)
				, 0, 0));
		panel.add(buttonMMinus, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 11, 5, 5)
				, 0, 0));

		panel.add(jTextField,  new GridBagConstraints(0,0,GridBagConstraints.REMAINDER,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 2, 2),0,0));
		panel.add(buttonMC,  new GridBagConstraints(0,1,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.RELATIVE,
				new Insets(2, 2, 2, 2),10,0));
		panel.add(buttonMR,  new GridBagConstraints(1,1,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.RELATIVE,
				new Insets(2, 2, 2, 2),10,0));
		panel.add(buttonMPlus,  new GridBagConstraints(2,1,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.RELATIVE,
				new Insets(2, 2, 2, 2),10,0));
		panel.add(buttonMMinus,  new GridBagConstraints(3,1,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.RELATIVE,
				new Insets(2, 2, 2, 2),10,0));
		panel.add(buttonMS,  new GridBagConstraints(4,1,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.RELATIVE,
				new Insets(2, 2, 2, 2),10,0));
		
		panel.add(buttonPercent, new GridBagConstraints(0,2,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.RELATIVE,
				new Insets(2, 2, 2, 2),10,0));
		panel.add(buttonCE, new GridBagConstraints(1,2,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.RELATIVE,
				new Insets(2, 2, 2, 2),10,0));
		panel.add(buttonC, new GridBagConstraints(2,2,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.RELATIVE,
				new Insets(2, 2, 2, 2),10,0));
		panel.add(buttonBack, new GridBagConstraints(3,2,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.RELATIVE,
				new Insets(2, 2, 2, 2),10,0));
		
		
		JFrame calculator = new JFrame();
		calculator.setContentPane(panel);
		calculator.setSize(218, 314); //размер фрейма
		calculator.setResizable(false); //не разрешаем менять размер
		calculator.setVisible(true); //делаем видимым
		calculator.setLocationRelativeTo(null);//не привязываем к краям экрана, пусть где-то в центре появляется
		calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//завершаем программу при закрытии формы
		
	
		
		
	}

}
