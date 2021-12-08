package funcionarios;

public class Principal {

	public static void main(String[] args) {
		FuncionariosComissionados comissionados = new FuncionariosComissionados("JOEL", "SILVA", "00345678912");
		comissionados.setSales_week(1000);
		comissionados.setCommission(0.3);
		comissionados.calc_commission();
		System.out.println(comissionados);
		
		System.out.println("\n************\n");
		
		Funcionarios_SalarioBase assalariados = new Funcionarios_SalarioBase("JOSE", "DANTAS", "023456789076", 1000.00);
		assalariados.setSales_week(100);
		assalariados.setCommission(0.3);
		assalariados.calc_commission();
		assalariados.setSalario_base(1500);
		System.out.println(assalariados);
		
	}

}
