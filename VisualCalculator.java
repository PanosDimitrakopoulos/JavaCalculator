import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class VisualCalculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JTextField jTextFieldFirstNumber = null;
	private JTextField jTextFieldSecondNumber = null;
	private JLabel jLabelResult = null;
	private JLabel jLabelOutput = null;
	private JLabel jLabelFirst = null;
	private JLabel jLabelSecond = null;
	private JButton jButtonAplusB = null;
	private JButton jButtonAminusB = null;
	private JButton jButtonAepiB = null;
	private JButton jButtonAdiaB = null;
	private JButton jButtonResetAll = null;
	private JButton jButtonExit = null;
	/**
	 * This is the default constructor
	 */
	public VisualCalculator() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(612, 368);
		this.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		this.setForeground(Color.green);
		this.setContentPane(getJContentPane());
		this.setTitle("Java Calculator");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelSecond = new JLabel();
			jLabelSecond.setBounds(new Rectangle(15, 181, 196, 61));
			jLabelSecond.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabelSecond.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabelSecond.setHorizontalAlignment(SwingConstants.CENTER);
			jLabelSecond.setText("Δεύτερος Αριθμός (Β)");
			jLabelFirst = new JLabel();
			jLabelFirst.setBounds(new Rectangle(16, 105, 195, 61));
			jLabelFirst.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabelFirst.setHorizontalAlignment(SwingConstants.CENTER);
			jLabelFirst.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabelFirst.setText("Πρώτος Αριθμός (Α)");
			jLabelOutput = new JLabel();
			jLabelOutput.setBounds(new Rectangle(16, 28, 195, 64));
			jLabelOutput.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabelOutput.setHorizontalAlignment(SwingConstants.CENTER);
			jLabelOutput.setHorizontalTextPosition(SwingConstants.RIGHT);
			jLabelOutput.setForeground(new Color(51, 51, 255));
			jLabelOutput.setText("Αποτέλεσμα");
			jLabelResult = new JLabel();
			jLabelResult.setBounds(new Rectangle(240, 30, 212, 63));
			jLabelResult.setHorizontalAlignment(SwingConstants.CENTER);
			jLabelResult.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabelResult.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabelResult.setForeground(new Color(51, 51, 255));
			jLabelResult.setText("");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJTextFieldFirstNumber(), null);
			jContentPane.add(getJTextFieldSecondNumber(), null);
			jContentPane.add(jLabelResult, null);
			jContentPane.add(jLabelOutput, null);
			jContentPane.add(jLabelFirst, null);
			jContentPane.add(jLabelSecond, null);
			jContentPane.add(getJButtonAplusB(), null);
			jContentPane.add(getJButtonAminusB(), null);
			jContentPane.add(getJButtonAepiB(), null);
			jContentPane.add(getJButtonAdiaB(), null);
			jContentPane.add(getJButtonResetAll(), null);
			jContentPane.add(getJButtonExit(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jTextFieldFirstNumber	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFirstNumber() {
		if (jTextFieldFirstNumber == null) {
			jTextFieldFirstNumber = new JTextField();
			jTextFieldFirstNumber.setBounds(new Rectangle(240, 105, 212, 62));
			jTextFieldFirstNumber.setHorizontalAlignment(JTextField.CENTER);
			jTextFieldFirstNumber.setFont(new Font("Dialog", Font.PLAIN, 18));
		}
		return jTextFieldFirstNumber;
	}

	/**
	 * This method initializes jTextFieldSecondNumber	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldSecondNumber() {
		if (jTextFieldSecondNumber == null) {
			jTextFieldSecondNumber = new JTextField();
			jTextFieldSecondNumber.setBounds(new Rectangle(241, 179, 209, 64));
			jTextFieldSecondNumber.setFont(new Font("Dialog", Font.PLAIN, 18));
			jTextFieldSecondNumber.setHorizontalAlignment(JTextField.CENTER);
		}
		return jTextFieldSecondNumber;
	}

	/**
	 * This method initializes jButtonAplusB	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAplusB() {
		if (jButtonAplusB == null) {
			jButtonAplusB = new JButton();
			jButtonAplusB.setBounds(new Rectangle(466, 32, 105, 61));
			jButtonAplusB.setFont(new Font("Dialog", Font.BOLD, 18));
			jButtonAplusB.setText("= A + B");
			jButtonAplusB.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) { //Εδώ αλλάζουμε τον χειρισμό του event με τον κώδικα που θέλουμε...
					AdderClass ADC = new AdderClass(Double.parseDouble(jTextFieldFirstNumber.getText()), Double.parseDouble(jTextFieldSecondNumber.getText())); //Δημιουργία αντικειμένου της κατάλληλης κλάσης
					jLabelResult.setText(String.valueOf(ADC.CalculateResult())); // Εμφάνιση του αποτελέσματος στην οθόνη, στο κατάλληλο πεδίο...
				}
			});
		}
		return jButtonAplusB;
	}

	/**
	 * This method initializes jButtonAminusB	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAminusB() {
		if (jButtonAminusB == null) {
			jButtonAminusB = new JButton();
			jButtonAminusB.setBounds(new Rectangle(465, 106, 106, 60));
			jButtonAminusB.setFont(new Font("Dialog", Font.BOLD, 18));
			jButtonAminusB.setText("= A - B");
			jButtonAminusB.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) { //Εδώ αλλάζουμε τον χειρισμό του event με τον κώδικα που θέλουμε...
					SubtractionClass ADC = new SubtractionClass(Double.parseDouble(jTextFieldFirstNumber.getText()), Double.parseDouble(jTextFieldSecondNumber.getText())); //Δημιουργία αντικειμένου της κατάλληλης κλάσης
					jLabelResult.setText(String.valueOf(ADC.CalculateResult())); // Εμφάνιση του αποτελέσματος στην οθόνη, στο κατάλληλο πεδίο...
				}
			});
		}
		return jButtonAminusB;
	}

	/**
	 * This method initializes jButtonAepiB	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAepiB() {
		if (jButtonAepiB == null) {
			jButtonAepiB = new JButton();
			jButtonAepiB.setBounds(new Rectangle(464, 180, 106, 61));
			jButtonAepiB.setFont(new Font("Dialog", Font.BOLD, 18));
			jButtonAepiB.setText("= A * B");
			jButtonAepiB.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) { //Εδώ αλλάζουμε τον χειρισμό του event με τον κώδικα που θέλουμε...
					MultiplicationClass ADC = new MultiplicationClass(Double.parseDouble(jTextFieldFirstNumber.getText()), Double.parseDouble(jTextFieldSecondNumber.getText())); //Δημιουργία αντικειμένου της κατάλληλης κλάσης
					jLabelResult.setText(String.valueOf(ADC.CalculateResult())); // Εμφάνιση του αποτελέσματος στην οθόνη, στο κατάλληλο πεδίο...
				}
			});
		}
		return jButtonAepiB;
	}

	/**
	 * This method initializes jButtonAdiaB	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAdiaB() {
		if (jButtonAdiaB == null) {
			jButtonAdiaB = new JButton();
			jButtonAdiaB.setBounds(new Rectangle(465, 256, 107, 60));
			jButtonAdiaB.setFont(new Font("Dialog", Font.BOLD, 18));
			jButtonAdiaB.setText("= A / B");
			jButtonAdiaB.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) { //Εδώ αλλάζουμε τον χειρισμό του event με τον κώδικα που θέλουμε...
					DivisionClass ADC = new DivisionClass(Double.parseDouble(jTextFieldFirstNumber.getText()), Double.parseDouble(jTextFieldSecondNumber.getText())); //Δημιουργία αντικειμένου της κατάλληλης κλάσης
					jLabelResult.setText(String.valueOf(ADC.CalculateResult())); // Εμφάνιση του αποτελέσματος στην οθόνη, στο κατάλληλο πεδίο...
				}
			});
		}
		return jButtonAdiaB;
	}

	/**
	 * This method initializes jButtonResetAll	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonResetAll() {
		if (jButtonResetAll == null) {
			jButtonResetAll = new JButton();
			jButtonResetAll.setBounds(new Rectangle(240, 254, 210, 61));
			jButtonResetAll.setFont(new Font("Dialog", Font.BOLD, 18));
			jButtonResetAll.setText("RESET ALL");
			jButtonResetAll.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) { //Εδώ αλλάζουμε τον χειρισμό του event με τον κώδικα που θέλουμε...
					jTextFieldFirstNumber.setText(""); //Μηδενισμός των πεδίων
					jTextFieldSecondNumber.setText(""); //Μηδενισμός των πεδίων
					jLabelResult.setText(""); //Μηδενισμός των πεδίων
				}
			});
		}
		return jButtonResetAll;
	}

	/**
	 * This method initializes jButtonExit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonExit() {
		if (jButtonExit == null) {
			jButtonExit = new JButton();
			jButtonExit.setBounds(new Rectangle(16, 256, 195, 60));
			jButtonExit.setFont(new Font("Dialog", Font.BOLD, 18));
			jButtonExit.setForeground(new Color(255, 51, 51));
			jButtonExit.setText("BYE - BYE");
			jButtonExit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.exit(0); //έξοδος στο σύστημα...
				}
			});
		}
		return jButtonExit;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
