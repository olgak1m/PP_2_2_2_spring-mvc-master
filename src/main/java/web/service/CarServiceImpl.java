package web.service;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
class ServiceCarImpl implements CarService {

    private static final List<Car> resultList = new ArrayList<>();

    {

        resultList.add(new Car("BMW", 123, "black"));
        resultList.add(new Car("Chery", 7, "white"));
        resultList.add(new Car("Chevrolet", 23, "yellow"));
        resultList.add(new Car("Audi", 15, "grey"));
        resultList.add(new Car("Jeep", 24, "blue"));
    }
    @Override
    public List<Car> getListOfCar(int count) {
        return resultList.stream().limit(count).toList();
    }
}