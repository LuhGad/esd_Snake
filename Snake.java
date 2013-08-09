import java.util.Queue;

import javax.management.QueryExp;

public class Fila {
	No inicio;
	No fim;
	int tamanho;

	Fila cria() {
		Fila f = new Fila();

		f.inicio = null;
		f.fim = null;
		tamanho = 0;
		return f;
	}

	public int tamanho() {
		return tamanho;
	}

	No insere_fim(No fim, String v) {
		No p = new No();
		p.valor = v;
		p.proximo = null;
		if (fim != null)
			fim.proximo = p;
		return p;

	}

	No remove_inc(No inicio) {
		No p = inicio.proximo;
		return p;
	}

	public void add(String v) {

		this.fim = insere_fim(this.fim, v);
		if (this.inicio == null)
			this.inicio = this.fim;
		tamanho++;
	}

	public boolean vazia(Fila f) {
		if (f.inicio == f.fim)

			return true;
		else
			return false;
	}

	public String remov(Fila f) {
		String v;

		if (vazia(f)) {
			return null;
		}
		v = f.inicio.valor;
		f.inicio = remove_inc(f.inicio);
		if (vazia(f))
			f.fim = null;
		tamanho--;
		return v;
		
	}


	@Override
	public String toString() {

		if (this.inicio == null){
		return null;
		}
				else
							
		
		return this.inicio.toString();
	}

	public static void main(String[] args) {
		Fila f = new Fila();

	f.add("e");
		f.add("o");
		f.add("o");
		f.add("o");
		f.add("o");

		f.add("o");
		f.add("o");
		f.add("o");
		f.add("o");
		f.add("o");

//		f.remov(f);

		
		System.out.println(f);

		System.out.println(f.tamanho);
	}
}
