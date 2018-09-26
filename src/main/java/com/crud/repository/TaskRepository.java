package com.crud.repository;

import com.crud.domain.Task;
import com.crud.domain.TaskDto;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;

public interface TaskRepository extends CrudRepository<Task, Long> {
    @Override
    List<Task> findAll();

    @Override
    Task save(Task task);

    Optional<Task> findById(Long id);

    TaskDto deleteById(Long id);
}
