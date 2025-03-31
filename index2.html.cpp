#include <iostream>
#include <string>
using namespace std;

// Abstract class Vehicle
class Vehicle {
public:
    string id;
    Vehicle(const string& id) : id(id) {}
    virtual void displayInfo() const = 0; // Pure virtual method
    virtual ~Vehicle() {} // Virtual destructor
};

// Motorcycle class inheriting from Vehicle
class Motorcycle : public Vehicle {
public:
    Motorcycle(const string& id) : Vehicle(id) {}
    void displayInfo() const override {
        cout << "Motorcycle (ID: " << id << ") parked in a compact space." << endl;
    }
};

// Car class inheriting from Vehicle
class Car : public Vehicle {
public:
    Car(const string& id) : Vehicle(id) {}
    void displayInfo() const override {
        cout << "Car (ID: " << id << ") parked in a compact or large space." << endl;
    }
};

// Bus class inheriting from Vehicle
class Bus : public Vehicle {
public:
    Bus(const string& id) : Vehicle

