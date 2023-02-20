package com.nttdata.btask.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nttdata.domain.models.CustomerDto;
import io.smallrye.mutiny.Uni;
import io.vertx.mutiny.redis.client.Command;
import io.vertx.mutiny.redis.client.Redis;
import io.vertx.mutiny.redis.client.Request;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class redisServiceImpl {
  private final Redis redis;

  public redisServiceImpl(Redis redis) {
    this.redis = redis;
  }

  Uni<Void> redisAdd(String key, String value){
    return redis.send(Request.cmd(Command.SET).arg(key).arg(value)).replaceWithVoid();
  }

  public static CustomerDto mapToDto(String customerDto) {
    return new ObjectMapper().convertValue(customerDto, CustomerDto.class);
  }
}
