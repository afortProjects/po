#include <iostream>
#include "Car.h"
using namespace std;

class CarRental {
    private:
        Car* arr;
        size_t size;
    public:
        friend ostream& operator<<(ostream& os, CarRental& CarRental);
        CarRental();
        CarRental(initializer_list<Car> initArr);
        CarRental(size_t size);
        CarRental(CarRental &orig);
        CarRental(CarRental &&orig);
        CarRental& operator=(CarRental& right);
        CarRental& operator=(CarRental&& right);
        Car& operator[](size_t index);
        const Car& operator[](size_t index) const;
        size_t GetSize();
        ~CarRental();
};