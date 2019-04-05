import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

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
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		String[] typeList = {"", "Savings Account", "Checking Account"};
		JComboBox type = new JComboBox(typeList);
		add(type,gbc);
	}
}
