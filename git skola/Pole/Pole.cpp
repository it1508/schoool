/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Pole.cpp
 * Author: ucitel
 * 
 * Created on 5. ledna 2018, 11:50
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
    if(this->adresa != nullptr) {
        delete [] this->adresa;
        this->adresa = nullptr;
    }
}

Pole::Pole(int pocet) {
    if(pocet <= 0) {
        this->adresa = nullptr;
        this->pocet_prvku = 0;
    }
    else {
        this->adresa = new int[pocet];
        if(this->adresa != nullptr) {
            this->pocet_prvku = pocet;
        }
        else 
            this->pocet_prvku = 0;
    }
}

bool Pole::napln() {
    srand((unsigned)time(NULL));
    if(this->adresa != nullptr) {
        for(int i = 0; i < this->pocet_prvku; i++) {
            this->adresa[i] = rand()%99+1;
        }
        return true;
    }
    else 
        return false;
}

void Pole::vypis() const {
    if(this->adresa != nullptr) {
        for(int i = 0; i < this->pocet_prvku; i++) {
            std::cout << this->adresa[i] << std::endl;
        }
    }
    else 
        std::cout << "Pole neexistuje." << std::endl;
}

bool Pole::pridej_pls(int cislo) {
    int * tmp = new int[this->pocet_prvku + 1];
    if(tmp != nullptr) {
        for(int i = 0; i < this->pocet_prvku; i++) {
            tmp[i] = this->adresa[i];
        }
        tmp[this->pocet_prvku] = cislo;
        this->pocet_prvku++;
        delete [] this->adresa;
        this->adresa = tmp;
        return true;
    }
    else
        return false;
}

bool Pole::vymaz_pls(int index) {
    if(index >= 0 && index < this->pocet_prvku) {
        if(pocet_prvku > 1) {
            int * tmp = new int[this->pocet_prvku - 1];
            if(tmp != nullptr) {
                for(int i = 0; i < index; i++) {
                    tmp[i] = this->adresa[i];
                }
                for(int i = index; i < this->pocet_prvku - 1; i++) {
                    tmp[i] = this->adresa[i + 1];
                }
            }
            else {
                return false;
            }
            delete [] this->adresa;
            this->adresa = tmp;
            this->pocet_prvku--;
        }
        else {
            delete [] this->adresa;
            this->adresa = nullptr;
            this->pocet_prvku = 0;
        }
        return true;
    }
    else
        return false;    
}

bool Pole::vloz_pls(int cislo, int index) {
    if(index >= 0 && index < this->pocet_prvku) {
        int * tmp = new int[this->pocet_prvku + 1];
        if(tmp != nullptr) {
            for(int i = 0; i < index; i++) {
                tmp[i] = this->adresa[i];
            }
            tmp[index] = cislo;
            for(int i = index; i < this->pocet_prvku; i++) {
                tmp[i + 1] = this->adresa[i];
            }
        }
        else {
            return false;
        }
        delete [] this->adresa;
        this->adresa = tmp;
        this->pocet_prvku++;
        return true;
    }
    else
        return false;
}

//Radovan to neumi. A ja taky ne. A mam pocit ze ani Franta.
//Ale Martinovi to celkem jde.