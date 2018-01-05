/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Pole.cpp
 * Author: student
 * 
 * Created on 5. ledna 2018, 11:47
 */

#include "Pole.hpp"
#include <ctime>
#include <cstdlib>
#include <iostream>

Pole::Pole() {
    this->adresa = nullptr;
    this->pocet_prvku = 0;
}

Pole::Pole(const Pole& orig) {
}

Pole::~Pole() {
    if(this->adresa != nullptr){
        delete [] this->adresa;
        this->adresa = nullptr;
    }
}

Pole::Pole(int pocet){
    if(pocet <= 0){
        this->adresa = nullptr;
        this->pocet_prvku = 0;
    }else{
        this->adresa = new int[pocet];
        if(this->adresa != nullptr){
            this->pocet_prvku = pocet;
        }else{
            this->pocet_prvku = 0;
        }
    }
}

bool Pole::napln(){
    srand((unsigned)time(NULL));
    if(this->adresa != nullptr){
        for(int i = 0; i < this->pocet_prvku; i++){
        this->adresa[i] = rand()%99+1;    
        }
        return true;
    }else
        return false;
}

void Pole::vypis() const{
    if(this->adresa != nullptr){
        for(int i = 0; i < this->pocet_prvku;i++){
            std::cout << this->adresa[i] << std::endl;
        }
    }else
        std::cout << "pole neexistuje" << std::endl;
}