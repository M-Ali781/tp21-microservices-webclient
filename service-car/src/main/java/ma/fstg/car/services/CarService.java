package ma.fstg.car.services;

import ma.fstg.car.entities.Car;
import ma.fstg.car.models.Client;
import ma.fstg.car.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private WebClient.Builder webClientBuilder;

    private static final String CLIENT_SERVICE_URL = "http://SERVICE-CLIENT/api/clients/";

    public List<Car> findAll() {
        List<Car> cars = carRepository.findAll();
        for (Car car : cars) {
            try {
                Client client = webClientBuilder.build()
                        .get()
                        .uri(CLIENT_SERVICE_URL + car.getClientId())
                        .retrieve()
                        .bodyToMono(Client.class)
                        .block();
                car.setClient(client);
            } catch (Exception ignored) {
            }
        }
        return cars;
    }

    public Car findById(Long id) throws Exception {
        Car car = carRepository.findById(id)
                .orElseThrow(() -> new Exception("Voiture introuvable avec l'id : " + id));
        try {
            Client client = webClientBuilder.build()
                    .get()
                    .uri(CLIENT_SERVICE_URL + car.getClientId())
                    .retrieve()
                    .bodyToMono(Client.class)
                    .block();
            car.setClient(client);
        } catch (Exception ignored) {
        }
        return car;
    }
}
