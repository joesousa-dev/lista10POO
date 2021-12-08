package funcionarios;

public class FuncionariosComissionados {
	private String first_name;
	private String last_name;
	private String cpf;
	private double sales_week;
	private double commission;

	public FuncionariosComissionados(String primeiro_nome, String ultimo_nome, String cpf) {
		this.first_name = primeiro_nome;
		this.last_name = ultimo_nome;
		this.cpf = cpf;
		sales_week = 0;
		commission = 0;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getCpf() {
		return cpf;
	}

	public double getCommission() {
		return commission;
	}

	public void setSales_week(double sales_week) {
		if (sales_week > 0)
			this.sales_week = sales_week;
		else
			System.out.println("Erro, Valor inválido de venda semanal.");
	}

	public void setCommission(double commission) {
		if (commission >= 0 && commission <= 0.3) {
			this.commission = commission;
		} else {
			System.out.println("Erro, comissão com valor inválido.");
		}
	}

	public double calc_commission() {
		commission = sales_week * commission;
		return commission;
	}

	@Override
	public String toString() {
		return "**** Funcionario **** \nPrimeiro nome:" + first_name + "\nÚltimo nome:" + last_name + "\nCPF:" + cpf
				+ "\nVendas semanais:" + sales_week + "\nComissão:" + commission;
	}

}
