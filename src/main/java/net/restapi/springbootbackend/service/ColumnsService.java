package net.restapi.springbootbackend.service;

import net.restapi.springbootbackend.model.Columns;

import java.util.List;
import java.util.Optional;

public interface ColumnsService {
    Columns saveColumns(Columns columns);

    List<Columns> getAllColumns();

    Columns getColumnById(long id);

}