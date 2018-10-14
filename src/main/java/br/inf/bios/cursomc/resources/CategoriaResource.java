package br.inf.bios.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.inf.bios.cursomc.domain.TmpCategoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<TmpCategoria> listar(){
		TmpCategoria cat1=new TmpCategoria(1,"Informática");
		TmpCategoria cat2=new TmpCategoria(2,"Escritório");
		List<TmpCategoria> lista=new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		return lista;
	}

}
