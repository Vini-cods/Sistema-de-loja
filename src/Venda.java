import java.util.ArrayList;

public class Venda {

    Carrinho carrinho;

    public Venda(Carrinho carrinho) {
     this.carrinho = carrinho;
    }

    public void TotalPreco() {
        ArrayList<Produto> p = carrinho.getProdutos();
        double total = 0;

        for (int i = 0; i<p.size(); i++) {
            total += p.get(i).getPreco();
        }

        System.out.println("O total da conta foi R$: "+total);
    }

}
