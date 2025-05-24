public class ProcessoSeletivo {

    public static void main(String[] args) {
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);

    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato".toUpperCase());

        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contraproposta".toUpperCase());

        } else {
            System.out.println("Aguaradando o resultado dos demais candidatos".toUpperCase());
        }
    }
}
