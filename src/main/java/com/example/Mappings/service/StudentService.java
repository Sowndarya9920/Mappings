package com.example.Mappings.service;

import com.example.Mappings.exceptions.NotValid;
import com.example.Mappings.model.Student;
import com.example.Mappings.repository.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    IUserDao userDao;

    public String acceptStudents(List<Student> students) {
        List<Student> student = userDao.saveAll(students);
        return "Students were enrolled for the courses";
    }

    public List<Student> getAllStudents() {
        return userDao.findAll();
    }


    public String removeStudent(Integer id) throws NotValid {
        if(userDao.findById(id).isPresent()) {
            userDao.deleteById(id);
            return "Removed student from the course";
        }
            throw new NotValid("Student with"+" "+id +" "+"doesn't exist");
    }

    public String updateStudent(Student student, Integer id) throws NotValid{
        if(userDao.findById(id).isPresent()){
            Student students = userDao.findById(id).get();
            students.setName(student.getName());
            students.setAge(student.getAge());
            students.setBranch(student.getBranch());
            students.setPhNo(student.getPhNo());
            students.setDepartment(student.getDepartment());
            userDao.save(students);
            return "Students updated Successfully";
        }
        throw new NotValid("Student with"+" "+id+" "+"doesn't exists. Look for the appropriate id");

    }
}
