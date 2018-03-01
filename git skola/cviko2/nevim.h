/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   nevim.h
 * Author: student
 *
 * Created on 16. února 2018, 11:41
 */

#ifndef NEVIM_H
#define NEVIM_H

class nevim {
public:
    nevim();
    nevim(int);
    nevim(const nevim& orig);
    virtual ~nevim();
    bool napln();
    void vypis()const;
    char operator[](int)const;
    char * vypisStringu()const;
    int getPocetPrvku() const;
    nevim &operator=(const nevim &); 
    nevim &operator+=(const nevim &);
    nevim operator+(const nevim &) const;
private:
    char * adresa;
    int pocet_prvku;
};

#endif /* NEVIM_H */

