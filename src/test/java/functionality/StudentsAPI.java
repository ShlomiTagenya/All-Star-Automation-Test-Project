package functionality;


import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.StudentsAPIFlows;



@Listeners(utilities.Listeners.class)
public class StudentsAPI extends CommonOps {

    @Test(description = "Test 001 Verify  Details Student 1 ")
    @Description("Test 001 This Verifies The Details From Student 1  ")
    public void test01_verifyDetails(){
        StudentsAPIFlows.StudentDetails();
    }

    @Test(description = "Test 002 Verify Created New Student In Students List  ")
    @Description("Test 002 This Verifies That Created New Student In Students List ")
    public void test02_verifyCreatedStudent101(){
     StudentsAPIFlows.postStudent("Shlomi","Tagenya","shlomi@gmail.com","QA MANUAL");
     Verifications.verifyText(StudentsAPIFlows.getStudentProperty("id[100]"),"101");
    }

    @Test(description = "Test 003 Verify Update New Programme Student101 ")
    @Description("Test 003 This Verifies The  New Programme Update Student101 ")
    public void test03_verifyUpdateStudent101(){
        StudentsAPIFlows.updateStudent("Shlomi","Tagenya","shlomi@gmail.com",getData("newProgramme"),"101");
    }

    @Test(description = "Test 004 Verify Add Courses To New Student Student 101 ")
    @Description("Test 004 This Verifies The Adding Courses To New Student 101")
    public void test04_verifyAddCoursesStudent101(){
    StudentsAPIFlows.addCourses();
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("courses[100][0]"),getData("course1NewStudent"));
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("courses[100][1]"),getData("course2NewStudent"));
    }

   @Test(description = "Test 005 Verify Created New Student 2 In Students List ")
    @Description("Test 005 This Verifies The Created New Student 2 ")
    public void test05_verifyCreatedStudent102(){
     StudentsAPIFlows.postStudent("Renana","Shtaniner","renana@gmail.com","Design Software");
       Verifications.verifyText(StudentsAPIFlows.getStudentProperty("id[101]"),"102");
    }

    @Test(description = "Test 006 Verify Update New Programme Student 102 ")
    @Description("Test 006 This Verifies The  New Programme Update Student 102 ")
    public void test06_verifyUpdateStudent102(){
        StudentsAPIFlows.updateStudent("Renana","Shtaniner-Tagenya","renana@gmail.com","Design Software","102");
    }

    @Test(description = "Test 007 Verify Add Courses To New Student Student 102 ")
    @Description("Test 007 This Verifies The Adding Courses To New Student 102 ")
    public void test07_verifyAddCourses2(){
        StudentsAPIFlows.addCourses2();
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("courses[101][0]"),getData("course3"));
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("courses[101][1]"),getData("course4"));
        Verifications.verifyText(StudentsAPIFlows.getStudentProperty("courses[101][2]"),getData("course5"));
    }

    @Test(description = "Test 008  Verify  Details Student 102  ")
    @Description("Test 008 This Verifies The Details From Student 102  ")
    public void test08_verifyDetails2(){
        StudentsAPIFlows.StudentDetails102();
    }

    @Test(description = "Test 009 Verify  Deleted Student 101")
    @Description("Test 009 This Verifies The Student 101  Deleted")
    public void test09_verifyDeleteStudent101(){
        StudentsAPIFlows.deleteStudent("101");
        Verifications.verifyText(StudentsAPIFlows.getStudent("error"),"Not Found!");
    }

    @Test(description = "Test 010 Verify  Deleted Student 102")
    @Description("Test 010 This Verifies The Student 102  Deleted")
    public void test10_verifyDeleteStudent1022(){
        StudentsAPIFlows.deleteStudent("102");
        Verifications.verifyText(StudentsAPIFlows.getStudent("error"),"Not Found!");
    }

    @Test(description = "Test 011 Verify Details  ",dataProvider = "data-provider-student",dataProviderClass = utilities.ManageDDT.class)
    @Description("Test 010 This Verifies The Exits Student 3 Details (Use- Data Driven Testing )")
    public void test11_verifyDetailsStudent3(String details,String expected){
        StudentsAPIFlows.StudentDetails03(details,expected);
    }

    @Test(description = "Test 012 Verify Courses ",dataProvider = "data-provider-courses",dataProviderClass = utilities.ManageDDT.class)
    @Description("Test 012 This Verifies The Exits Courses  Student 3 (Use- Data Driven Testing )")
    public void test12_verifyCoursesStudent3(String courses,String expected){
        StudentsAPIFlows.StudentCourses(courses,expected);
    }




}
