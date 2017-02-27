package API.Server.service;
import API.Server.entity.cats;

import java.util.List;

public interface catsService
{
    List<cats> getAll();
    cats getByID(long id);
    cats save(cats remind);
    void remove(long id);
}