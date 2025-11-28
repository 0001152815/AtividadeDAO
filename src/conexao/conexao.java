package conexao;
// Bibliotecas para DAO
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.concurrent.ExecutionException; // Esta importação não é necessária aqui, mas foi mantida do seu exemplo

public class conexao { // Nome da classe corrigido para 'Conexao'
    private static final String URL = "jdbc:mysql://localhost:3306/escola";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        try{
            // O driver JDBC deve estar configurado no projeto (Libraries/Dependencies)
            return DriverManager.getConnection( URL,USER,PASSWORD );
        } catch(Exception e ){
            // Lança uma exceção de runtime se houver falha na conexão
            throw new RuntimeException("Error ao conectar: " + e.getMessage());
        }

    }
}