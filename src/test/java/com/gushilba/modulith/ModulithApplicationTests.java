package com.gushilba.modulith;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

@SpringBootTest
class ModulithApplicationTests {

	@Test
	void contextLoads() {

		var modules = ApplicationModules.of(ModulithApplication.class).verify();

		modules.forEach(System.out::println);

		new Documenter(modules)
				.writeModulesAsPlantUml()
				.writeIndividualModulesAsPlantUml();
	}

}
