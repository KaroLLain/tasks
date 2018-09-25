package com.crud.service;

import com.crud.controller.TaskController;
import com.crud.domain.Task;
import com.crud.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbService {
    @Autowired
    private TaskRepository repository;


    public List<Task> getAllTasks(){
        return repository.findAll();
    }

    public Task getTask(long id){
        return repository.findOne(id);
    }
}
