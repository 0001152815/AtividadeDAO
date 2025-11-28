package Principal;

import java.util.Date;
import java.util.List;
import dao.ProfessorDAO;
import Modelo.Professor;
import dao.AlunoDAO;
import modelo.Aluno;

public class Main {

    public static void main(String[] args) {

        AlunoDAO alunoDAO = new AlunoDAO();
        ProfessorDAO professorDAO = new ProfessorDAO();

        // --- TESTES CRUD ALUNO ---
        System.out.println("======== TESTES ALUNO ========");
        Aluno novoAluno = new Aluno("Joao da Silva", "joao.silva@exemplo.com");

        // 1. Inserção
        alunoDAO.inserir(novoAluno);

        // 2. Listagem
        List<Aluno> listaAlunos = alunoDAO.listar();
        if (!listaAlunos.isEmpty()) {
            Aluno primeiroAluno = listaAlunos.get(0);
            System.out.println("ID do Aluno para teste: " + primeiroAluno.getId());

            // 3. Atualização
            primeiroAluno.setNome("Joao Silva (Atualizado)");
            alunoDAO.atualizar(primeiroAluno);
            System.out.println("Aluno ID " + primeiroAluno.getId() + " Atualizado.");

            // 4. Exclusão
            alunoDAO.excluir(primeiroAluno.getId());
            System.out.println("Aluno ID " + primeiroAluno.getId() + " Excluído.");
        }


        // --- TESTES CRUD PROFESSOR (Apenas Inserção para exemplo) ---
        System.out.println("\n======== TESTES PROFESSOR ========");
        Professor novoProfessor = new Professor(
                0, "Dr. Ricardo Silva", "987.654.321-00", "8765432-1",
                "ricardo.silva@escola.com", "segredo123", new Date(),
                " (21) 9876-5432", "Avenida Principal, 50", "RJ"
        );

        professorDAO.inserir(novoProfessor);
        System.out.println("Professor inserido.");

    }
}