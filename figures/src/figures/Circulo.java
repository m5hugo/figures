package figures;

public class Circulo
{
	private int radi;

	public Circulo(int radi) throws Exception
	{
		if ((radi <=0) || ((radi % 1) != 0))
		{
			throw new Exception("El radi ha de ser un enter > ó = a 0");
		}
		else
		{
			this.radi = radi;
		}
	}

	public int getRadi() {
		return radi;
	}

	public void setRadi(int radi) throws Exception {

		if ((radi <=0) || ((radi % 1) != 0))
		{
			throw new Exception("El radi ha de ser un enter > ó = a 0");
		}
		else
		{
			this.radi = radi;
		}
	}


}
