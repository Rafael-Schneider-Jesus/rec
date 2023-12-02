package bean;
// Generated 30/11/2023 17:41:52 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RsVenda generated by hbm2java
 */
@Entity
@Table(name="rs_venda"
    ,catalog="db_rafael_schneider"
)
public class RsVenda  implements java.io.Serializable {


     private Integer rsIdvenda;
     private RsCliente rsCliente;
     private RsVendedor rsVendedor;
     private BigDecimal rsTotal;
     private String rsFormaPagamento;
     private Date rsDataVenda;
     private Set rsVendaProdutos = new HashSet(0);

    public RsVenda() {
    }

	
    public RsVenda(RsVendedor rsVendedor, BigDecimal rsTotal, String rsFormaPagamento, Date rsDataVenda) {
        this.rsVendedor = rsVendedor;
        this.rsTotal = rsTotal;
        this.rsFormaPagamento = rsFormaPagamento;
        this.rsDataVenda = rsDataVenda;
    }
    public RsVenda(RsCliente rsCliente, RsVendedor rsVendedor, BigDecimal rsTotal, String rsFormaPagamento, Date rsDataVenda, Set rsVendaProdutos) {
       this.rsCliente = rsCliente;
       this.rsVendedor = rsVendedor;
       this.rsTotal = rsTotal;
       this.rsFormaPagamento = rsFormaPagamento;
       this.rsDataVenda = rsDataVenda;
       this.rsVendaProdutos = rsVendaProdutos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="rs_idvenda", unique=true, nullable=false)
    public Integer getRsIdvenda() {
        return this.rsIdvenda;
    }
    
    public void setRsIdvenda(Integer rsIdvenda) {
        this.rsIdvenda = rsIdvenda;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="rs_cliente")
    public RsCliente getRsCliente() {
        return this.rsCliente;
    }
    
    public void setRsCliente(RsCliente rsCliente) {
        this.rsCliente = rsCliente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="rs_vendedor", nullable=false)
    public RsVendedor getRsVendedor() {
        return this.rsVendedor;
    }
    
    public void setRsVendedor(RsVendedor rsVendedor) {
        this.rsVendedor = rsVendedor;
    }

    
    @Column(name="rs_total", nullable=false, precision=10)
    public BigDecimal getRsTotal() {
        return this.rsTotal;
    }
    
    public void setRsTotal(BigDecimal rsTotal) {
        this.rsTotal = rsTotal;
    }

    
    @Column(name="rs_forma_pagamento", nullable=false, length=20)
    public String getRsFormaPagamento() {
        return this.rsFormaPagamento;
    }
    
    public void setRsFormaPagamento(String rsFormaPagamento) {
        this.rsFormaPagamento = rsFormaPagamento;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="rs_data_venda", nullable=false, length=19)
    public Date getRsDataVenda() {
        return this.rsDataVenda;
    }
    
    public void setRsDataVenda(Date rsDataVenda) {
        this.rsDataVenda = rsDataVenda;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="rsVenda")
    public Set getRsVendaProdutos() {
        return this.rsVendaProdutos;
    }
    
    public void setRsVendaProdutos(Set rsVendaProdutos) {
        this.rsVendaProdutos = rsVendaProdutos;
    }




}


