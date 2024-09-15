package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> listCars;

    public CarServiceImpl() {
        listCars = new ArrayList<>();

        listCars.add(new Car(1, "Kia Rio", "black"));
        listCars.add(new Car(2, "Lada Kalina", "blue"));
        listCars.add(new Car(3, "Vaz2106", "red"));
        listCars.add(new Car(4, "Geely AtlasPro", "black"));
        listCars.add(new Car(5, "Kia Sorento", "greenSpruce"));
    }

    @Override
    public List<Car> returningTheListOfCars(int count) {
        return listCars.stream().limit(count).collect(Collectors.toList());
    }
}
