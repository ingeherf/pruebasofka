package com.example.spaceship;

import com.example.spaceship.Service.NoTripulatedRocketService;
import com.example.spaceship.Service.PropelledRocketService;
import com.example.spaceship.Service.TripulatedRocketService;
import com.example.spaceship.models.Entities.NoTripulatedRocket;
import com.example.spaceship.models.Entities.PropelledRocket;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SpaceshipApplicationTests {

	@Autowired
	private NoTripulatedRocketService ntrService;

	@Autowired
	private TripulatedRocketService trService;

	@Autowired
	private PropelledRocketService pService;

	@Test
	void contextLoads() {
	}

	@DisplayName("Verificación de busqueda de un listado al momento de pedir las naves que no han sido" +
			" eliminadas anteriormente.")
	@Test
	public void listasRegistros() {
		Assert.notNull(ntrService.getAllShipsNoDeleted(null), "Listado nulo. Recomendación de uso de Optional.");
		Assert.notNull(trService.getAllShipsNoDeleted(null), "Listado nulo. Recomendación de uso de Optional.");
		Assert.notNull(pService.getAllShipsNoDeleted(null), "Listado nulo. Recomendación de uso de Optional.");
	}

	@DisplayName("Verificación del correcto funcionamiento del filtro de selección de naves.")
	@Test
	public void verificacionFiltros() {
		Assert.notNull(ntrService.getFilterResults(1, "Apollo", 0.0, 0.0, 0.0, 0.0, 0.0, "NASA", "United States", null));
		Assert.notNull(trService.getFilterResults(1, "Apollo", 0.0, 0.0, 0.0, 0.0, 0.0, "NASA", "United States", null));
		Assert.notNull(pService.getFilterResults(1, "Apollo", 0.0, 0.0, 0.0, 0.0, 0.0, "NASA", "United States", null));
	}

}
