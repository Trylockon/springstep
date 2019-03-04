package bab.lec.springstep.DAO.group.interfaces;

import bab.lec.springstep.model.Group;

import java.util.List;

public interface IGroupDAO {
    Group create(Group group);
    Group read(int id);
    Group update(Group group);
    void delete(int id);
    List<Group> getAll();
}
