package entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Vitima {
	
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name = "NomeVitima")
	private String nome;
	private String oritentacaoSexual;
	private Integer idade;
	private String serieTurno;
	private String endereco;
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getOritentacaoSexual() {
		return oritentacaoSexual;
	}
	public void setOritentacaoSexual(String oritentacaoSexual) {
		this.oritentacaoSexual = oritentacaoSexual;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getSerieTurno() {
		return serieTurno;
	}
	public void setSerieTurno(String serieTurno) {
		this.serieTurno = serieTurno;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

}
