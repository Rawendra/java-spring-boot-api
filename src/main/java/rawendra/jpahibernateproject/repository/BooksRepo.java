package rawendra.jpahibernateproject.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BooksRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void update() {

	}

	public void insert() {
		String psc= "insert into books (id, name, author) values (4,'angel-and-demons','dan-brown')";
		jdbcTemplate.update(psc);
	}

}
