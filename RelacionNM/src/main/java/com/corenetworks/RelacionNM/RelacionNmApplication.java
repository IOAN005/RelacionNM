package com.corenetworks.RelacionNM;

import com.corenetworks.RelacionNM.modelo.Autobus;
import com.corenetworks.RelacionNM.modelo.Conductor;
import com.corenetworks.RelacionNM.modelo.Lugar;
import com.corenetworks.RelacionNM.modelo.Visitan;
import com.corenetworks.RelacionNM.service.IAutobusService;
import com.corenetworks.RelacionNM.service.IConductorService;
import com.corenetworks.RelacionNM.service.ILugarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RelacionNmApplication  implements CommandLineRunner{
	@Autowired
	 private IAutobusService autobusService;
	@Autowired
	private IConductorService conductorService;
	@Autowired
	private ILugarService lugarService;


	public static void main(String[] args) {
		SpringApplication.run(RelacionNmApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Autobus a1=new Autobus("1234ABC",2000);
		Visitan v1 =new Visitan(0, LocalDate.now());
		Visitan v2 =new Visitan(0, LocalDate.now().plusDays(1));
		Lugar l1=new Lugar(0,"Toledo");
		Conductor c1 = new Conductor("12345678N","Ioan Bobinca");
		v1.setAutobus(a1);
		v1.setConductor(c1);
		v1.setLugar(l1);
		v2.setConductor(c1);
		v2.setLugar(l1);
		v2.setAutobus(a1);
		List<Visitan>visitas=new ArrayList<>();
		visitas.add(v1);
		visitas.add(v2);
		a1.setVisitas(visitas);
//		c1.setVisitas(visitas);
//		l1.setVisitas(visitas);
		System.out.println(conductorService.insert(c1));
		System.out.println(lugarService.insert(l1));
		System.out.println(autobusService.insert(a1));
	}
}

