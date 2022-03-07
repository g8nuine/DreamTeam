package com.example.DU;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BookRepository implements CrudRepository<BookEntity, Long> {
    @Override
    public <S extends BookEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends BookEntity> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<BookEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<BookEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<BookEntity> findAllById(Iterable<Long> longs) {
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
    public void delete(BookEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends BookEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
