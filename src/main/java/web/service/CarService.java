package web.service;

import web.model.Car;

public interface CarService {
    Car[] GetCarsByCount(int count);

    Car[] GetCarsAll();
}
