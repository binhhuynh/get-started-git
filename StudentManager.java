/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iuh.di.dao;

import com.iuh.di.dto.Student;
import com.iuh.di.filter.Filter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hoangxuankhang
 */
public class StudentManager {
    private List<Student> students = new ArrayList<>();
    // hight cohesion low couplling
    // floating block of code
    {
        students.add(new Student("SE123456", "Một Nguyễn", 2000, 5, "SE"));
        students.add(new Student("SE122234", "Hai Lê", 2000, 6, "SE"));
        students.add(new Student("SE195658", "Ba Vũ", 2000, 8, "SE"));
        students.add(new Student("CS181481", "Tư Đoàn", 2000, 9, "CS"));
        students.add(new Student("CS262955", "Năm Huỳnh", 2000, 7, "CS"));
        students.add(new Student("IT265841", "Sáu Võ", 2000, 9.2, "IT"));
        students.add(new Student("IT151515", "Bảy Phan", 2000, 8, "IT"));
        students.add(new Student("IS264840", "Tám Trần", 2000, 3, "IS"));
        students.add(new Student("IT18079461", "Tran Trung Vinh", 2000, 14, "IT"));
    }
    
    public List<Student> getAllStudents(){
        return students;
    }
    
    public List<Student> getStudentUsingDI(Filter<Student> filter){
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if(filter.check(student)){
                result.add(student);
            }
        }
        
        return result;
    }
    
}
