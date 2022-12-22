package net.restapi.springbootbackend.service.impl;

import net.restapi.springbootbackend.exception.ResourceNotFoundException;
import net.restapi.springbootbackend.model.Columns;
import net.restapi.springbootbackend.repository.ColumnsRepository;
import net.restapi.springbootbackend.service.ColumnsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColumnsServiceImpl implements ColumnsService {
    private ColumnsRepository columnsRepository;

    public ColumnsServiceImpl(ColumnsRepository columnsRepository) {
        super();
        this.columnsRepository = columnsRepository;
    }

    @Override
    public Columns saveColumns(Columns columns) {
        return columnsRepository.save(columns);
    }

    @Override
    public List<Columns> getAllColumns() {
        return columnsRepository.findAll();
    }

    @Override
    public Columns getColumnById(long id) {
        Optional<Columns> columns = columnsRepository.findAllById(id);
        if (columns.isPresent()) {
            return columns.get();
        } else {
            throw new ResourceNotFoundException("columns", "id", id);
        }
    }


}