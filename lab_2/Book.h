#pragma once
#include <iostream>
using namespace std;
class Book {
    private:
        string author, title;
    public:
        Book();
        Book(string const &author, string const &title);
        Book(string&& author, string&& title);
        Book(const Book& other);
        Book(Book&& other);

        friend ostream& operator <<(ostream& os, Book& book);

        void SetAuthor(string& newAuthor);
        void SetTitle(string& newTitle);
        
        void SetAuthor(string&& newAuthor);
        void SetTitle(string&& newTitle);

        Book& operator=(Book& right);
        Book& operator=(Book&& other);
        
        string GetAuthor() const;
        string GetTitle() const;
  
        ~Book();
};