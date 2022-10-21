package dao;

import bean.cad_cli_bean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class cad_cli_dao {

    private Connection con;

    public cad_cli_dao(Connection con) {
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

    public String inserir(cad_cli_bean cliente) {
        String sql = "insert into cliente(id_cli,nome_cli,cpf_cli,endereco_cli,telefone_cli,email_cli)values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, cliente.getId_cli());
            ps.setString(2, cliente.getNome_cli());
            ps.setString(3, cliente.getCpf_cli());
            ps.setString(4, cliente.getEndereco_cli());
            ps.setString(5, cliente.getTelefone_cli());
            ps.setString(6, cliente.getEmail_cli());

            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String excluir(cad_cli_bean cliente) {
        String sql = "delete from cliente where nome_cli = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, cliente.getNome_cli());

            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public List<cad_cli_bean> listarTodos() {
        String sql = "select * from cliente ";
        List<cad_cli_bean> listaCliente = new ArrayList<cad_cli_bean>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    cad_cli_bean cb = new cad_cli_bean();

                    cb.setId_cli(rs.getString(1));
                    cb.setNome_cli(rs.getString(2));
                    cb.setCpf_cli(rs.getString(3));
                    cb.setEndereco_cli(rs.getString(4));
                    cb.setTelefone_cli(rs.getString(5));
                    cb.setEmail_cli(rs.getString(6));

                    listaCliente.add(cb);
                }
                return listaCliente;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }

    public String alterar(cad_cli_bean cliente) {
        String sql = "update cliente set  id_cli = ?, nome_cli = ?, cpf_cli = ?, endereco_cli = ?, telefone_cli = ?, email_cli = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, cliente.getId_cli());
            ps.setString(2, cliente.getNome_cli());
            ps.setString(3, cliente.getCpf_cli());
            ps.setString(4, cliente.getEndereco_cli());
            ps.setString(5, cliente.getTelefone_cli());
            ps.setString(6, cliente.getEmail_cli());
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
