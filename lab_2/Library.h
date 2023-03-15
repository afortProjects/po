#pragma once
#include <iostream>
#include "Book.h"
using namespace std;

class Library {
    private:
        Book* list;
        size_t size;
    public:
        friend ostream& operator<<(ostream& os, Library& library);
        Library();
        Library(initializer_list<Book> initList);
        Library(size_t size);
        Library(Library &orig);
        Library(Library &&orig);
        Library& operator=(Library& right);
        Library& operator=(Library&& right);
        Book& operator[](size_t index);
        const Book& operator[](size_t index) const;
        size_t GetSize();
        ~Library();

};