package mx.telcel.sd.ssos.gsrh.maci.ejemplobootstrap.model.reposotory;

import java.io.Serializable;
import org.springframework.data.repository.Repository;

public interface GestorRepository<T, ID extends Serializable> extends Repository<T, ID> {

	<S extends T> S save(S entity);
	T findById(ID primaryKey);
	Iterable<T> buscarTodos();
	Long count();
	void deleteElemento(T entity);
	boolean exist(ID primaryKey);

}
