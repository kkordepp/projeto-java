package dao;

import bean.cad_func_bean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class cad_func_dao {

    private Connection con;

    public cad_func_dao(Connection con) {
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

    public String inserir(cad_func_bean funcionario) {
        String sql = "insert into funcionario(id_fun,nome_fun,cpf_fun,endereco_fun,telefone_fun,email_fun,login_fun,senha_fun)values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, funcionario.getId_fun());
            ps.setString(2, funcionario.getNome_fun());
            ps.setString(3, funcionario.getCpf_fun());
            ps.setString(4, funcionario.getEndereco_fun());
            ps.setString(5, funcionario.getTelefone_fun());
            ps.setString(6, funcionario.getEmail_fun());
            ps.setString(7, funcionario.getLogin_fun());
            ps.setString(8, funcionario.getSenha_fun());

            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }

    }

    public String excluir(cad_func_bean funcionario) {
        String sql = "delete from funcionario where nome = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, funcionario.getNome_fun());
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public List<cad_func_bean> listarTodos() {
        String sql = "select * from funcionario ";
        List<cad_func_bean> listaFuncionario = new ArrayList<cad_func_bean>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    cad_func_bean cb = new cad_func_bean();

                    cb.setId_fun(rs.getString(1));
                    cb.setNome_fun(rs.getString(2));
                    cb.setCpf_fun(rs.getString(3));
                    cb.setEndereco_fun(rs.getString(4));
                    cb.setTelefone_fun(rs.getString(5));
                    cb.setEmail_fun(rs.getString(6));
                    cb.setLogin_fun(rs.getString(7));
                    cb.setSenha_fun(rs.getString(8));

                    listaFuncionario.add(cb);
                }
                return listaFuncionario;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
}
