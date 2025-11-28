package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Modelo.Professor;
import conexao.conexao;

public class ProfessorDAO {
    private conexao conexao = new conexao();

    // 1. CREATE (Inserir)
    public void inserir(Professor professor) {
        // Ajuste esta query se sua tabela tiver colunas diferentes ou uma ordem diferente
        String sql = "INSERT INTO Professor (nome, cpf, rg, email, senha, dataNascimento, telefone, endereco, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexao.getConnection();
             PreparedStatement stat = conn.prepareStatement(sql)) {

            stat.setString(1, professor.getNome());
            stat.setString(2, professor.getCpf());
            stat.setString(3, professor.getRg());
            stat.setString(4, professor.getEmail());
            stat.setString(5, professor.getSenha());

            // Converte java.util.Date para java.sql.Date
            java.sql.Date sqlDate = new java.sql.Date(professor.getDataNascimento().getTime());
            stat.setDate(6, sqlDate);

            stat.setString(7, professor.getTelefone());
            stat.setString(8, professor.getEndereco());
            stat.setString(9, professor.getEstado());

            stat.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir Professor: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // ATENÇÃO: Implemente os demais métodos (listar, atualizar, excluir) seguindo o padrão do AlunoDAO

    // public List<Professor> listar() {...}

    // public void atualizar(Professor professor) {...}

    // public void excluir(int id) {...}
}