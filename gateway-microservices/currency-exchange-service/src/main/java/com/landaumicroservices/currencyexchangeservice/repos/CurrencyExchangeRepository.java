package com.landaumicroservices.currencyexchangeservice.repos;

import com.landaumicroservices.currencyexchangeservice.beans.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long> {

       CurrencyExchange findByFromAndTo(String from, String to);

}
