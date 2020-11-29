package ru.serdce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.serdce.entities.Fio;
import ru.serdce.repositories.FioRepository;

import java.util.List;

@Service
@Transactional
public class FioService {

  @Autowired
  FioRepository repo;

  private Fio fio;

  public Fio create(Fio entity) {
    return repo.save(entity);
  }

  public boolean update(Fio entity, String id) {
    if (repo.existsById(id)) {
      entity.setId(id);
      repo.save(entity);
      return true;
    }
    return false;
  }


  public void delete(String id) {
    repo.deleteById(id);
  }

  public List<Fio> getAll() {
    return (List<Fio>) repo.findAll();
  }

  public List<Fio> findTop20()  {
    return (List<Fio>) repo.findTop20ByOrderByIdAsc();
  };

  public Fio get(String id) {
    return repo.findById(id).get();
  }

  public Fio getFio() {
    return fio;
  }

  public String getFioId() {
    return fio != null ? fio.getId() : "";
  }

  public void setFio(Fio user) {
    this.fio = user;
  }

}
