#include <iostream>
using namespace std;
class Vector3d {
    private:
        double array[3];
    public:
        Vector3d(double x1, double x2, double x3) {
            array[0] = x1;
            array[1] = x2;
            array[2] = x3;
        }
        const double& operator[](size_t i) const {
            return array[i];
        }
};

std::ostream& operator<<(std::ostream& ostr, const Vector3d& v) {
    ostr<<"Vector 3d{";
    for(size_t i=0;i<3;i++) {
        if(i>0) ostr<<", ";
        ostr<<v[i];
    } ostr<<"}";
    return ostr;
};

class Vector {
    protected:
        double* array;
        size_t size;
    public:
        Vector(initializer_list<double> initList) : size{initList.size()}, array {new double[initList.size()]} {
            size_t i = 0;
            for(double v : initList) {
                array[i] = v;
                i++;
            }
        }
        // Vector(const Vector& other) : size(other.size), array{new double[other.size]} {
        //     cout<<"kopiowanko"<<endl;
        // }
        // Vector& operator=(const Vector& right) {
        //     cout<<"kopiowanko ="<<endl;
        // }
        Vector(Vector&& other) {
            cout<<"Kopiujemy wektor przez &&"<< endl;
            array = other.array;
            size = other.size;
            other.array = nullptr;
            other.size = 0;
        }
        Vector& operator=(Vector&& right) {
            cout<<"Przypisujemy wektor" << endl;
            swap(array, right.array);
            swap(size, right.size);
            return *this;
        }
        size_t GetSize() const {
            return size;
        }
        const double& operator[](size_t i) const {
            return array[i];
        }
        ~Vector() {
            if(array != nullptr) delete[] array;
        }
};


int main() {
    // Vector3d wektor{1,2,3};
    // Vector3d wektor2{2,3,4};
    // wektor=Vector3d{wektor2};
    // wektor=wektor2;
    // cout<<wektor<<endl;
    // Vector w{1,2,3,4,45,5,5,55};
    // cout<<w[2];
    Vector wektor{1,2,3};
    Vector wektor3{2,3,4};
    // wektor3 = wektor;
    cout << wektor;
    return 0;
}