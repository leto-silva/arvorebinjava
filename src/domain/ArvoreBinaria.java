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
			inOrdem
		}
		
	}
	
	
	
}
