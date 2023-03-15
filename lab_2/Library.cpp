#include "Library.h"
#include "Book.h"
#include <iostream>
using namespace std;

Library::Library() {
    cout<<"Zainicjalizowano pusta biblioteke"<<endl;
    list = {};
    size = 0;
}

Library::Library(size_t size) : size{size}, list{new Book[size]} {
    cout<<"Nowa lista z podanym rozmiarem" << endl;
}

Library::Library(initializer_list<Book> initList) : size{initList.size()}, list{new Book[initList.size()]} {
    std::cout<<"Stworzono liste"<<endl;
    size_t i = 0;
    for(Book item : initList) {
        list[i] = item;
        i++;
    }
}

Library::Library(Library &orig) : list(orig.list), size(orig.size) {
    cout<<"Stworzono liste przez l-reference, z obiektem podanym"<<endl;
}

Library::Library(Library &&orig) {
    size = orig.size;
    list = orig.list;
    orig.list = nullptr;
    orig.size = 0;
    cout<<"Stworzono liste przez r-reference"<<endl;
}

Library& Library::operator=(Library& right) {
    Library copy = Library(right);
    swap(list, right.list);
    swap(size, right.size);
    return *this;
}
Library& Library::operator=(Library&& right) {
    swap(list, right.list);
    swap(size, right.size);
    return *this;
}


Book& Library::operator[](size_t index) {
    return list[index];
}

const Book& Library::operator[](size_t index) const {
    return list[index];
}

ostream& operator<<(ostream& os, Library& library) {
    for(size_t i=0; i<library.size; i++) {
        cout<<library.list[i]<<endl;
    }
    return os;
}

Library::~Library() {
    cout<<"Destruktor zostal wywolany"<<endl;
    if(list != nullptr) delete[] list;
}
