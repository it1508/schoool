/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Pole.hpp
 * Author: student
 *
 * Created on 5. ledna 2018, 11:47
 */

#ifndef POLE_HPP
#define POLE_HPP

class Pole {
public:
    Pole();
    Pole(const Pole& orig);
    virtual ~Pole();
    Pole(int);
    bool napln();
    void vypis() const;
private:
    int *adresa;
    int pocet_prvku;

};

#endif /* POLE_HPP */

