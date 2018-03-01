/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: student
 *
 * Created on 16. února 2018, 11:41
 */

#include <cstdlib>
#include <iostream>
#include <cstring>
#include "nevim.h"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int pocet = 0;
    char input[256];
    cout << "jak velky char chces, napis cislo: " << endl;
    cin >> pocet;
    nevim ch6(pocet);
    cout << "napis vetu kterou chces vypsat: ";
    cin >> input;
    
    nevim ch7;
    
    /*ch7 = input;
    ch7.vypis();*/
    nevim ch1;
    nevim ch2(10);
    cout << "ch1 vypsani: "<< endl ;
    ch1.napln();
    ch1.vypis();
    ch2.napln();
    cout << "ch2 vypsani: "<< endl ;
    ch2.vypis();
    nevim ch3(10);
    ch3 = ch2;
    cout << "ch3 vypsani: "<< endl ;
    ch3.vypis();
    cout << "ch4 vypsani: "<< endl ;
    nevim ch4(1);
    ch4.napln();
    ch4 += ch2;
    ch4.vypis();
    /*cout << "ch5 vypsani: "<< endl ;
    nevim ch5(10);
    
    ch5 + ch2;
    ch5.vypis();*/
    return 0;
}

