package oop5.cw2.control;



import oop5.cw2.View;
import oop5.cw2.model.Student;
import oop5.cw2.model.StudyGroup;
import oop5.cw2.model.Teacher;
import oop5.cw2.service.ServiceStudent;
import oop5.cw2.service.ServiceStudyGroup;
import oop5.cw2.service.ServiceTeacher;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public Controller() {
        ServiceTeacher serviceTeacher = new ServiceTeacher();
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(serviceTeacher.create());

        ServiceStudent serviceStudent = new ServiceStudent();
        List<Student> studentList = new ArrayList<>();
        studentList.add(serviceStudent.create());
        studentList.add(serviceStudent.create());

        ServiceStudyGroup serviceStudyGroup = new ServiceStudyGroup();
        List<StudyGroup> studyGroupList = new ArrayList<>();
        studyGroupList.add(serviceStudyGroup.create(teacherList.get(0), studentList));

        View view = new View();
        String s = view.view(studentList);
        System.out.println(s);
        s = view.view(teacherList);
        System.out.println(s);
        s = view.view(studyGroupList);
        System.out.println(s);

    }
}
