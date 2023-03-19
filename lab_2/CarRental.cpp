#include "CarRental.h"
#include "Book.h"
#include <iostream>
using namespace std;

CarRental::CarRental() {
    cout<<"Zainicjalizowano pusta wypozyczalnie"<<endl;
    arr = {}; 
    size = 0;
}

CarRental::CarRental(size_t size) : size{size}, arr{new Car[size]} {
    cout<<"Nowa tablica z podanym rozmiarem" << endl;
}

CarRental::CarRental(initializer_list<Car> initList) : size{initList.size()}, arr{new Car[initList.size()]} {
    std::cout<<"Stworzono tablice"<<endl;
    size_t i = 0;
    for(Car item : initList) {
        cout<<"i"<<item<<endl;
        arr[i] = move(item);
        arr[i].SetVin(arr[i].GetVin()-100);
        i++;
    }
}

CarRental::CarRental(CarRental &orig) : size{orig.size}, arr{new Car[orig.size]} {
    for(std::size_t i=0; i < size; i++) {
        arr[i] = orig.arr[i];
    }

    cout<<"Stworzono tablice przez l-reference, z obiektem podanym"<<endl;
}

CarRental::CarRental(CarRental &&orig) {
    arr = orig.arr;
    size = orig.size;

    orig.arr = nullptr;
    orig.size = 0;
    cout<<"Stworzono tablice przez r-reference"<<endl;
}

CarRental& CarRental::operator=(CarRental& right) {
    CarRental copy = CarRental(right);
    swap(arr, copy.arr);
    swap(size, copy.size); 
    return *this;
}
CarRental& CarRental::operator=(CarRental&& right) {
    swap(arr, right.arr);
    swap(size, right.size);
    return *this;
}


Car& CarRental::operator[](size_t index) {
    return arr[index];
}

const Car& CarRental::operator[](size_t index) const {
    return arr[index];
}

ostream& operator<<(ostream& os, CarRental& car) {
        for(size_t i=0; i<car.size; i++) {
        cout<<car.arr[i]<<endl;
    }
    return os;
}

CarRental::~CarRental() {
    cout<<"Destruktor zostal wywolany"<<endl;
    if(arr != nullptr) delete[] arr;
}
