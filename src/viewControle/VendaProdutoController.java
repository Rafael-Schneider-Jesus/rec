/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewControle;

import bean.RsProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dell
 */
public class VendaProdutoController  extends AbstractTableModel{
    
    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public RsProduto getBean(int row) {
        return (RsProduto) lista.get(row);
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
        RsProduto rsProduto = (RsProduto) lista.get(row);
        if (column == 0) {
           return rsProduto.getRsIdProduto();
        } 
        if (column == 1) {
           return rsProduto.getRsCopoOuCasquinha();
        } 
        if (column == 2) {
           return rsProduto.getRsSabor();
        } 
        if (column == 3) {
           return rsProduto.getRsTamanho();
        } 
        return null;
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "IdProduto";
        }
        if (column == 1) {
            return "CopoOuCasquinha";
        }
        if (column == 2) {
            return "Sabor";
        }
        if (column == 3) {
            return "Tamanho";
        }
        return "";
    }
}
