package com.outercode.lojaVirtual;

import com.outercode.lojaVirtual.controllers.AcessoController;
import com.outercode.lojaVirtual.models.Acesso;
import com.outercode.lojaVirtual.repositories.AcessoRepository;
import com.outercode.lojaVirtual.services.AcessoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LojaVirtualApplicationTests {

	@Autowired
	private AcessoService acessoService;

	@Autowired
	private AcessoRepository acessoRepository;

	@Autowired
	private AcessoController acessoController;

	@Test
	void testCadastraAcesso() {

		Acesso acesso = new Acesso();

		acesso.setDescricao("ROLE_ADMIN");

        assertNull(acesso.getId());

		acesso = acessoController.salvarAcesso(acesso).getBody();

        assert acesso != null;
        assertTrue(acesso.getId() > 0);

		assertEquals("ROLE_ADMIN", acesso.getDescricao());

		Acesso acesso2 = acessoRepository.findById(acesso.getId()).get();

		assertEquals(acesso2.getId(), acesso.getId());


	}

}
