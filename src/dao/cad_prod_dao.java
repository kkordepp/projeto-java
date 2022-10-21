package dao;

import bean.cad_prod_bean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class cad_prod_dao {

    private Connection con;

    public cad_prod_dao(Connection con) {
        setCon(con);
    }

    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    private void setCon(Connection con) {
        this.con = con;
    }

    public String inserir(cad_prod_bean produto) {
        String sql = "insert into produto(id_prod,nome_prod,descricao_prod,quantidade_prod,valor_prod)values(?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, produto.getId_prod());
            ps.setString(2, produto.getNome_prod());
            ps.setString(3, produto.getDescricao_prod());
            ps.setString(4, produto.getQuantidade_prod());
            ps.setString(5, produto.getValor_prod());

            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String excluir(cad_prod_bean produto) {
        String sql = "delete from produto where nome = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, produto.getNome_prod());
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public List<cad_prod_bean> listarTodos() {
        String sql = "select * from produto ";
        List<cad_prod_bean> listaProduto = new ArrayList<cad_prod_bean>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    cad_prod_bean cb = new cad_prod_bean();

                    cb.setId_prod(rs.getString(1));
                    cb.setNome_prod(rs.getString(2));
                    cb.setDescricao_prod(rs.getString(3));
                    cb.setQuantidade_prod(rs.getString(4));
                    cb.setValor_prod(rs.getString(5));

                    listaProduto.add(cb);
                }
                return listaProduto;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }

    public String alterar(cad_prod_bean produto) {
        String sql = "update produto set  nome_prod = ?, descricao_prod = ?, quantidade_prod = ?, valor_prod = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, produto.getNome_prod());
            ps.setString(2, produto.getDescricao_prod());
            ps.setString(3, produto.getQuantidade_prod());
            ps.setString(4, produto.getValor_prod());
            if (ps.executeUpdate() > 0) {
                return "Alterado com sucesso.";
            } else {
                return "Erro ao alterar";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
}
