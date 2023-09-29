/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;

/**
 *
 * @author u13766540670
 */
public class Usuarios implements Comparable{
    private int idusuario;
    private String nome;
    private String apelido;

    public Usuarios(int idusuario, String nome, String apelido) {
        this.idusuario = idusuario;
        this.nome = nome;
        this.apelido = apelido;
    }

    public Usuarios() {
    }
   



    /**
     * @return the idusuario
     */
     
    
      
    public int getIdusuario() {
        return idusuario;
    }

    /**
     * @param idusuario the idusuario to set
     */
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the apelido
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * @param apelido the apelido to set
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    /**
     * @return the cpf
     */
    
        @Override
    public String toString(){
         return getNome();
    }

    @Override
    public int compareTo(Object t) {
    Usuarios usuarios = (Usuarios) t;
    return nome.compareTo(usuarios.nome);
    }
           
}
