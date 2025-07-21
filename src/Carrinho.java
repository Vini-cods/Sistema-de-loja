import java.util.ArrayList;

public class Carrinho {
    ArrayList<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();

    }

    public void  adicionar(Produto p) {
        produtos.add(p);
        System.out.println("Produto "+p.getNome()+" foi adicionado no carrinho!");
    }

    public String remover(String nome) {
        int codigo = -1;
        for (int i=0; i<produtos.size(); i++) {
            if (produtos.get(i).equals(nome)) {
                codigo = i;
                break;
            } else {
                continue;
            }
        }

        if (codigo == -1) {
            return null;
        } else {
            return "O produto "+nome+" foi removido do carrinho!";
        }

    }
}
