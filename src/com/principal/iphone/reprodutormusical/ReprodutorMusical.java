package com.principal.iphone.reprodutormusical;

import java.util.List;

public interface ReprodutorMusical {
	
	void tocar();
	
	void pausar();
	
	void selecionarMusica();
	
	void listarMusica(List<String> musica);

}
