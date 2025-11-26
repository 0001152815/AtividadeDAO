// Exemplo de DAO

// Bibliotecas para DAO
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class AlunoDAO {

    public void inserir(Aluno aluno) {
        String sql = "INSERT INTO aluno (nome,email) VALUES (?,?)";

        try (Connection conn = Connection.getConnection();
        ) {}
    }
}
