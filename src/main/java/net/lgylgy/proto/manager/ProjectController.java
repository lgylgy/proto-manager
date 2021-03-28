package net.lgylgy.proto.manager;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
	@Autowired
	ProjectService projectService;

	@GetMapping("/projects")
	public List<Project> list() {
		return projectService.listAll();
	}

	@GetMapping("/projects/{id}")
	public ResponseEntity<Project> get(@PathVariable Integer id) {
		try {
			Project project = projectService.get(id);
			return new ResponseEntity<Project>(project, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Project>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/projects")
	public void add(@RequestBody Project project) {
		projectService.save(project);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Project user, @PathVariable Integer id) {
		try {
			Project project = projectService.get(id);
			projectService.save(project);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		projectService.delete(id);
	}

}
