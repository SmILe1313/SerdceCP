package ru.serdce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.serdce.entities.Fio;

import java.util.List;

@Repository
public interface FioRepository extends JpaRepository<Fio, String> {
  List<Fio> findTop20ByOrderByIdAsc();
}
