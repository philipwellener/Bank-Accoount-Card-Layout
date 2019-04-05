import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateAcc extends JPanel
{
	public CreateAcc(ArrayList acc)
	{
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		JLabel title = new JLabel("Create an Account");
		gbc.gridwidth = 2;
		add(title,gbc);
		gbc.gridwidth = 1;
		gbc.gridy = 1;
		JLabel lblName = new JLabel("Name: ");
		add(lblName,gbc);
		gbc.gridx = 1;
		JTextField textName = new JTextField("");
		textName.setPreferredSize(new Dimension(100,20));
		add(textName,gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		JLabel lblType = new JLabel("What type of account do you want to make?");
		add(lblType,gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		String[] typeList = {"", "Savings Account", "Checking Account"};
		JComboBox type = new JComboBox(typeList);
		add(type,gbc);
		gbc.gridx=0;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		JLabel lblInitBal = new JLabel("Would you like to deposit an initial amount?");
		add(lblInitBal,gbc);
		gbc.gridx=1;
		String[] initialYorn = {"", "Yes", "No"};
		JComboBox initial = new JComboBox(initialYorn);
		add(initial,gbc);
		gbc.gridx  = 0;
		gbc.gridy = 5;
		JLabel lblBal = new JLabel("How much would you like to deposit");
		add(lblBal,gbc);
		gbc.gridx=1;
		JTextField bal = new JTextField("");
		bal.setPreferredSize(new Dimension(100,20));
		add(bal,gbc);
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridwidth = 2;
		JButton confirm = new JButton("Confirm");
		add(confirm,gbc);
		
		confirm.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				
			}
			
		});
		
		
		}
	}

