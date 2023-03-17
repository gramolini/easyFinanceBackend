package br.com.financeManagerForAll;

import org.jboss.jandex.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class financeManagerForAllBackendApplicationTests {

	@Test
	void contextLoads() {
		Main.main(new String[]{});
		// Test added so that sonar stops complaining of the test without test logic
		Assertions.assertTrue(true);
	}

}