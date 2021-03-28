CREATE TABLE `projects` (
	`ProjectID` INT NOT NULL,
	`ProjectName` TEXT NOT NULL,
	`Description` TEXT,
	PRIMARY KEY (`ProjectID`)
);

INSERT INTO projects (ProjectID, ProjectName, Description) VALUES (1, 'Rinkoid', 'description');
INSERT INTO projects (ProjectID, ProjectName, Description) VALUES (2, 'MPGScore', '');