#include <iostream>

using namespace std;

class Stos {
    private:
        int *stos;
        int rozmiar;
        int obecny_rozmiar;
        int *adres;

    public:
    friend void f(const Stos s, int a);
    friend main();
    /// default constructor
    Stos(int r=10){
        rozmiar = r;
        obecny_rozmiar = 0;
        stos = new int[rozmiar];
        adres = stos;
        cout << "Stworzono stos o rozmiarze " << rozmiar << ", Adres: " << this << endl;
        cout << "Adres tablicy stosu: " << stos << endl;
        //cout << "Adres rozmiaru stosu: " << &rozmiar << endl;
        //cout << "Adres obecnego_rozmiaru stosu: " << &obecny_rozmiar << endl << endl;
    }

    /// copy constructor
    Stos(const Stos& nowy){
        rozmiar = nowy.rozmiar;
        obecny_rozmiar = nowy.obecny_rozmiar;
        stos = nowy.adres;
        for (int i = 0; i < obecny_rozmiar; i++){
            stos[i] = nowy.stos[i];
        }
        cout << "Wywolanie konstruktora kopiujacego" << " Adres: " << this << endl;
        cout << "Adres tablicy stosu: " << stos << endl;
        //cout << "Adres rozmiaru stosu: " << &rozmiar << endl;
        //cout << "Adres obecnego_rozmiaru stosu: " << &obecny_rozmiar << endl << endl;
    }

    /// PUSH
    void push(int element){
        if(!full()){
            obecny_rozmiar++;
            stos[obecny_rozmiar-1] = element;
            cout << "PUSH: " << stos << endl;
        } else
            printf("ERROR: stos jest pelny\n");
    }

    /// POP
    void pop(){
        if(!empty()){
            obecny_rozmiar--;
        }
    }

    /// TOP
    int top(){
        if(!empty()){
            return stos[obecny_rozmiar-1];
        }
        else
            cout << "ERORR: stos jest pusty\n";
            return 0;
    }

    /// EMPTY
    int empty(){
        if(obecny_rozmiar==0)
            return 1;
        else
            return 0;
    }

    /// FULL
    int full(){
        if(obecny_rozmiar==rozmiar)
            return 1;
        else
            return 0;
    }

    /// DESTROY
    ~Stos(){
        delete[] stos;
        rozmiar = 0;
        obecny_rozmiar = 0;
        cout << "Wywolanie destruktora" << " Adres: " << this << endl;
    }
};

void f(Stos s, int a) {
   s.push(a);
}

main(){
    Stos s;
    s.push(0);
        cout <<"    1 element: "<<  s.stos[0] << "\n\n";
    f(s, 1);
        cout <<"    2 element: " << s.stos[1] << "\n\n";
    f(s, 2);
        cout <<"    3 element: " << s.stos[2] << "\n\n";
    while (!s.empty()) {
        cout<< "Adres stosu s wypisanie: " << s.stos << endl;
      cout <<
      s.top() << endl;
      s.pop();
    }
   return 0;
}
