package funcionarios;

public class Funcionarios_SalarioBase extends FuncionariosComissionados {

	private double salario_base;

	public Funcionarios_SalarioBase(String p_nome, String u_name, String cpf, double remuneracao) {
		super(p_nome, u_name, cpf);
		if (remuneracao > 0)
			this.salario_base = remuneracao;
		else
			System.out.println("Salario deve ser maior que zero.");

	}

	public void setSalario_base(double salario_base) {
		if (salario_base > 0)
			this.salario_base = salario_base;
		else
			System.out.println("Permitido apenas valores maiores que zero.");
	}

	public double getSalario_base() {
		return salario_base + super.getCommission();
	}

	@Override
	public String toString() {
		return super.toString() + "\nRemuneração final:" + getSalario_base();
	}

}
