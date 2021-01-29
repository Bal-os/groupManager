package com.gmail.sbal.stels.services;

import com.gmail.sbal.stels.model.Contact;
import com.gmail.sbal.stels.model.Group;

import java.util.List;

public interface ContactService {
    void addContact(Contact contact);
    void addGroup(Group group);
    void deleteContact(long[] ids);
    List<Group> listGroups();
    List<Contact> listContacts(Group group, int start, int count);
    List<Contact> listContacts(Group group);
    long count();
    Group findGroup(long id);
    List<Contact> searchContacts(String pattern);
}
