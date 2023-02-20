package com.nttdata.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
  private String id;
  private String name;
  private String lastName;
  private Long nroDocument;
  private int typeCustomer;
  private int typeDocument;
  private String created_datetime;
  private String updated_datetime;
  private String active;
}
