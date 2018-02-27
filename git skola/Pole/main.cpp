/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: ucitel
 *
 * Created on 5. ledna 2018, 11:50
 */

#include <cstdlib>
#include <iostream>
#include "Pole.hpp"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int cislo;
    int index;
    Pole p1;
    Pole p2(10);
    if(p1.napln()) 
        p1.vypis();
    if(p2.napln())
        p2.vypis();
    cout << "Zadej cislo pro pridani na konec pole p2: ";
    cin >> cislo;
    if(p2.pridej_pls(cislo))
        p2.vypis();
    cout << "Zadej index k vymazani: ";
    cin >> index;
    if(p2.vymaz_pls(index))
        p2.vypis();
    cout << "Zadej cislo ke vlozeni: ";
    cin >> cislo;
    cout << "Zadej index pred ktery vlozime cislo: ";
    cin >> index;
    if(p2.vloz_pls(cislo, index)) 
        p2.vypis();
    return 0;
}

