/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewControle;

import bean.RsVenda;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dell
 */
public class VendaController extends AbstractTableModel{
            

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public RsVenda getBean(int row) {
        return (RsVenda) lista.get(row);
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
        RsVenda Venda = (RsVenda) lista.get(row);
        if (column == 0) {
           return Venda.getRsIdvenda();
        } 
        if (column == 1) {
           return Venda.getRsFormaPagamento();
        } 
        if (column == 2) {
           return Venda.getRsTotal();
        } 
        if (column == 3) {
           return Venda.getRsVendedor();
        } 
        return null;
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "FormaPagamento";
        }
        if (column == 2) {
            return "Total";
        }
        if (column == 3) {
            return "Vendedor";
        }
        return "";
    }
    
}
