/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   nevim.cpp
 * Author: student
 * 
 * Created on 16. února 2018, 11:41
 */

#include "nevim.h"
#include <cstring>
#include <cstdlib>
#include <iostream>

nevim::nevim() {
    this->adresa = "";
    this->pocet_prvku = 0;
}

nevim::nevim(int pocet){
    if(pocet <= 0) {
        this->adresa = "";
        this->pocet_prvku = 0;
    }
    else {
        this->adresa = new char[pocet];
        if(this->adresa != "") {
            this->pocet_prvku = pocet;
        }
        else 
            this->pocet_prvku = 0;
    }
}

nevim::nevim(const nevim& orig) {
    this->adresa = new char[orig.getPocetPrvku()];
    
    if(this->adresa != nullptr) {
        std::strcpy(this->adresa,orig.vypisStringu());
    }
}

char * nevim::vypisStringu() const{
    return this->adresa;
}


bool nevim::napln() {
    if(this->adresa != "") {
        for(int i = 0; i < this->pocet_prvku; i++) {
            this->adresa[i] = '1';
        }
        return true;
    }
    else 
        return false;
}

void nevim::vypis() const {
    if(this->adresa != "") {
        for(int i = 0; i < this->pocet_prvku; i++) {
            std::cout << this->adresa[i] << std::endl;
        }
    }
    else 
        std::cout << "Pole neexistuje." << std::endl;
}

char nevim::operator[](int index) const{
    if(index >= 0 && index < this->pocet_prvku)
        return this->adresa[index];
    else {
        return -1;
    }
}

int nevim::getPocetPrvku() const{
    return this->pocet_prvku;
}



nevim &nevim::operator = (const nevim& vpravo){
    if(this != &vpravo){
        delete[]this->adresa; //smazat pamet puvodniho objektu
        
        this->adresa = new char[vpravo.getPocetPrvku()];
        
        if(this->adresa != ""){
            for(int i = 0;i<vpravo.getPocetPrvku();i++){
                this->adresa[i]=vpravo[i];
                this->pocet_prvku = vpravo.getPocetPrvku();
            }
        }else
            this->pocet_prvku =0;    
        
    }
    return *this;
}

nevim &nevim::operator +=(const nevim& vpravo){
    char *temp = new char[this->pocet_prvku+vpravo.getPocetPrvku()+1];
    if(temp != ""){
        int i =0;
        for(;i< this->getPocetPrvku();i++){
               temp[i] = this->adresa[i];

        }

        for(;i<this->pocet_prvku + vpravo.getPocetPrvku();i++){
            temp[i] = vpravo[i-this->pocet_prvku];
        }
        
        delete[] this->adresa;
        this->adresa = temp;
        this->pocet_prvku = this->pocet_prvku+vpravo.getPocetPrvku();
        this->adresa[i] = '\0';
    }
    
   
    return *this;
}

nevim nevim::operator +(const nevim& vpravo) const{
    nevim temp(*this);
    temp +=vpravo;
    return temp;
}

nevim::~nevim() {
    delete[] this->adresa;
}

