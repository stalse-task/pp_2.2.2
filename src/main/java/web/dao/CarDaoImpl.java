package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {

    private int carId;
    private List<Car> listCar;

    {
        listCar = new ArrayList<>();
        listCar.add(new Car(++carId, "audi", 326));
        listCar.add(new Car(++carId, "bmw", 456));
        listCar.add(new Car(++carId, "volkswagen", 654));
        listCar.add(new Car(++carId, "lada", 567));
        listCar.add(new Car(++carId, "opel", 453));
    }

    @Override
    public List<Car> getCar(int count) {
        return listCar.stream().limit(count).collect(Collectors.toList());
    }
}
