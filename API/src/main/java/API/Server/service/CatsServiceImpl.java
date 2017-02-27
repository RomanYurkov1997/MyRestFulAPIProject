package API.Server.service;


import API.Server.repository.Repository;
import API.Server.entity.cats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatsServiceImpl implements catsService {




    @Autowired
    private Repository repository;

    public List<cats> getAll() {
        return repository.findAll();
    }

    public cats getByID(long id) {
        return repository.findOne(id);
    }

    public cats save(cats cats) {
        return repository.saveAndFlush(cats);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}