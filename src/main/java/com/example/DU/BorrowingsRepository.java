package com.example.DU;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BorrowingsRepository implements CrudRepository<BorrowingsEntity, Long> {
    @Override
    public <S extends BorrowingsEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends BorrowingsEntity> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<BorrowingsEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<BorrowingsEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<BorrowingsEntity> findAllById(Iterable<Long> longs) {
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
    public void delete(BorrowingsEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends BorrowingsEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
