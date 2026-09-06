package org.tardi;

import io.agroal.api.AgroalDataSource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CurrencyRateService {

    @Inject
    AgroalDataSource dataSource;
}
