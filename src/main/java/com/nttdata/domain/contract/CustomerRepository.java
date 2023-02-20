package com.nttdata.domain.contract;

import com.nttdata.domain.models.CustomerDto;
import com.nttdata.infraestructure.documents.Customer;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

import java.util.List;

public interface CustomerRepository {
  Multi<CustomerDto> list();

  Uni<CustomerDto> findByNroDocument(CustomerDto customerDto);
  Uni<CustomerDto> addCustomer(CustomerDto customerDto);

  Uni<CustomerDto> updateCustomer(CustomerDto customerDto);

  Uni<CustomerDto> deleteCustomer(CustomerDto customerDto);
}
