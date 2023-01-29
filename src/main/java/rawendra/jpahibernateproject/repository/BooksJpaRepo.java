package rawendra.jpahibernateproject.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import rawendra.jpahibernateproject.model.Book;

@Repository
@Transactional
public class BooksJpaRepo {
	@PersistenceContext	
	private EntityManager entityManager;
	
	public void insert(Book book) {
		entityManager.merge(book);
	}
	
	public Book findbyId(long id) {
	Book book=	entityManager.find(Book.class, id);
	return book;
	}
	
	public Book deleteById(long id) {
	Book book=	entityManager.find(Book.class, id);
	entityManager.remove(book);
	return book;
	}

}
