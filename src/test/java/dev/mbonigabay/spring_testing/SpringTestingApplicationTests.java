package dev.mbonigabay.spring_testing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class SpringTestingApplicationTests {

	@Autowired
	private BookRepository bookRepository;
	@Test
	void contextLoads() {
		Book book = new Book();
		book.setName("TestContainers");

		bookRepository.save(book);

		System.out.println("Context Loads!!!");
	}

}
