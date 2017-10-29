package io.dssd.web;

import io.dssd.model.Expediente;
import io.dssd.model.Fotografia;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DssdBackendApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void mappingTest() {
		Expediente expediente = new Expediente();
		Fotografia fotografia = new Fotografia();
		expediente.addFotografia(fotografia);



	}

}
