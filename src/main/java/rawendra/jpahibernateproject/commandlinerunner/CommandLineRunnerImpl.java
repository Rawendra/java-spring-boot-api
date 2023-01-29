package rawendra.jpahibernateproject.commandlinerunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import rawendra.jpahibernateproject.model.Book;
import rawendra.jpahibernateproject.repository.BooksJpaRepo;
import rawendra.jpahibernateproject.repository.BooksRepo;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
	
	@Autowired
	private BooksJpaRepo booksJpaRepo;

	@Override
	public void run(String... args) throws Exception {
		booksJpaRepo.insert(new Book(5L, "shanataraman", "david-roberts"));
		booksJpaRepo.insert(new Book(1L, "harry-potter", "jk-rowlings"));
		booksJpaRepo.insert(new Book(2L, "twilight", "s-mayer"));
		booksJpaRepo.insert(new Book(3L, "art-of-deception", "robert-williams"));
		System.out.println(booksJpaRepo.findbyId(2l)); 
		System.out.println(booksJpaRepo.deleteById(5l));
		
		
		
		
	}
	
//	@Override
//	public void run(String... args) throws Exception {
////		booksrepo.insert(new Book(5L, "digital-fortress","dan-brown"));	
////		booksrepo.deleteById(1L);
////		System.out.println(booksrepo.selectById(2L));
//		
//		
//		
//	}

}
