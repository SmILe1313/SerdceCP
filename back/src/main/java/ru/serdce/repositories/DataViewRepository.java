package ru.serdce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.serdce.entities.AllDataView;

import java.util.List;

@Repository
public interface DataViewRepository extends JpaRepository<AllDataView, String> {
  List<AllDataView> findTop20ByOrderByIdAsc();
}
