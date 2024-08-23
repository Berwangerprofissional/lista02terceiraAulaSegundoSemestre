package exercicio08professor;

public class testeProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor("Maria", "Matemática", 3500.00);

        professor.darAula();
        professor.corrigirProvas();
    }
}