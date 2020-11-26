
package ratatouille.model.dao;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import ratatouille.model.entity.Receita;

/**
 *
 * @author carol
 */
public class ReceitaModel extends AbstractTableModel{
    private List<Receita> receitas = new ArrayList();
    
    @Override
    public int getRowCount() {
        return receitas.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
