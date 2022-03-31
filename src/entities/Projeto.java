package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projeto {
	private String nome;
	private Date dtInicio;
	private Date dtTermino;
	private List<Contratacao> listaContratacao = new ArrayList<>();
	
	
	public Projeto(String nome, Date dtInicio, Date dtTermino) {
		this.nome = nome;
		this.dtInicio = dtInicio;
		this.dtTermino = dtTermino;
	}
	
	public boolean adicionarContratacao(Contratacao contratacao) {
		if(contratacao != null && !listaContratacao.contains(contratacao)) {
			listaContratacao.add(contratacao);
			return true;
		}
		return false;
	}
	
	public boolean removeContratacao(Contratacao contratacao) {
		if(contratacao != null && listaContratacao.contains(contratacao)) {
			listaContratacao.remove(contratacao);
			return true;
		}
		return false;
	}
	
	public void listarContratacoes() {
		System.out.println();
		System.out.println("***Contratações***");
		System.out.println("Projeto: \n\t" + this.nome);
		if(listaContratacao.isEmpty()) {
			System.out.println("Sem contratações!");
		}
		else {
			System.out.println("Funcionario(s):");
			for(Contratacao c : this.listaContratacao) {
				System.out.println("\t" + c.getFuncionario().getNome() + "[Status: " + c.getStatus() + " ]");
			}
		}
		
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDt_Inicio() {
		return dtInicio;
	}
	
	public void setDt_Inicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}
	
	public Date getDt_Termino() {
		return dtTermino;
	}
	
	public void setDt_Termino(Date dtTermino) {
		this.dtTermino = dtTermino;
	}
	
}
