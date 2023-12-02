package bean;
// Generated 30/11/2023 17:41:52 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RsUsuarios generated by hbm2java
 */
@Entity
@Table(name="rs_usuarios"
    ,catalog="db_rafael_schneider"
)
public class RsUsuarios  implements java.io.Serializable {


     private int rsIdusuarios;
     private String rsNome;
     private Date rsNasc;
     private String rsSenha;
     private String rsApelido;
     private String rsCpf;
     private int rsNivel;
     private char rsAtivo;

    public RsUsuarios() {
    }

    public RsUsuarios(int rsIdusuarios, String rsNome, Date rsNasc, String rsSenha, String rsApelido, String rsCpf, int rsNivel, char rsAtivo) {
       this.rsIdusuarios = rsIdusuarios;
       this.rsNome = rsNome;
       this.rsNasc = rsNasc;
       this.rsSenha = rsSenha;
       this.rsApelido = rsApelido;
       this.rsCpf = rsCpf;
       this.rsNivel = rsNivel;
       this.rsAtivo = rsAtivo;
    }
   
     @Id 

    
    @Column(name="rs_idusuarios", unique=true, nullable=false)
    public int getRsIdusuarios() {
        return this.rsIdusuarios;
    }
    
    public void setRsIdusuarios(int rsIdusuarios) {
        this.rsIdusuarios = rsIdusuarios;
    }

    
    @Column(name="rs_Nome", nullable=false, length=100)
    public String getRsNome() {
        return this.rsNome;
    }
    
    public void setRsNome(String rsNome) {
        this.rsNome = rsNome;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="rs_Nasc", nullable=false, length=10)
    public Date getRsNasc() {
        return this.rsNasc;
    }
    
    public void setRsNasc(Date rsNasc) {
        this.rsNasc = rsNasc;
    }

    
    @Column(name="rs_Senha", nullable=false, length=100)
    public String getRsSenha() {
        return this.rsSenha;
    }
    
    public void setRsSenha(String rsSenha) {
        this.rsSenha = rsSenha;
    }

    
    @Column(name="rs_Apelido", nullable=false, length=100)
    public String getRsApelido() {
        return this.rsApelido;
    }
    
    public void setRsApelido(String rsApelido) {
        this.rsApelido = rsApelido;
    }

    
    @Column(name="rs_Cpf", nullable=false, length=15)
    public String getRsCpf() {
        return this.rsCpf;
    }
    
    public void setRsCpf(String rsCpf) {
        this.rsCpf = rsCpf;
    }

    
    @Column(name="rs_Nivel", nullable=false)
    public int getRsNivel() {
        return this.rsNivel;
    }
    
    public void setRsNivel(int rsNivel) {
        this.rsNivel = rsNivel;
    }

    
    @Column(name="rs_Ativo", nullable=false, length=1)
    public char getRsAtivo() {
        return this.rsAtivo;
    }
    
    public void setRsAtivo(char rsAtivo) {
        this.rsAtivo = rsAtivo;
    }




}


