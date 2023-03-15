#pragma once
#include <iostream>
using namespace std;
class Book {
    private:
        string author, title;
    public:
        Book();
        Book(string& author, string& title);
        Book(string&& author, string&& title);
        Book(Book& other);
        Book(Book&& other);

        friend ostream& operator <<(ostream& os, Book& book);

        void SetAuthor(string& newAuthor);
        void SetTitle(string& newTitle);
        
        void SetAuthor(string&& newAuthor);
        void SetTitle(string&& newTitle);

        Book& operator=(Book& right);
        Book& operator=(Book&& other);
        
        string GetAuthor();
        string GetTitle();
  
        ~Book();
};