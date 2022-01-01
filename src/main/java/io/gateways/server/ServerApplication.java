package io.gateways.server;

import io.gateways.server.enumeration.Status;
import io.gateways.server.model.Server;
import io.gateways.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static io.gateways.server.enumeration.Status.*;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo){
		return args->{
			serverRepo.save(new Server(null, "192.168.1.160",
					"Ubuntu Linux",
					"16GB","Personal PC",
					"http://localhost:8080/server/image/server1.png",
					SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.58",
					"Fedora Linux",
					"16GB","Dell Tower",
					"http://localhost:8080/server/image/server2.png",
					SERVER_DOWN));
			serverRepo.save(new Server(null, "192.168.1.21",
					"MS 2008",
					"32GB","Web Server",
					"http://localhost:8080/server/image/server3.png",
					SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.14",
					"Red Hat Enterprise Linux",
					"64GB","Mail Server",
					"http://localhost:8080/server/image/server4.png",
					SERVER_DOWN));
		};
	}

}
