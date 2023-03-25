package workflows;

import extensions.ApiActions;
import extensions.Verifications;
import io.qameta.allure.Step;
import utilities.CommonOps;
import java.util.ArrayList;
import java.util.List;


public class StudentsAPIFlows extends CommonOps {

    ///General Flows :

    @Step("Business Flow ; Get StudentProperty")
    public static String getStudentProperty(String jPath) {
        response = ApiActions.get("/student/list");
        return ApiActions.extractFromJSON(response, jPath);
    }

    @Step("Business Flow ; Create New  Student ")
    public static void postStudent(String name, String lastName, String email, String programme) {
        params.put("firstName", name);
        params.put("lastName", lastName);
        params.put("email", email);
        params.put("programme", programme);
        ApiActions.post(params, "/student/");
    }

    @Step("Business Flow: Update Existing Student In Web ")
    public static void updateStudent(String name, String lastName, String email, String programme, String id) {
        params.put("firstName", name);
        params.put("lastName", lastName);
        params.put("email", email);
        params.put("programme", programme);
        ApiActions.put(params, "/student/" + id);
    }

    @Step("Business Flow: Delete  Existing  Student  In Web")
    public static void deleteStudent(String id) {
        ApiActions.delete(id);
    }


    ///Steps Flows :

    @Step("Business Flow: UserDetails  Existing  Student 1 ")
    public static void StudentDetails() {
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("id[0]"), "1");
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("firstName[0]"), getData("firstNameStudent"));
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("lastName[0]"), getData("lastNameStudent"));
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("email[0]"), getData("emailStudent"));
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("programme[0]"), getData("programmeStudent"));
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("courses[0][0]"), getData("course1"));
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("courses[0][1]"), getData("course2"));
    }

    @Step("Business Flow: Add Courses ")
    public static void addCourses() {
        List<String> courses = new ArrayList<String>();
        courses.add("Java");
        courses.add("Selenium");
        params.put("firstName", "Shlomi");
        params.put("lastName", "Tgaenya");
        params.put("email", "shlomi@gmail.com");
        params.put("programme", "QA Automation");
        params.put("courses", courses);
        ApiActions.put(params, "/student/101");
    }

    @Step("Business Flow ; Get Deleted Student 101")
    public static String getStudent(String jPath) {
        response = ApiActions.get("/student/101");
        return ApiActions.extractFromJSON(response, jPath);
    }


    @Step("Business Flow: Add Courses ")
    public static void addCourses2() {
        List<String> courses = new ArrayList<String>();
        courses.add("Machine Element Design");
        courses.add("Human Behavior");
        courses.add("Statistics");
        params.put("firstName", "Renana");
        params.put("lastName", "Shtaniner");
        params.put("email", "renana@gmail.com");
        params.put("programme", "Design Software");
        params.put("courses", courses);
        ApiActions.put(params, "/student/102");
    }

    @Step("Business Flow ; Details  Existing  Student 102 ")
    public static void StudentDetails102() {
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("id[101]"), "102");
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("firstName[101]"), "Renana");
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("lastName[101]"), "Shtaniner");
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("email[101]"), "renana@gmail.com");
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("programme[101]"), "Design Software");
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("courses[101][0]"), getData("course3"));
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("courses[101][1]"), getData("course4"));
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("courses[101][2]"), getData("course5"));
    }


    @Step("Business Flow ; Details  Existing Student 3  ")
    public static void StudentDetails03(String details,String expected) {
        StudentsAPIFlows.getStudentProperty("id[3]");
        if (expected.equalsIgnoreCase("4"))
            Verifications.verifyText(StudentsAPIFlows.getStudentProperty("id[3]"), "4");
        else if (expected.equalsIgnoreCase("Orson")) {
            Verifications.verifyText(StudentsAPIFlows.getStudentProperty("firstName[3]"), "Orson");
        }  else if (expected.equalsIgnoreCase("Armando")) {
                Verifications.verifyText(StudentsAPIFlows.getStudentProperty("lastName[3]"), "Armando");
        } else if (expected.equalsIgnoreCase("nascetur@conguea.com")) {
            Verifications.verifyText(StudentsAPIFlows.getStudentProperty("email[3]"), "nascetur@conguea.com");
        }
        else if (expected.equalsIgnoreCase("Computer Science")) {
            Verifications.verifyText(StudentsAPIFlows.getStudentProperty("programme[3]"), "Computer Science");
        }
        else
            throw new RuntimeException("Invalid Expected");

    }

    @Step("Business Flow ; Courses Existing Student 3  ")
    public static void StudentCourses(String courses,String expected) {
        StudentsAPIFlows.getStudentProperty("courses[3]");
        if (expected.equalsIgnoreCase("Calculus"))
            Verifications.verifyText(StudentsAPIFlows.getStudentProperty("courses[3][0]"), "Calculus");
        else if (expected.equalsIgnoreCase("Algorithms")) {
            Verifications.verifyText(StudentsAPIFlows.getStudentProperty("courses[3][1]"), "Algorithms");
        }  else if (expected.equalsIgnoreCase("Software Development")) {
            Verifications.verifyText(StudentsAPIFlows.getStudentProperty("courses[3][2]"), "Software Development");
        } else if (expected.equalsIgnoreCase("Ethics")) {
            Verifications.verifyText(StudentsAPIFlows.getStudentProperty("courses[3][3]"), "Ethics");
        }
        else
            throw new RuntimeException("Invalid Expected");

    }

    }


