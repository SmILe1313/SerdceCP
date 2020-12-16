package ru.serdce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.serdce.entities.AllDataView;
import ru.serdce.repositories.DataViewRepository;

import java.util.ArrayList;
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
    return (List<AllDataView>) repo.findTop10ByOrderByIdAsc();
  };

  public List<AllDataView> findPreza()  {
    List<AllDataView> pasients = new ArrayList<>();
    pasients.add(repo.findById("54-101-020-01").orElse(null));
    pasients.add(repo.findById("54-103-120-01").orElse(null));
    pasients.add(repo.findById("54-602-047-01").orElse(null));
    pasients.add(repo.findById("54-501-058-01").orElse(null));
    pasients.add(repo.findById("54-602-040-01").orElse(null));
    pasients.add(repo.findById("54-503-018-01").orElse(null));
    pasients.add(repo.findById("54-503-006-01").orElse(null));
    pasients.addAll(repo.findTop10ByOrderByIdAsc());
    return pasients ;
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
