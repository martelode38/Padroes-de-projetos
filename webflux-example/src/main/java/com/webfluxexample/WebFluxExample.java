package com.webfluxexample;

import reactor.core.publisher.Flux; 

public class WebFluxExample {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("=== SPRING WEBFLUX (PROJECT REACTOR) ===\n");


		// Isso é equivalente a criar um Subject no Observer clássico
		Flux<String> temperatureFlux = Flux.just(
				"Temperatura: 25°C",  
				"Temperatura: 30°C",  
				"Temperatura: 35°C"   
		);

		System.out.println("Criando Observers (subscribers)...\n");

		// .subscribe() = .attach() no Observer clássico
		// A função lambda (data -> ...) = método update() no Observer clássico
		temperatureFlux.subscribe(
				data -> System.out.println("[Display 1] Recebeu: " + data)  // update()
		);

		temperatureFlux.subscribe(

				data -> System.out.println("[Display 2] Recebeu: " + data)  // update()
		);


		System.out.println("\nFlux emite valores -> Observers são notificados automaticamente!");
	}
}

