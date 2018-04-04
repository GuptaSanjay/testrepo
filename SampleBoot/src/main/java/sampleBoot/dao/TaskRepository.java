package sampleBoot.dao;

import org.springframework.data.repository.CrudRepository;

import sampleBoot.Model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}
