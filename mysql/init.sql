CREATE TABLE `projects` (
	`project_id` INT NOT NULL,
	`project_name` TEXT NOT NULL,
	`description` TEXT,
	PRIMARY KEY (`project_id`)
);

INSERT INTO projects (project_id, project_name, description) VALUES (1, 'Rinkoid', 'description');
INSERT INTO projects (project_id, project_name, description) VALUES (2, 'MPGScore', '');

CREATE TABLE `protos` (
	`proto_id` INT NOT NULL,
	`proto_name` TEXT NOT NULL,
	`project_id` INT,
	`proto_tag` TEXT NOT NULL,
	`file` VARBINARY(512) NOT NULL,
	`description` TEXT,
	PRIMARY KEY (`proto_id`),
	FOREIGN KEY (`project_id`) REFERENCES projects(`project_id`)
);

INSERT INTO protos (proto_id, proto_name, project_id, proto_tag, file, description)
	VALUES (1, 'proto1.proto', (SELECT project_id from projects WHERE project_id=1), 'v1.0.0', 'file', 'description');
INSERT INTO protos (proto_id, proto_name, project_id, proto_tag, file, description)
	VALUES (2, 'proto2.proto', (SELECT project_id from projects WHERE project_id=1), 'v2.0.0', 'file', '');
INSERT INTO protos (proto_id, proto_name, project_id, proto_tag, file, description)
	VALUES (3, 'proto3.proto', (SELECT project_id from projects WHERE project_id=2), 'v1.0.0', 'file', 'description');
