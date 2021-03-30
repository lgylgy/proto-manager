package net.lgylgy.proto.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> listAll() {
        return projectRepository.findAll();
    }

    public void save(Project project) {
        projectRepository.save(project);
    }

    public Project get(Integer id) {
        return projectRepository.findById(id).get();
    }

    public void delete(Integer id) {
        projectRepository.deleteById(id);
    }
}
