package com.github.s1alves.citiesapi.countries.repository;

import com.github.s1alves.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
