package rawendra.jpahibernateproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rawendra.jpahibernateproject.model.Book;

public interface BooksRepoJpaChild extends JpaRepository<Book, Long> {

}
