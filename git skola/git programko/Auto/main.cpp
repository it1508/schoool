/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: ucitel
 *
 * Created on 9. listopadu 2017, 17:13
 */

#include <cstdlib>
#include <iostream>

#include "Auto.hpp"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    Auto autista;
    char spz[8];
    float spotreba;
    int rokVyroby;
    cout << "Autista" << endl;
    cout << "SPZ: " << autista.getSPZ() << endl;
    cout << "Spotreba: "<< autista.getSpotreba() << " l na 100 km" << endl;
    cout << "Rok vyroby: " << autista.getRokVyroby() <<endl;
    
    Auto autak(autista);
    cout << "Autak" << endl;
    cout << "SPZ: " << autak.getSPZ() << endl;
    cout << "Spotreba: "<< autak.getSpotreba() << " l na 100 km" << endl;
    cout << "Rok vyroby: " << autak.getRokVyroby() <<endl;
    
    cout << "zedej spz pro atak:";
    cin >> spz;
    if(autak.getSPZ(spz)){
        cout << "Autak" << endl;
        cout << "SPZ: " << autak.getSPZ() << endl;
    }
    else {
        cout << "byla zadana chybna spz" << endl;
    }
    cout << "zadej spotrebu pro autak:";
    cin >> spotreba;
    if(autak.setSpotreba(spotreba)){
        cout << "spotreba" << autak.getSpotreba() << endl;
    }
    cout << "zadej rok vyroby pro autak:";
    cin >> rokVyroby;
    if(autak.setRokVyroby()){
        cout << "rok vyroby:" << autak.getRokVyroby() << endl;
    }else{
        cout << "spatny rok vyroby" << endl;
    }
    cout << "stari vozu je:" << autak.getRoky()<<endl;
    Auto mojeAuto(48654564,5.6.1995);
    
    return 0;
}

