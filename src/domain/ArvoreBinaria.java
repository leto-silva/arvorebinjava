package domain;

public class ArvoreBinaria <T extends Comparable<T>>{
	//
	private BinNo<T> raiz;
	
	public ArvoreBinaria() {
		this.raiz = null;
	}
	
	public void salvarNo(T conteudo) {
		BinNo<T> novoNo = new BinNo<>(conteudo);
		raiz = inserir(raiz, novoNo);
	}
	
	private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
		//
		if(atual == null) {
			return novoNo;
		} else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
			atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
		}else {
			atual.setNoDir(inserir(atual.getNoDir(), novoNo));
		}
		
		return atual;
	}

	public void exibirInOrdem() {
		//
		System.out.println("\n Exibindo InOrdem");
		inOrdem(this.raiz);
	}

	private void inOrdem(BinNo<T> atual) {
		//
		if(atual != null) {
			inOrdem(atual.getNoEsq());
			System.out.println(atual.getConteudo() + ",");
			inOrdem(atual.getNoDir());
		}
		
	}
	
	
	public void exibirPosOrdem() {
		//
		System.out.println("\n Exibindo PosOrdem");
		posOrdem(this.raiz);
	}

	private void posOrdem(BinNo<T> atual) {
		//
		if (atual != null) {
			posOrdem(atual.getNoEsq());		
			posOrdem(atual.getNoDir());
			System.out.println(atual.getConteudo() + ",");
		}
		
	}
	
	public void exibirPreOrdem() {
		//
		System.out.println("\n Exibindo PreOrdem");
		preOrdem(this.raiz);
	}

	private void preOrdem(BinNo<T> atual) {
		//
		if (atual != null) {
			System.out.println(atual.getConteudo() + ",");
			preOrdem(atual.getNoEsq());		
			preOrdem(atual.getNoDir());
		}
		
	}
	
	
	
	
}
