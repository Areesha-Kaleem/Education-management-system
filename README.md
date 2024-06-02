# Education-management-system
This program serves as an Education Management System for a school or educational institution. It allows adding and managing students, teachers (faculty), and administrators. Users can register new individuals, set job titles and subjects, and calculate pay for employees.
Person Class: Represents a person with a name and birth year.

Student Class: Extends Person, represents a student with a student ID and enrolled semester. It allows registering new students and displaying student details.

Employee Class: Abstract class extending Person, represents an employee with an employee ID, joining year, and job title. It has an abstract method to calculate pay.

Faculty Class: Extends Employee, represents faculty members (teachers). It allows registering new faculty, setting subjects they teach, getting their subjects, and calculating their pay.

Administrator Class: Extends Employee, represents administrators. It allows registering new admins, setting their job titles, getting job titles, and calculating their pay.

Runner Class: Main class to run the program. It allows adding students, admins, and faculty members. It also provides options to set job titles, subjects, and calculate pay for employees.

In simpler words, this program manages students, teachers, and administrators in a school. It lets you add and view their details, set job titles and subjects, and calculate pay for employees.
