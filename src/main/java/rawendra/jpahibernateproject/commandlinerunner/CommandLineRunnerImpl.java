package rawendra.jpahibernateproject.commandlinerunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import rawendra.jpahibernateproject.repository.BooksRepo;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
	
	@Autowired
	private BooksRepo booksrepo;

	@Override
	public void run(String... args) throws Exception {
		booksrepo.insert();
		
		
	}

}
