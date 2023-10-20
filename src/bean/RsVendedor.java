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
 * RsVendedor generated by hbm2java
 */
@Entity
@Table(name="rs_vendedor"
    ,catalog="db_rafael_schneider"
)
public class RsVendedor  implements java.io.Serializable {


     private int rsIdvendedor;
     private String rsNome;
     private String rsSobrenome;
     private String rsCpf;
     private Date rsDataNascimento;
     private String rsTelefone;
     private String rsLogin;
     private int rsFuncao;

    public RsVendedor() {
    }

    public RsVendedor(int rsIdvendedor, String rsNome, String rsSobrenome, String rsCpf, Date rsDataNascimento, String rsTelefone, String rsLogin, int rsFuncao) {
       this.rsIdvendedor = rsIdvendedor;
       this.rsNome = rsNome;
       this.rsSobrenome = rsSobrenome;
       this.rsCpf = rsCpf;
       this.rsDataNascimento = rsDataNascimento;
       this.rsTelefone = rsTelefone;
       this.rsLogin = rsLogin;
       this.rsFuncao = rsFuncao;
    }
   
     @Id 

    
    @Column(name="rs_idvendedor", unique=true, nullable=false)
    public int getRsIdvendedor() {
        return this.rsIdvendedor;
    }
    
    public void setRsIdvendedor(int rsIdvendedor) {
        this.rsIdvendedor = rsIdvendedor;
    }

    
    @Column(name="rs_nome", nullable=false, length=45)
    public String getRsNome() {
        return this.rsNome;
    }
    
    public void setRsNome(String rsNome) {
        this.rsNome = rsNome;
    }

    
    @Column(name="rs_sobrenome", nullable=false, length=45)
    public String getRsSobrenome() {
        return this.rsSobrenome;
    }
    
    public void setRsSobrenome(String rsSobrenome) {
        this.rsSobrenome = rsSobrenome;
    }

    
    @Column(name="rs_cpf", nullable=false, length=11)
    public String getRsCpf() {
        return this.rsCpf;
    }
    
    public void setRsCpf(String rsCpf) {
        this.rsCpf = rsCpf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="rs_dataNascimento", nullable=false, length=10)
    public Date getRsDataNascimento() {
        return this.rsDataNascimento;
    }
    
    public void setRsDataNascimento(Date rsDataNascimento) {
        this.rsDataNascimento = rsDataNascimento;
    }

    
    @Column(name="rs_telefone", nullable=false, length=9)
    public String getRsTelefone() {
        return this.rsTelefone;
    }
    
    public void setRsTelefone(String rsTelefone) {
        this.rsTelefone = rsTelefone;
    }

    
    @Column(name="rs_login", nullable=false, length=45)
    public String getRsLogin() {
        return this.rsLogin;
    }
    
    public void setRsLogin(String rsLogin) {
        this.rsLogin = rsLogin;
    }

    
    @Column(name="rs_funcao", nullable=false)
    public int getRsFuncao() {
        return this.rsFuncao;
    }
    
    public void setRsFuncao(int rsFuncao) {
        this.rsFuncao = rsFuncao;
    }




}


