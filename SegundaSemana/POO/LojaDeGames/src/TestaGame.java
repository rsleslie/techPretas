public class TestaGame {
    public static void main(String[] args) throws Exception {
        
        Produto jogo1 = new Produto("The last Of Us II", "Jogo de Acao e aventura", 249.99, 50, true);
        Produto jogo2 = new Produto("Cyberpunk 2077", "Jogo de RPG e Acao", 199.99, 100, false);

        System.out.println("\nJogo 1\n");
        jogo1.visualizar();
        System.out.println("\nJogo 2\n");
        jogo2.visualizar();
    }
}
