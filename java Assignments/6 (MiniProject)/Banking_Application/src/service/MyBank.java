package service;

import service.AccountInitialize;
import service.Bank;

public class MyBank extends AccountInitialize implements Bank
{
	public void withdraw(int accno1, float amt)
	{
		if(accnt!=0)
		{
			for(int i=0;i<10;i++)
			{
				if(account[i].getAccno()==accno1)
				{
					if(500.0f< (account[i].getAmount()-amt))
					{
						account[i].setAmount(account[i].getAmount()-amt);
						System.out.println("\n Amount Withdrawn is Successfully Done");
						break;
					}
					else
					{
						throw new ArithmeticException("\nMaintain Minimum Rs.500 Balance in Your Account");
						
					}
				}
			}
		}
		else
		{
			System.out.println("\n Create Your Account First");
		}
	}
	
	public void deposit(int accno1, float amt1)
	{
		if(accnt!=0)
		{

			for(int i=0;i<10;i++)
			{
				if(account[i].getAccno()==accno1)
				{
					if(amt1<50000)
					{
						account[i].setAmount(account[i].getAmount() + amt1);
						System.out.println("\n Amount Deposited");
						break;
					}
					else
					{
						System.out.println("\n Please Deposit More Than Rs.500 Amount");
						break;
					}
				}
			}
		}
		else
		{
			throw new ArithmeticException("\n Create Your Account first");
		}

	}
	
	public void checkBal(int accno1)
	{
		if(accnt!=0)
		{
			for(int i=0;i<10;i++)
			{
				if(account[i].getAccno()== accno1 )
				{
					System.out.println("\n Balance : "+account[i].getAmount());
					break;
				}
			}
		}
		else
		{
			throw new ArithmeticException("\nAccount was not Created");
		}
	}

	public void transfer(int fromAccNo , int toAccNo, float amount)
	{
		if(accnt!=0)
		{

			for(int i=0;i<10;i++)
			{
				if(account[i].getAccno()==fromAccNo)
				{
					for(int j=0;j<10;j++)
					{
						if(account[j].getAccno()==toAccNo)
						{
							if(500.0f < (account[i].getAmount()-amount))
							{
								account[i].setAmount(account[i].getAmount()-amount);
								account[j].setAmount(account[j].getAmount()+amount);
								break;
							}
							else
							{
								System.out.println("\n You don't have Enough Balance To Transfer");
							}
						}
					}
					break;
				}
			}
		}
		else
		{
			System.out.println("\n Create Your Account First");
		}
	}
}
