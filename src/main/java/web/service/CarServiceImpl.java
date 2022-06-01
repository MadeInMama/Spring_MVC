package web.service;

import web.model.Car;
import web.repository.CarRepository;
import web.repository.CarRepositoryStaticImpl;

public class CarServiceImpl implements CarService {
    CarRepository Repository = new CarRepositoryStaticImpl();

    @Override
    public Car[] GetCarsByCount(int count) {
        return Repository.GetCarsByCount(count);
    }

    @Override
    public Car[] GetCarsAll() {
        return Repository.GetCarsAll();
    }
}
