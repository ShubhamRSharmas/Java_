--- Create the Students table
CREATE TABLE Students (
    id INT PRIMARY KEY,
    name TEXT,
    age INT
);

--- Create the Courses table
CREATE TABLE Courses (
    course_id INT PRIMARY KEY,
    course_name TEXT,
    student_id INT --- This links to Students.id [Foreign Key]
);

--- Insert some data
INSERT INTO Students VALUES (1, 'Shubham', 24);
INSERT INTO Students VALUES (2, 'Rahul', 23);

INSERT INTO Courses VALUES (101, 'Java Basics', 1);
INSERT INTO Courses VALUES (102, 'SQL Masterclass', 1);
INSERT INTO Courses VALUES (103, 'Python Intro', 2);

--- INNER JOIN - A list of every student and the course they are taking? You need data from both tables at once. We use a JOIN.
SELECT Students.name, Courses.course_name
FROM Students
INNER JOIN Courses ON Students.id = Courses.student_id;