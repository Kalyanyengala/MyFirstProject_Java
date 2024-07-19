package Day15;


class bank
{
	double di()
	{
		return(0);
	}
}
class ICICI extends bank
{
	double di()
	{
		return 10.2;		}
}

class SBI extends bank
{
	double di()
	{
		return 20.3;		}

public class Override {

	public static void main(String[] args) 
	{
	
		ICICI ic=new ICICI ();
		
		System.out.println(ic.di());
		
		bank bk=new bank();
		bk.di();
	}

}}
