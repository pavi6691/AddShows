package com.example.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.entity.Show;

public interface ShowRepository extends CassandraRepository<Show, Long>{

}
