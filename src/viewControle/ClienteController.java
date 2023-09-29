/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewControle;

import bean.RsCliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dell
 */
public class ClienteController extends AbstractTableModel{

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public RsCliente getBean(int row) {
        return (RsCliente) lista.get(row);
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
        RsCliente rsCliente = (RsCliente) lista.get(row);
        if (column == 0) {
           return rsCliente.getRsIdcliente();
        } 
        if (column == 1) {
           return rsCliente.getRsNome();
        } 
        if (column == 2) {
           return rsCliente.getRsSobrenome();
        } 
        if (column == 3) {
           return rsCliente.getRsEmail();
        } 
        if (column == 4) {
           return rsCliente.getRsTelefone();
        } 
        if (column == 5) {
           return rsCliente.getRsEndereco();
        } 
        if (column == 6) {
           return rsCliente.getRsCidade();
        } 
        if (column == 7) {
           return rsCliente.getRsCep();
        } 
        if (column == 8) {
           return rsCliente.getRsDataNascimento();
        } 
        if (column == 9) {
           return rsCliente.getRsGenero();
        } 
        if (column == 10) {
           return rsCliente.getRsProfissao();
        } 
        if (column == 11) {
           return rsCliente.getRsEstadoCivil();
        } 
        if (column == 12) {
           return rsCliente.getRsNumeroDependentes();
        } 
        if (column == 13) {
           return rsCliente.getRsRendaAnual();
        } 
        if (column == 14) {
           return rsCliente.getRsDataCadastro();
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
            return "Sobrenome";
        }
        if (column == 3) {
            return "Email";
        }
         if (column == 4) {
            return "Telefone";
        }
         if (column == 5) {
            return "Endereco";
        }
         if (column == 6) {
            return "Cidade";
        }
         if (column == 7) {
            return "Cep";
        }
         if (column == 8) {
            return "DataNascimento";
        }
         if (column == 9) {
            return "Genero";
        }
         if (column == 10) {
            return "Profissao";
        }
         if (column == 11) {
            return "EstadoCivil";
        }
         if (column == 12) {
            return "NumeroDependentes";
        }
         if (column == 13) {
            return "RendaAnual";
        }
         if (column == 14) {
            return "DataCadastrox";
        }
        return "";
    }
    
}
