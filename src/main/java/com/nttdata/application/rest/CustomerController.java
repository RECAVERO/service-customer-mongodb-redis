package com.nttdata.application.rest;

import com.nttdata.btask.interfaces.CustomerService;
import com.nttdata.domain.models.CustomerDto;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerController {
  private final CustomerService customerService;


  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GET
  public Multi<CustomerDto> findAll() {
    return customerService.list();
  }

  @POST
  public Uni<CustomerDto> add(CustomerDto customer) {
    return customerService.addCustomer(customer);
  }

  @POST
  @Path("/search")
  public Uni<CustomerDto> findByNroDocument(CustomerDto customerDto) {
    return customerService.findByNroDocument(customerDto);
  }

  @PUT
  public Uni<CustomerDto> updateCustomer(CustomerDto customer) {
    return customerService.updateCustomer(customer);
  }

  @DELETE
  public Uni<CustomerDto> deleteCustomer(CustomerDto customer) {
    return customerService.deleteCustomer(customer);
  }
}
