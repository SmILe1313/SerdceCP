package ru.serdce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.serdce.entities.AllDataView;
import ru.serdce.repositories.DataViewRepository;

import java.util.List;

@Service
@Transactional
public class DataViewService {

  @Autowired DataViewRepository repo;

  private AllDataView dataView;

  public AllDataView create(AllDataView entity) {
    return repo.save(entity);
  }

  public boolean update(AllDataView entity, String id) {
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

  public List<AllDataView> getAll() {
    return (List<AllDataView>) repo.findAll();
  }

  public List<AllDataView> findTop20()  {
    return (List<AllDataView>) repo.findTop20ByOrderByIdAsc();
  };

  public AllDataView get(String id) {
    return repo.findById(id).get();
  }

  public AllDataView getDataView() {
    return dataView;
  }

  public String getDataViewId() {
    return dataView != null ? dataView.getId() : "";
  }

  public void setDataView(AllDataView user) {
    this.dataView = user;
  }

}
