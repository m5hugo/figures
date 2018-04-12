package figures;

public class Circulo
{
	private int radi;
	private static final double PI = Math.PI;

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

	public double areaCirculo()
	{
		return Math.pow(this.radi, 2)*PI;
	}
	
	public double perimetroCirculo()
	{
		return 2*PI*this.radi;
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
