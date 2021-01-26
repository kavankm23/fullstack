package bean;

public class Account
{

	private int accNo=0;
	private String name=null;
	private float amount=0.0f;

	public Account( int accNo, String name, float amount)
	{
		this.accNo = accNo;
		this.name = name;
		this.amount = amount;
	}


	public void setAccno(int accNo)
	{
		this.accNo = accNo;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAmount(float amount)
	{
		this.amount = amount;
	}

	public int getAccno()
	{
		return accNo;
	}
	
	public String getName()
	{
		return name;
	}
	
	public float getAmount()
	{
			return amount;
	}
}
