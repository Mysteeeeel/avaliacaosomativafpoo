package pedido;

public class Main {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(1, "camiseta", 30);
		
		System.out.println(pedido.getId());
		System.out.println(pedido.getProduto());
		System.out.println(pedido.getQuantidade());

	}

}
