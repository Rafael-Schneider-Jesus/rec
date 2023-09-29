/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewControle;

import bean.RsUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcos
     */
public class UsuariosController extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public RsUsuarios getBean(int row) {
        return (RsUsuarios) lista.get(row);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        RsUsuarios usuarios = (RsUsuarios) lista.get(row);
        if (column == 0) {
           return usuarios.getRsIdusuarios();
        } 
        if (column == 1) {
           return usuarios.getRsNome();
        } 
        if (column == 2) {
           return usuarios.getRsApelido();
        } 
        if (column == 3) {
           return usuarios.getRsCpf();
        } 
        return null;
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Nome";
        }
        if (column == 2) {
            return "Apelido";
        }
        if (column == 3) {
            return "Cpf";
        }
        return "";
    }
}
