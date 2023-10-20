package bean;
// Generated 20/10/2023 17:25:26 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RsCliente generated by hbm2java
 */
@Entity
@Table(name="rs_cliente"
    ,catalog="db_rafael_schneider"
)
public class RsCliente  implements java.io.Serializable {


     private int rsIdcliente;
     private String rsNome;
     private String rsSobrenome;
     private String rsEmail;
     private String rsTelefone;
     private String rsEndereco;
     private String rsCidade;
     private String rsCep;
     private Date rsDataNascimento;
     private int rsGenero;
     private String rsProfissao;
     private int rsEstadoCivil;
     private String rsNumeroDependentes;
     private int rsRendaAnual;
     private Date rsDataCadastro;

    public RsCliente() {
    }

    public RsCliente(int rsIdcliente, String rsNome, String rsSobrenome, String rsEmail, String rsTelefone, String rsEndereco, String rsCidade, String rsCep, Date rsDataNascimento, int rsGenero, String rsProfissao, int rsEstadoCivil, String rsNumeroDependentes, int rsRendaAnual, Date rsDataCadastro) {
       this.rsIdcliente = rsIdcliente;
       this.rsNome = rsNome;
       this.rsSobrenome = rsSobrenome;
       this.rsEmail = rsEmail;
       this.rsTelefone = rsTelefone;
       this.rsEndereco = rsEndereco;
       this.rsCidade = rsCidade;
       this.rsCep = rsCep;
       this.rsDataNascimento = rsDataNascimento;
       this.rsGenero = rsGenero;
       this.rsProfissao = rsProfissao;
       this.rsEstadoCivil = rsEstadoCivil;
       this.rsNumeroDependentes = rsNumeroDependentes;
       this.rsRendaAnual = rsRendaAnual;
       this.rsDataCadastro = rsDataCadastro;
    }
   
     @Id 

    
    @Column(name="rs_idcliente", unique=true, nullable=false)
    public int getRsIdcliente() {
        return this.rsIdcliente;
    }
    
    public void setRsIdcliente(int rsIdcliente) {
        this.rsIdcliente = rsIdcliente;
    }

    
    @Column(name="rs_nome", nullable=false, length=60)
    public String getRsNome() {
        return this.rsNome;
    }
    
    public void setRsNome(String rsNome) {
        this.rsNome = rsNome;
    }

    
    @Column(name="rs_sobrenome", nullable=false)
    public String getRsSobrenome() {
        return this.rsSobrenome;
    }
    
    public void setRsSobrenome(String rsSobrenome) {
        this.rsSobrenome = rsSobrenome;
    }

    
    @Column(name="rs_email", nullable=false)
    public String getRsEmail() {
        return this.rsEmail;
    }
    
    public void setRsEmail(String rsEmail) {
        this.rsEmail = rsEmail;
    }

    
    @Column(name="rs_telefone", nullable=false, length=9)
    public String getRsTelefone() {
        return this.rsTelefone;
    }
    
    public void setRsTelefone(String rsTelefone) {
        this.rsTelefone = rsTelefone;
    }

    
    @Column(name="rs_endereco", nullable=false, length=45)
    public String getRsEndereco() {
        return this.rsEndereco;
    }
    
    public void setRsEndereco(String rsEndereco) {
        this.rsEndereco = rsEndereco;
    }

    
    @Column(name="rs_cidade", nullable=false, length=45)
    public String getRsCidade() {
        return this.rsCidade;
    }
    
    public void setRsCidade(String rsCidade) {
        this.rsCidade = rsCidade;
    }

    
    @Column(name="rs_cep", nullable=false, length=45)
    public String getRsCep() {
        return this.rsCep;
    }
    
    public void setRsCep(String rsCep) {
        this.rsCep = rsCep;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="rs_data_nascimento", nullable=false, length=10)
    public Date getRsDataNascimento() {
        return this.rsDataNascimento;
    }
    
    public void setRsDataNascimento(Date rsDataNascimento) {
        this.rsDataNascimento = rsDataNascimento;
    }

    
    @Column(name="rs_genero", nullable=false)
    public int getRsGenero() {
        return this.rsGenero;
    }
    
    public void setRsGenero(int rsGenero) {
        this.rsGenero = rsGenero;
    }

    
    @Column(name="rs_profissao", nullable=false, length=45)
    public String getRsProfissao() {
        return this.rsProfissao;
    }
    
    public void setRsProfissao(String rsProfissao) {
        this.rsProfissao = rsProfissao;
    }

    
    @Column(name="rs_estado_civil", nullable=false)
    public int getRsEstadoCivil() {
        return this.rsEstadoCivil;
    }
    
    public void setRsEstadoCivil(int rsEstadoCivil) {
        this.rsEstadoCivil = rsEstadoCivil;
    }

    
    @Column(name="rs_numero_dependentes", nullable=false, length=45)
    public String getRsNumeroDependentes() {
        return this.rsNumeroDependentes;
    }
    
    public void setRsNumeroDependentes(String rsNumeroDependentes) {
        this.rsNumeroDependentes = rsNumeroDependentes;
    }

    
    @Column(name="rs_renda_anual", nullable=false)
    public int getRsRendaAnual() {
        return this.rsRendaAnual;
    }
    
    public void setRsRendaAnual(int rsRendaAnual) {
        this.rsRendaAnual = rsRendaAnual;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="rs_data_cadastro", nullable=false, length=10)
    public Date getRsDataCadastro() {
        return this.rsDataCadastro;
    }
    
    public void setRsDataCadastro(Date rsDataCadastro) {
        this.rsDataCadastro = rsDataCadastro;
    }




}


