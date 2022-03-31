package entities;

import java.util.Date;
import entities.enums.Cargo;
import entities.enums.Status;

public class Contratacao {
	private Date data;
	private Cargo cargo;
	private Status status;
	private Funcionario funcionario;
	private Projeto projeto;
	

	
	public Contratacao(Date data, Cargo cargo, Funcionario funcionario, Projeto projeto) {
		this.data = data;
		this.cargo = cargo;
		this.setFuncionario(funcionario);
		this.setProjeto(projeto);
		this.pendente();
	}

	public Date getDatal() {
		return data;
	}

	public void setDatal(Date data) {
		this.data = data;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public void pendente() {
		this.status = Status.PENDENTE;
	}
	
	public void contratar() {
		if(this.status == Status.PENDENTE) {
			this.status = Status.CONTRATADO;
			this.projeto.adicionarContratacao(this);
		}
	}
	
	public void demitir() {
		if(this.status == Status.CONTRATADO) {
			this.status = Status.DEMITIDO;
			this.projeto.removeContratacao(this);
		}
	}

	@Override
	public String toString() {
		return "Contratacao [datal=" + data + ", cargo=" + cargo + ", status=" + status + "]";
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
}
