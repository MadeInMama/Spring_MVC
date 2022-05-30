package web.service;

import web.model.Car;
import web.repository.CarRepository;
import web.repository.CarRepositoryStaticImplementation;

public class CarServiceImplementation implements CarService {
    CarRepository Repository = new CarRepositoryStaticImplementation();

    @Override
    public Car[] GetCarsByCount(int count) {
        return Repository.GetCarsByCount(count);
    }

    @Override
    public Car[] GetCarsAll() {
        return Repository.GetCarsAll();
    }
}
