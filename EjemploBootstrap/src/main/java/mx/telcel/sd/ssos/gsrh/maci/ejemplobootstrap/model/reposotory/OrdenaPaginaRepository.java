package mx.telcel.sd.ssos.gsrh.maci.ejemplobootstrap.model.reposotory;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public interface OrdenaPaginaRepository<T, ID extends Serializable>
	extends GestorRepository<T, ID> {
	
	Iterable<T> findAll(Sort sort);
	Page<T> findAll(Pageable pageable);
	
}
