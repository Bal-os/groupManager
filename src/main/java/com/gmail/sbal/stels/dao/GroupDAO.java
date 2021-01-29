package com.gmail.sbal.stels.dao;

import com.gmail.sbal.stels.model.Group;
import com.gmail.sbal.stels.model.Group;

import java.util.List;

public interface GroupDAO {
    void add(Group group);
    void delete(Group group);
    Group findOne(long id);
    List<Group> list();
}
