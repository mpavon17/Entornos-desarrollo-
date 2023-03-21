class TestCuentaBancaria
{
	public static void main(String args[])
	{
<<<<<<< HEAD
		CuentaBancarai cuenta = new CuentaBancaria("123456789", "MIguel PAvon",1000,5)
=======
		Cuentabancaria cuenta = new CuentaBancaria("0123456789", "Miguel Pavon",1000,5)
>>>>>>> migguel_secundaria1
		CuentaBancaria cuenta = new CuentaBancaria("1234521","Director Banco",100,0);
		System.out.println("Saldo = " + cuenta.getSaldo());
		cuenta.reintegro(50);
		cuenta.ingreso(100);
		System.out.println("Saldo: " + cuenta.getSaldo());
	}
}
