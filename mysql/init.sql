CREATE TABLE `projects` (
	`project_id` INT NOT NULL,
	`project_name` TEXT NOT NULL,
	`description` TEXT,
	PRIMARY KEY (`project_id`)
);

INSERT INTO projects (project_id, project_name, description) VALUES (1, 'Rinkoid', 'description');
INSERT INTO projects (project_id, project_name, description) VALUES (2, 'MPGScore', '');