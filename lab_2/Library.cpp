#include "Library.h"
#include "Book.h"
#include <iostream>
using namespace std;

Library::Library() {
    cout<<"Zainicjalizowano pusta biblioteke"<<endl;
    arr = {}; 
    size = 0;
}

Library::Library(size_t size) : size{size}, arr{new Book[size]} {
    cout<<"Nowa tablica z podanym rozmiarem" << endl;
}

Library::Library(initializer_list<Book> initList) : size(initList.size()), arr(new Book[initList.size()]) {
    std::cout<<"Stworzono tablice"<<endl;
    size_t i = 0;
    for(Book item : initList) {
        arr[i] = item;
        i++;
    }
}

Library::Library(Library &orig) : arr(orig.arr), size(orig.size) {
    cout<<"Stworzono tablice przez l-reference, z obiektem podanym"<<endl;
}

Library::Library(Library &&orig) : size(move(orig.size)), arr(move(orig.arr)) {
    orig.arr = nullptr;
    orig.size = 0;
    cout<<"Stworzono tablice przez r-reference"<<endl;
}

Library& Library::operator=(Library& right) {
    Library copy = Library(right);
    swap(arr, right.arr);
    swap(size, right.size);
    return *this;
}
Library& Library::operator=(Library&& right) {
    swap(arr, right.arr);
    swap(size, right.size);
    return *this;
}


Book& Library::operator[](size_t index) {
    return arr[index];
}

const Book& Library::operator[](size_t index) const {
    return arr[index];
}

ostream& operator<<(ostream& os, Library& library) {
    for(size_t i=0; i<library.size; i++) {
        cout<<library.arr[i]<<endl;
    }
    return os;
}

Library::~Library() {
    cout<<"Destruktor zostal wywolany"<<endl;
    if(arr != nullptr) delete[] arr;
}
