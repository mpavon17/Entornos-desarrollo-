class TestCuentaBancaria
{
	public static void main(String ar)
		

		Cuentabancaria cuenta = new CuentaBancaria("0123456789", "Miguel Pavon",1000,5)
		CuentaBancaria cuenta = new CuentaBancaria("1234521","Director Banco",100,0);
		System.out.println("Saldo = " + cuenta.getSaldo());
		cuenta.reintegro(50);
		cuenta.ingreso(100);
		System.out.println("Saldo: " + cuenta.getSaldo());
	}
}
