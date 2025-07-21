//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Chaveiro Seja Forte e Corajosa", "Madeira, cordão, adesivo", 15.90);
        Produto p2 = new Produto("Terço Mães que Oram pelos Filhos", "cordão, netals e adesivo resinado", 32.90);

        Carrinho c = new Carrinho();
        c.adicionar(p1);
        c.adicionar(p2);
        c.remover("Chaveiro Seja Forte e Corajosa");

        Venda v = new Venda(c);
        v.TotalPreco();

    }
}