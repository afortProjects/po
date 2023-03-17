#pragma once
#include <iostream>

enum availabilityState {
    available = 1,
    notAvailable = 0,
};
using namespace std;

class Car {
    private:
        string made;
        int vin;
        availabilityState state;
    public:
        friend ostream& operator<<(ostream& os, Car& car);
        Car();
        Car(string const &made, int const &vin, availabilityState const &availability);
        Car(const Car& car);
        Car(Car&& car);
        Car& operator=(Car &car);
        Car& operator=(Car &&car);

        void SetMade(string made);
        void SetVin(int vin);
        void SetState(availabilityState availability);
        
        string GetMade();
        int GetVin();
        availabilityState GetState();

        ~Car();
};
