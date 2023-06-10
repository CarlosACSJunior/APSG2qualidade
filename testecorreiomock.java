package testesmock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyFloat;
import static org.mockito.Mockito.when;



import mock.CorreioService;

public class testecorreiomock {

	@Test
	public void testecep9() {
		CorreioService i = Mockito.mock(CorreioService.class);
		when(i.buscaEndereco("9000000"))
		.thenReturn("Porto Alegre");
		
		
		
		Assertions.assertEquals("Porto Alegre", i.buscaEndereco("9000000"));
	}
	@Test
	public void testecep8() {
		CorreioService i = Mockito.mock(CorreioService.class);
		when(i.buscaEndereco("8000000"))
		.thenReturn("Av. Assis Brasil");
		
		
		
		Assertions.assertEquals("Av. Assis Brasil", i.buscaEndereco("8000000"));
	}
}
