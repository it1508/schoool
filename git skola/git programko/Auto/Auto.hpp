/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Auto.hpp
 * Author: ucitel
 *
 * Created on 9. listopadu 2017, 17:17
 */

#ifndef AUTO_HPP
#define AUTO_HPP

class Auto {
public:
    Auto();
    Auto(const Auto&);
    Auto(char*,float,int);
    virtual ~Auto();
    char* getSPZ()const;
    float getSpotreba()const;
    int getRokVyroby()const;
    int getRoky() const;
    bool setSPZ(char*);
    bool setSpotreba(float);
    bool setRokVyroby(int);
private:
    char * spz;
    float spotreba;
    int rokVyroby;
    bool checkSpz(char*) const;
    bool checkSpotreba(float) const;
    bool checkRokVyroby(int) const;
    int getSystemYear() const;
};

#endif /* AUTO_HPP */

