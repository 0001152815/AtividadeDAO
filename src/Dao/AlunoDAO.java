package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Aluno;
import conexao.conexao;  // Importa a classe de conexão

public class AlunoDAO {
    private conexao conexao = new conexao();

    // 1. CREATE (Inserir)
    public void inserir(Aluno aluno){
        String sql = "INSERT INTO Aluno (nome, email) VALUES (?, ?)";
        try (Connection conn = conexao.getConnection();
             PreparedStatement stat = conn.prepareStatement(sql)) {
            stat.setString(1, aluno.getNome());
            stat.setString(2, aluno.getEmail());
            stat.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir Aluno: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // 2. READ (Listar)
    public List<Aluno> listar() {
        List<Aluno> lista = new ArrayList<>();
        String sql = "SELECT id, nome, email FROM Aluno";
        try (Connection conn = conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Aluno a = new Aluno();
                a.setId(rs.getInt("id"));
                a.setNome(rs.getString("nome"));
                a.setEmail(rs.getString("email"));
                lista.add(a);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar alunos: " + e.getMessage());
            e.printStackTrace();
        }
        return lista;
    }

    // 3. UPDATE (Atualizar)
    public void atualizar(Aluno aluno) {
        String sql = "UPDATE Aluno SET nome = ?, email = ? WHERE id = ?";
        try (Connection conn = conexao.getConnection();
             PreparedStatement stat = conn.prepareStatement(sql)) {
            stat.setString(1, aluno.getNome());
            stat.setString(2, aluno.getEmail());
            stat.setInt(3, aluno.getId());
            stat.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar Aluno: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // 4. DELETE (Excluir)
    public void excluir(int id) {
        String sql = "DELETE FROM Aluno WHERE id = ?";
        try (Connection conn = conexao.getConnection();
             PreparedStatement stat = conn.prepareStatement(sql)) {
            stat.setInt(1, id);
            stat.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao excluir Aluno: " + e.getMessage());
            e.printStackTrace();
        }
    }
}