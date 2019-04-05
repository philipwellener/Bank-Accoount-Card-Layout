import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Overall extends JFrame
{
	public Overall() 
	{
		CardLayout cl = new CardLayout();
		JPanel overall = new JPanel();
		overall.setLayout(cl);
		JMenuBar menubar = new JMenuBar();
		
		JMenu accts = new JMenu("Accounts");
		
		JMenuItem create = new JMenuItem("Create Account");
		accts.add(create);
		
		JMenuItem remove = new JMenuItem("Remove Account");
		accts.add(remove);
		
		JMenuItem find = new JMenuItem("Find Account");
		accts.add(find);
		
		menubar.add(accts);
		
		JMenu trans = new JMenu("Transactions");
		
		JMenuItem deposit = new JMenuItem("Deposit");
		trans.add(deposit);
		
		JMenuItem withdraw = new JMenuItem("Withdraw");
		trans.add(withdraw);
		
		JMenuItem transfer = new JMenuItem("Transfer");
		trans.add(transfer);
		
		JMenuItem getBal = new JMenuItem("Get Balance");
		trans.add(getBal);
		
		menubar.add(trans);
		
		JMenuItem welcome = new JMenuItem("Home");
		menubar.add(welcome);
		
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		
		JPanel createPanel = new CreateAcc(accounts);
		overall.add(createPanel,"create");
		
		JPanel removePanel = new RemoveAcc(accounts);
		overall.add(removePanel,"remove");
		
		JPanel findPanel = new FindAcc(accounts);
		overall.add(findPanel,"find");
		
		JPanel depositPanel = new Deposit(accounts);
		overall.add(depositPanel,"deposit");
		
		JPanel withdrawPanel = new Withdraw(accounts);
		overall.add(withdrawPanel,"withdraw");
		
		JPanel transPanel = new Transfer(accounts);
		overall.add(transPanel,"trans");
		
		JPanel getBalPanel = new GetBal(accounts);
		overall.add(getBalPanel,"getBal");
		
		JPanel welcomePanel = new Welcome();
		overall.add(welcomePanel,"welcome");
		
		create.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				cl.show(overall,"create");
			}
			
		});
		
		remove.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				cl.show(overall,"remove");
			}
			
		});
		
		find.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				cl.show(overall,"find");
			}
			
		});
		
		deposit.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				cl.show(overall,"deposit");
			}
			
		});
		
		withdraw.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				cl.show(overall,"withdraw");
			}
			
		});
		
		trans.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				cl.show(overall,"trans");
			}
			
		});
		
		getBal.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				cl.show(overall,"getBal");
			}
			
		});
		
		welcome.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				cl.show(overall,"welcome");
			}
			
		});
		

		
		cl.show(overall, "welcome");
		add(overall);
		this.setJMenuBar(menubar);
		this.setBounds(100,100,500,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	
		
	}
	
	public static void main(String[] args) 
	{
		new Overall();
	}
	
}
