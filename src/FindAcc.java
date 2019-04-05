import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FindAcc  extends JPanel
{
	public FindAcc(ArrayList acc)
	{
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		JLabel title = new JLabel("Find an Account");
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
	}
}
