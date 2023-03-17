#include <iostream>
#include "Car.h"
using namespace std;

ostream& operator<<(ostream&os, Car& car)  {
    cout<<"Made: "<< car.made << endl;
    cout<<"Vin: "<< car.vin << endl;
    cout<<"State: "<< car.state << endl;
    return os;
}

Car::Car() {
    cout<<"Utworzono pusty obiekt klasy Car"<<endl;
    made = "";
    vin = 0;
    state = notAvailable;
}

Car::Car(string const &made, int const &vin, const availabilityState &availability) : made(made), vin(vin), state(availability) {
    cout<<"Utworzono obiekt klasy Car z podanych danych"<<endl;
}

Car::Car(const Car& car) : made(car.made), vin(car.vin), state(car.state) {
    cout << "Utworzony obiekt klasy Car z podanego obiektu l-reference"<<endl;
}
Car::Car(Car&& car) : made(move(car.made)), vin(move(car.vin)), state(move(car.state)) {
    cout << "Utworzony obiekt klasy Car z podanego obiektu r-reference"<<endl;
    car.made = "";
    car.vin = 0;
    car.state = notAvailable;
}

Car& Car::operator=(Car &car) {
    Car copy = Car(car);
    copy.vin += 100;
    swap(this->made, copy.made);
    swap(this->vin, copy.vin);
    swap(this->state, copy.state);
    return *this;

}
Car& Car::operator=(Car &&car) {
    swap(made, car.made);
    swap(vin, car.vin);
    swap(state, car.state);
    vin += 100;
    return *this;
}
void Car::SetMade(string newMade) {
    made = newMade;
}

void Car::SetVin(int newVin) {
    vin = newVin;
}

void Car::SetState(availabilityState newState) {
    state = newState;
}

string Car::GetMade() {
    return made;
}

int Car::GetVin() {
    return vin;
}

availabilityState Car::GetState() {
    return state;
}


Car::~Car() {
    cout<<"Destruktor klasy car." << endl;
}