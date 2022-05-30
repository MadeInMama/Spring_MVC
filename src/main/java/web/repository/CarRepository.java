package web.repository;

import web.model.Car;

public interface CarRepository {
    Car[] GetCarsByCount(int count);

    Car[] GetCarsAll();
}
