package com.nttdata.btask.interfaces;

import com.nttdata.domain.models.CustomerDto;
import com.nttdata.infraestructure.documents.Customer;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

public interface CustomerService {
  Multi<CustomerDto> list();
  Uni<CustomerDto> addCustomer(CustomerDto customerDto);

  Uni<CustomerDto> findByNroDocument(CustomerDto customerDto);

  Uni<CustomerDto> updateCustomer(CustomerDto customerDto);

  Uni<CustomerDto> deleteCustomer(CustomerDto customerDto);
}
