package bab.lec.springstep.model.interfaces;

import bab.lec.springstep.model.Journal;

import java.util.List;

public interface IJournal {
    void create(Journal journal);
    Journal read(int journalId);
    void update(Journal journal, int journalId);
    void delete(int clientId);
    List<Journal> readAll();
}
