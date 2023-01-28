package rawendra.jpahibernateproject.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import rawendra.jpahibernateproject.model.Book;

@Repository
public class BooksRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void update() {

	}

	public void insert(Book book) {
		String sql = "insert into books (id, name, author) values (?,?,?)";
		jdbcTemplate.update(sql, book.getId(), book.getName(), book.getAuthor());
	}

	public void deleteById(Long id) {
		String sql = "delete from books where id=?";
		jdbcTemplate.update(sql, id);
	}

	public Book selectById(Long id) {
		String sql = "select * from books where id=?";
		Book result=jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class), id);
		return result;
	}

}
