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

public class Welcome extends JFrame
{
	public Welcome() 
	{
		CardLayout cl = new CardLayout();
		JPanel welcome = new JPanel();
		welcome.setLayout(cl);
		JMenuBar menubar = new JMenuBar();
		
		JLabel lbl1 = new JLabel("Welcome to PW Bank");
		welcome.add(lbl1);
		
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
		
		JMenuItem home = new JMenuItem("Home");
		menubar.add(home);
		
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		
		JPanel createPanel = new CreateAcc(accounts);
		welcome.add(createPanel,"create");
		
		JPanel removePanel = new RemoveAcc(accounts);
		welcome.add(removePanel,"remove");
		
		JPanel findPanel = new FindAcc(accounts);
		welcome.add(findPanel,"find");
		
		JPanel depositPanel = new Deposit(accounts);
		welcome.add(depositPanel,"deposit");
		
		JPanel withdrawPanel = new Withdraw(accounts);
		welcome.add(withdrawPanel,"withdraw");
		
		JPanel transPanel = new Transfer(accounts);
		welcome.add(transPanel,"trans");
		
		JPanel getBalPanel = new GetBal(accounts);
		welcome.add(getBalPanel,"getBal");
		
		create.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				cl.show(welcome,"create");
			}
			
		});
		
		remove.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				cl.show(welcome,"remove");
			}
			
		});
		
		find.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				cl.show(welcome,"find");
			}
			
		});
		
		deposit.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				cl.show(welcome,"deposit");
			}
			
		});
		
		withdraw.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				cl.show(welcome,"withdraw");
			}
			
		});
		
		trans.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				cl.show(welcome,"trans");
			}
			
		});
		
		getBal.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				cl.show(welcome,"getBal");
			}
			
		});
		
		home.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				cl.show(welcome,"welcome");
			}
			
		});
		

		
		cl.show(welcome, "welcome");
		add(welcome);
		this.setJMenuBar(menubar);
		this.setBounds(100,100,500,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	
		
	}
	
	public static void main(String[] args) 
	{
		new Welcome();
	}
	
}
