package com.team1.spring_hibernate.service;

import com.team1.spring_hibernate.entity.Author;
import com.team1.spring_hibernate.entity.Nationality;

import java.util.List;

public interface NationalityService {

    public List<Nationality> getAllNationality();

    public void saveNationality(Nationality nationality);

    public Nationality getNationalityByID(int id);

    public void deleteNationalityByID(int id);

}
