/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Auto.cpp
 * Author: ucitel
 * 
 * Created on 9. listopadu 2017, 17:17
 */

#include "Auto.hpp"
#include <cstring>
#include <time.h>
#define DELKA_SPZ 7

Auto::Auto() {
    this->spz = new char[DELKA_SPZ+1];
    if (this->spz != 0){
        this->spz[0]='\0'; 
    }
    this->spotreba = 0.1;
    this->rokVyroby = 1900;
}

Auto::Auto(const Auto& orig) {
    this->spz = new char[DELKA_SPZ+1];
    if (this->spz != 0){
        strcpy(this->spz, orig.getSPZ()); 
    }
    this->spotreba = orig.getSpotreba();
    this->rokVyroby = orig.getRokVyroby();
}
Auto:: Auto(char* spz,float spotreba,int rokVyroby){
    this->spz = new char[DELKA_SPZ+1];
    if (this->spz != 0){
        if(checkSpz()){
            strcpy(this->spz, spz); 
        }else{
            this->spz[0] = '\0';
        }
    }
    if(checkSpotreba(spotreba))
        this->spotreba = spotreba;
    else
        this->spotreba = 0.1;
    if(checkRokVyroby(rokVyroby))
        this->rokVyroby = rokVyroby;
    else
        this->rokVyroby = 1900;
}
Auto::~Auto() {
    if(this->spz != 0){
        delete[] this->spz;
        this->spz = 0;
    }
}

char * Auto::getSpz() const{
    return this->spz;
}

float Auto::getSpotreba() const{
    return this->spotreba;
}

int Auto::getRokVyroby() const{
    return this->rokVyroby;
}

bool Auto::setSpz(char* spz){
    if(checkSpz(spz)){
        strcpy(this->spz,spz);
        return true;
    }
    return false;
}

bool Auto::checkSpz(char *spz) const{
    if(strlen(spz) < 5 || strlen(spz) > 7)
        return false;
    for(int i = 0; i < strlen(spz); i++){
        if((spz[i] < 'A' || spz[i] > 'Z') && (spz[i] < '0' || spz[i] > '9'))
            return false;
    }
    return true;
}
bool Auto::checkSpotreba(float) const{
    if(this->spotreba <=0 ){
        return false;
    }else
        return true;
}

bool Auto::setSpotreba(char* spotreba){
    if(checkSpz(spotreba)){
        this->spotreba = spotreba ;
        return true;
    }
    return false;
}

bool::setRokVyroby(int rokVyroby){
    if(checkRokVyroby(rokVyroby)){
        this->rokVyroby = rokVyroby;
    }
}

bool Auto::checkRokVyroby(int rok) const{
    if(rok < 1900 || rok > getSystemYear())
        return false;
    else
        return true;
}

int getSystemYear(){
    time_t rawtime;
    struct tm * timeinfo;
    time ( &rawtime);
    timeinfo = localtime (&rawtime);
    return timeinfo.tm_year+1900;
}

int Auto::getRoky() const{
    return getSystemYear()-this->rokVyroby;
}

