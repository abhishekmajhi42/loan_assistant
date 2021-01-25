package loanassistant;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class LoanAssistant {

	private JFrame frame;
	private JTextField balancetextField;
	private JTextField interesttextField;
	private JTextField monthstextField;
	private JTextField paymentstextField;
	private JTextField analysistextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoanAssistant window = new LoanAssistant();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoanAssistant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 847, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel balanceLabel = new JLabel("Loan Balance");
		GridBagConstraints gbc_balanceLabel = new GridBagConstraints();
		gbc_balanceLabel.anchor = GridBagConstraints.WEST;
		gbc_balanceLabel.insets = new Insets(10, 10, 5, 5);
		gbc_balanceLabel.gridx = 0;
		gbc_balanceLabel.gridy = 0;
		frame.getContentPane().add(balanceLabel, gbc_balanceLabel);
		
		balancetextField = new JTextField();
		GridBagConstraints gbc_balancetextField = new GridBagConstraints();
		gbc_balancetextField.insets = new Insets(10, 10, 5, 10);
		gbc_balancetextField.gridx = 1;
		gbc_balancetextField.gridy = 0;
		frame.getContentPane().add(balancetextField, gbc_balancetextField);
		balancetextField.setColumns(10);
		
		JLabel interestLabel = new JLabel("Interest Rate");
		GridBagConstraints gbc_interestLabel = new GridBagConstraints();
		gbc_interestLabel.anchor = GridBagConstraints.WEST;
		gbc_interestLabel.insets = new Insets(10, 10, 5, 5);
		gbc_interestLabel.gridx = 0;
		gbc_interestLabel.gridy = 1;
		frame.getContentPane().add(interestLabel, gbc_interestLabel);
		
		interesttextField = new JTextField();
		GridBagConstraints gbc_interesttextField = new GridBagConstraints();
		gbc_interesttextField.insets = new Insets(10, 10, 5, 10);
		gbc_interesttextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_interesttextField.gridx = 1;
		gbc_interesttextField.gridy = 1;
		frame.getContentPane().add(interesttextField, gbc_interesttextField);
		interesttextField.setColumns(10);
		
		JLabel analysisLabel = new JLabel("Loan Analysis");
		GridBagConstraints gbc_analysisLabel = new GridBagConstraints();
		gbc_analysisLabel.insets = new Insets(0, 10, 5, 0);
		gbc_analysisLabel.gridx = 3;
		gbc_analysisLabel.gridy = 0;
		frame.getContentPane().add(analysisLabel, gbc_analysisLabel);
		
		JLabel monthsLabel = new JLabel("Number of Payments");
		GridBagConstraints gbc_monthsLabel = new GridBagConstraints();
		gbc_monthsLabel.anchor = GridBagConstraints.WEST;
		gbc_monthsLabel.insets = new Insets(10, 10, 5, 5);
		gbc_monthsLabel.gridx = 0;
		gbc_monthsLabel.gridy = 2;
		frame.getContentPane().add(monthsLabel, gbc_monthsLabel);
		
		monthstextField = new JTextField();
		GridBagConstraints gbc_monthstextField = new GridBagConstraints();
		gbc_monthstextField.insets = new Insets(10, 10, 5, 10);
		gbc_monthstextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_monthstextField.gridx = 1;
		gbc_monthstextField.gridy = 2;
		frame.getContentPane().add(monthstextField, gbc_monthstextField);
		monthstextField.setColumns(10);
		
		
		
		JTextArea analysistextArea = new JTextArea();
		GridBagConstraints gbc_analysistextArea = new GridBagConstraints();
		gbc_analysistextArea.fill = GridBagConstraints.BOTH;
		gbc_analysistextArea.gridx = 3;
		gbc_analysistextArea.gridy = 1;
		gbc_analysistextArea.gridheight=4;
		frame.getContentPane().add(analysistextArea, gbc_analysistextArea);
		
		JLabel paymentsLabel = new JLabel("Monthly Payment");
		GridBagConstraints gbc_paymentsLabel = new GridBagConstraints();
		gbc_paymentsLabel.anchor = GridBagConstraints.WEST;
		gbc_paymentsLabel.insets = new Insets(10, 10, 5, 5);
		gbc_paymentsLabel.gridx = 0;
		gbc_paymentsLabel.gridy = 3;
		frame.getContentPane().add(paymentsLabel, gbc_paymentsLabel);
		
		paymentstextField = new JTextField();
		GridBagConstraints gbc_paymentstextField = new GridBagConstraints();
		gbc_paymentstextField.insets = new Insets(10, 10, 5, 10);
		gbc_paymentstextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_paymentstextField.gridx = 1;
		gbc_paymentstextField.gridy = 3;
		frame.getContentPane().add(paymentstextField, gbc_paymentstextField);
		paymentstextField.setColumns(10);
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		GridBagConstraints gbc_exitButton = new GridBagConstraints();
		exitButton.setFocusable(false);
		gbc_exitButton.insets = new Insets(0, 0, 5, 0);
		gbc_exitButton.gridx = 3;
		gbc_exitButton.gridy = 5;
		frame.getContentPane().add(exitButton, gbc_exitButton);
		
		JButton computeButton = new JButton("Compute Monthly Payment");
		JButton newLoanButton = new JButton("New Loan Analysis");
		newLoanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean computePayment;
				computePayment=true;
				if (computePayment)
				{
					paymentstextField.setText("");
					
				}
				else
				{
					monthstextField.setText("");
					
				}
				analysistextArea.setText("");
				computeButton.setEnabled(true);
				newLoanButton.setEnabled(false);
				balancetextField.requestFocus();

			}
		});
		computeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double balance,interest,payment;
				int months;
				double monthlyInterest,multiplier;
				double loanBalance,finalPayment;
				balance=Double.valueOf(balancetextField.getText()).doubleValue();
				interest=Double.valueOf(interesttextField.getText()).doubleValue();
				monthlyInterest=interest/1200;
				boolean computePayment;
				computePayment=true;
				if (computePayment)
				{months=Integer.valueOf(monthstextField.getText()).intValue();
				if (interest==0)
				{
					payment=balance/months;
				}
				else
				{
				multiplier=Math.pow(1+monthlyInterest,months);
				payment=balance*monthlyInterest*multiplier/(multiplier-1);
				}
				paymentstextField.setText(new DecimalFormat("0.00").format(payment));
				
				}
				else
				{
					payment=Double.valueOf(paymentstextField.getText()).doubleValue();
					if (interest==0)
					{
						months=(int)(balance/payment);
					}
					else
					{
					months=(int)((Math.log(payment)-Math.log(payment-balance*monthlyInterest))/Math.log(1+monthlyInterest));
					}
					monthstextField.setText(String.valueOf(months));
				}
				payment=Double.valueOf(paymentstextField.getText()).doubleValue();
				analysistextArea.setText("Loan Balance:$"+new DecimalFormat("0.00").format(interest)+"%");
				loanBalance=balance;
				for(int paymentNumber=1;paymentNumber<=months-1;paymentNumber++)
				{
					loanBalance+=loanBalance*monthlyInterest-payment;
					
				}
				finalPayment=loanBalance;
				if (finalPayment>payment)
				{
					loanBalance+=loanBalance*monthlyInterest-payment;
					finalPayment=loanBalance;
					months++;
					monthstextField.setText(String.valueOf(months));
				}
				analysistextArea.append("\n\n"+String.valueOf(months-1)+" Payments of $"+new DecimalFormat("0.00").format(payment));
				analysistextArea.append("\n" + "Final Payment of: $" + new DecimalFormat("0.00").format(finalPayment));
				analysistextArea.append("\n" + "Total Payments: $" + new DecimalFormat("0.00").format((months - 1) * payment + finalPayment));
				analysistextArea.append("\n" + "Interest Paid $" + new DecimalFormat("0.00").format((months - 1) * payment + finalPayment - balance));
				computeButton.setEnabled(false);
				newLoanButton.setEnabled(true);
				newLoanButton.requestFocus(); 
			}
		});
		GridBagConstraints gbc_computeButton = new GridBagConstraints();
		gbc_computeButton.insets = new Insets(10, 0, 5, 5);
		gbc_computeButton.gridx = 0;
		gbc_computeButton.gridy = 4;
		gbc_computeButton.gridwidth=2;
		frame.getContentPane().add(computeButton, gbc_computeButton);
		
		JButton monthsButton = new JButton("X");
		JButton paymentButton = new JButton("X");
		monthsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color lightYellow=new Color(255,255,128);
				monthstextField.setEditable(false);
				boolean computePayment;
				computePayment=false;
				paymentButton.setVisible(true);
				monthsButton.setVisible(false);
				monthstextField.setEditable(false);
				monthstextField.setBackground(lightYellow);
				paymentstextField.setText("");
				paymentstextField.setFocusable(true);
				paymentstextField.setEditable(true);
				balancetextField.requestFocus();
				/*paymentstextField.setBackground();*/
				
				computeButton.setText("Compute Number of Payments ");
			}
		});
		GridBagConstraints gbc_monthsButton = new GridBagConstraints();
		monthsButton.setFocusable(false);
		gbc_monthsButton.insets = new Insets(10, 0, 5, 5);
		gbc_monthsButton.gridx = 2;
		gbc_monthsButton.gridy = 2;
		frame.getContentPane().add(monthsButton, gbc_monthsButton);
		
		
		newLoanButton.setEnabled(false);
		GridBagConstraints gbc_newLoanButton = new GridBagConstraints();
		gbc_newLoanButton.insets = new Insets(10, 0, 10, 5);
		gbc_newLoanButton.gridx = 0;
		gbc_newLoanButton.gridy = 5;
		gbc_newLoanButton.gridwidth=2;
		frame.getContentPane().add(newLoanButton, gbc_newLoanButton);
		
		
		
		
		paymentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color lightYellow=new Color(255,255,128);
				monthstextField.setFocusable(true);
				boolean computePayment;
				computePayment=true;
				paymentButton.setVisible(false);
				monthsButton.setVisible(true);
				monthstextField.setEditable(true);
				/*monthstextField.setBackground();*/
				paymentstextField.setText("");
				paymentstextField.setEditable(false);
				paymentstextField.setBackground(lightYellow);
				paymentstextField.setFocusable(false);
				balancetextField.requestFocus();
				computeButton.setText("Compute Monthly Payment ");
				
			}
		});
		GridBagConstraints gbc_paymentButton = new GridBagConstraints();
		paymentButton.setFocusable(false);
		gbc_paymentButton.insets = new Insets(10, 0, 5, 5);
		gbc_paymentButton.gridx = 2
				;
		gbc_paymentButton.gridy = 3;
		frame.getContentPane().add(paymentButton, gbc_paymentButton);
		
		
		
		paymentButton.doClick();
		
		
	}

}
