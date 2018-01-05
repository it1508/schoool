/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: student
 *
 * Created on 5. ledna 2018, 11:46
 */

#include <cstdlib>

#include "Pole.hpp"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    Pole p1;
    Pole p2(10);
    if(p1.napln()){
        p1.vypis();
    }
    if(p2.napln()){
        p2.vypis();
    }
    
    
    return 0;
}

