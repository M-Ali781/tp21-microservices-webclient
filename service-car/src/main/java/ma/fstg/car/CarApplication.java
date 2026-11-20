package ma.fstg.car;

import ma.fstg.car.entities.Car;
import ma.fstg.car.repositories.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class CarApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarApplication.class, args);
    }

    @Bean
    CommandLineRunner initCars(CarRepository carRepository) {
        return args -> {
            carRepository.save(new Car(null, "Toyota", "Corolla", "A 25 333", 1L, null));
            carRepository.save(new Car(null, "Renault", "Megane", "B 6 3456", 1L, null));
            carRepository.save(new Car(null, "Peugeot", "301", "A 55 4444", 2L, null));
        };
    }
}
