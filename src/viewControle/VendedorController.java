/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewControle;

import bean.RsVendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dell
 */
public class VendedorController extends AbstractTableModel{
    
    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public RsVendedor getBean(int row) {
        return (RsVendedor) lista.get(row);
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
        RsVendedor rsVendedor = (RsVendedor) lista.get(row);
        if (column == 0) {
           return rsVendedor.getRsIdvendedor();
        } 
        if (column == 1) {
           return rsVendedor.getRsNome();
        } 
        if (column == 2) {
           return rsVendedor.getRsDataNascimento();
        } 
        if (column == 3) {
           return rsVendedor.getRsCpf();
        } 
         if (column == 4) {
           return rsVendedor.getRsFuncao();
        } 
          if (column == 5) {
           return rsVendedor.getRsLogin();
        } 
           if (column == 6) {
           return rsVendedor.getRsSobrenome();
        } 
            if (column == 7) {
           return rsVendedor.getRsTelefone();
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
            return "DataNascimento";
        }
        if (column == 3) {
            return "Cpf";
        }
          if (column == 4) {
            return "Funcao";
        }
            if (column == 5) {
            return "Login";
        }
              if (column == 6) {
            return "Sobrenome";
        }
                if (column == 7) {
            return "Telefone";
        }
        return "";
    }
}
