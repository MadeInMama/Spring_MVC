package web.repository;

import web.model.Car;

import java.util.Arrays;

public class CarRepositoryStaticImplementation implements CarRepository {
    @Override
    public Car[] GetCarsByCount(int count) {
        return Arrays.stream(Car.getCars()).limit(count).toArray(Car[]::new);
    }

    @Override
    public Car[] GetCarsAll() {
        return Car.getCars();
    }
}
