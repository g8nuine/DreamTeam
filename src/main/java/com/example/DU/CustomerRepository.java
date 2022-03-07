package com.example.DU;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CustomerRepository implements CrudRepository<CustomerEntity, Long> {

    @Override
    public <S extends CustomerEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends CustomerEntity> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<CustomerEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<CustomerEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<CustomerEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(CustomerEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends CustomerEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
