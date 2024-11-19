import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartaoDeCredito {

    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean adicionaCompra(Compra compra){
        if(this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
            return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public List<Compra> getComprasOrdenadas() {
        Collections.sort(compras, (c1, c2) -> Double.compare(c1.getValor(), c2.getValor()));
        return compras;
    }
}
