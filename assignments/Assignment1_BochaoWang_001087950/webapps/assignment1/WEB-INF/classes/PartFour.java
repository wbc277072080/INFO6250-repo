import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import java.util.Enumeration;



public class PartFour extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String reason = request.getParameter("Reason");
        String effectiveDate = request.getParameter("EffectiveDate");
        String name = request.getParameter("Name");
        String ssn = request.getParameter("SSN");
        String dob = request.getParameter("BirthDate");
        String hireDate = request.getParameter("HireDate");
        String marital = request.getParameter("Marital");

        String medical = request.getParameter("Medical");
        String medicalPlan = request.getParameter("MedicalPlan");
        String dental = request.getParameter("Dental");
        String dentalPlan = request.getParameter("DentalPlan");
        String visionPlan = request.getParameter("VisionPlan");

        String insuranceDependent1 = request.getParameter("InsuranceDependent1");
        String insuranceName1 = request.getParameter("InsuranceName1");
        String insuranceSSN1 = request.getParameter("InsuranceSSN1");
        String insuranceDob1 = request.getParameter("InsuranceDob1");
        String insuranceGender1 = request.getParameter("InsuranceGender1");
        String insuranceStudent1 ="-";
        String insuranceRelation1="Self";
        String insurancePcp1 = request.getParameter("InsurancePcp1");

        String insuranceDependent2 = request.getParameter("InsuranceDependent2");
        String insuranceName2 = request.getParameter("InsuranceName2");
        String insuranceSSN2 = request.getParameter("InsuranceSSN2");
        String insuranceDob2 = request.getParameter("InsuranceDob2");
        String insuranceGender2 = request.getParameter("InsuranceGender2");
        String insuranceStudent2 =request.getParameter("InsuranceStudent2");
        String insuranceRelation2=request.getParameter("InsuranceRelation2");
        String insurancePcp2 = request.getParameter("InsurancePcp2");

        String insuranceDependent3 = request.getParameter("InsuranceDependent3");
        String insuranceName3 = request.getParameter("InsuranceName3");
        String insuranceSSN3 = request.getParameter("InsuranceSSN3");
        String insuranceDob3 = request.getParameter("InsuranceDob3");
        String insuranceGender3 = request.getParameter("InsuranceGender3");
        String insuranceStudent3 =request.getParameter("InsuranceStudent3");
        String insuranceRelation3=request.getParameter("InsuranceRelation3");
        String insurancePcp3 = request.getParameter("InsurancePcp3");

        String insuranceDependent4 = request.getParameter("InsuranceDependent4");
        String insuranceName4 = request.getParameter("InsuranceName4");
        String insuranceSSN4 = request.getParameter("InsuranceSSN4");
        String insuranceDob4 = request.getParameter("InsuranceDob4");
        String insuranceGender4 = request.getParameter("InsuranceGender4");
        String insuranceStudent4 =request.getParameter("InsuranceStudent4");
        String insuranceRelation4=request.getParameter("InsuranceRelation4");
        String insurancePcp4 = request.getParameter("InsurancePcp4");

        String insuranceDependent5 = request.getParameter("InsuranceDependent5");
        String insuranceName5 = request.getParameter("InsuranceName5");
        String insuranceSSN5 = request.getParameter("InsuranceSSN5");
        String insuranceDob5 = request.getParameter("InsuranceDob5");
        String insuranceGender5 = request.getParameter("InsuranceGender5");
        String insuranceStudent5 =request.getParameter("InsuranceStudent5");
        String insuranceRelation5=request.getParameter("InsuranceRelation5");
        String insurancePcp5 = request.getParameter("InsurancePcp5");

        String healthCare = request.getParameter("HealthCare");
        String healthCareAmount = request.getParameter("HealthCareAmount");
        String healthCareWaive = request.getParameter("HealthCareWaive");
        String dependentCare = request.getParameter("DependentCare");
        String dependentCareAmount = request.getParameter("DependentCareAmount");
        String dependentCareWaive = request.getParameter("DependentCareWaive");

        String healthSaving = request.getParameter("HealthSaving");
        String healthSavingAmount = request.getParameter("HealthSavingAmount");

        String supplementalLifeInsurance = request.getParameter("SupplementalLifeInsurance");
        String spouseBirth = request.getParameter("SpouseBirth");
        String spouceAmount = request.getParameter("SpouceAmount");
        String dependetChild = request.getParameter("DependetChild");
 
        String legalPlan = request.getParameter("LegalPlan");

        String beneficiaryName1 = request.getParameter("BeneficiaryName1");
        String beneficiaryRelationship1 = request.getParameter("BeneficiaryRelationship1");
        String beneficiaryPrimary1 = request.getParameter("BeneficiaryPrimary1");
        String beneficiaryPercent1 = request.getParameter("BeneficiaryPercent1");

        String beneficiaryName2 = request.getParameter("BeneficiaryName2");
        String beneficiaryRelationship2 = request.getParameter("BeneficiaryRelationship2");
        String beneficiaryPrimary2 = request.getParameter("BeneficiaryPrimary2");
        String beneficiaryPercent2 = request.getParameter("BeneficiaryPercent2");

        String beneficiaryName3 = request.getParameter("BeneficiaryName3");
        String beneficiaryRelationship3 = request.getParameter("BeneficiaryRelationship3");
        String beneficiaryPrimary3 = request.getParameter("BeneficiaryPrimary3");
        String beneficiaryPercent3 = request.getParameter("BeneficiaryPercent3");

        String beneficiaryName4 = request.getParameter("BeneficiaryName4");
        String beneficiaryRelationship4 = request.getParameter("BeneficiaryRelationship4");
        String beneficiaryPrimary4 = request.getParameter("BeneficiaryPrimary4");
        String beneficiaryPercent4 = request.getParameter("BeneficiaryPercent4");

        String employeeSignature = request.getParameter("EmployeeSignature");
        String signatureDate = request.getParameter("SignatureDate");
        String reviewedBy = request.getParameter("ReviewedBy");
        String entered = request.getParameter("Entered");



        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println("Form Details");
        out.println("</title>");
        out.println("</head>");

        out.println("<body>");

        out.println("<p> Reason of Enrollment is: "+reason+"</p>");
        out.println("<p> Effective Date is: "+effectiveDate+"</p>");
        out.println("<p> Name of Employee is: "+name+"</p>");
        out.println("<p> Social Security Number is: "+ssn+"</p>");
        out.println("<p> Date of birth is: "+dob+"</p>");
        out.println("<p> Date of hire is: "+hireDate+"</p>");
        out.println("<p> Marital status is: "+marital+"</p>");

        out.println("<p> Medical Category is: "+medical+"</p>");
        out.println("<p> Medical plan is: "+medicalPlan+"</p>");
        out.println("<p> Dental Category is: "+dental+"</p>");
        out.println("<p> Dental plan is: "+dentalPlan+"</p>");
        out.println("<p> Vision plan is: "+visionPlan+"</p>");

        out.println("<table>");
        out.println("<tr>");
        out.println("<th>");
        out.println("Plan Category");
        out.println("</th>");
        out.println("<th>");
        out.println("Name");
        out.println("</th>");
        out.println("<th>");
        out.println("SSN");
        out.println("</th>");
        out.println("<th>");
        out.println("D.O.B");
        out.println("</th>");
        out.println("<th>");
        out.println("Gender");
        out.println("</th>");
        out.println("<th>");
        out.println("Student?");
        out.println("</th>");
        out.println("<th>");
        out.println("Relationship");
        out.println("</th>");
        out.println("<th>");
        out.println("PCP#");
        out.println("</th>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>");
        out.println(insuranceDependent1);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceName1);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceSSN1);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceDob1);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceGender1);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceStudent1);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceRelation1);
        out.println("</td>");
        out.println("<td>");
        out.println(insurancePcp1);
        out.println("</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>");
        out.println(insuranceDependent2);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceName2);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceSSN2);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceDob2);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceGender2);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceStudent2);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceRelation2);
        out.println("</td>");
        out.println("<td>");
        out.println(insurancePcp2);
        out.println("</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>");
        out.println(insuranceDependent3);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceName3);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceSSN3);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceDob3);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceGender3);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceStudent3);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceRelation3);
        out.println("</td>");
        out.println("<td>");
        out.println(insurancePcp3);
        out.println("</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>");
        out.println(insuranceDependent4);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceName4);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceSSN4);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceDob4);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceGender4);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceStudent4);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceRelation4);
        out.println("</td>");
        out.println("<td>");
        out.println(insurancePcp4);
        out.println("</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>");
        out.println(insuranceDependent5);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceName5);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceSSN5);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceDob5);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceGender5);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceStudent5);
        out.println("</td>");
        out.println("<td>");
        out.println(insuranceRelation5);
        out.println("</td>");
        out.println("<td>");
        out.println(insurancePcp5);
        out.println("</td>");
        out.println("</tr>");

        out.println("</table>");


        out.println("<p> Health Care Reimbursement Account? "+healthCare+"</p>");
        out.println("<p> HealthCare Amount is: "+healthCareAmount+"</p>");
        out.println("<p> HealthCare waive participation?: "+healthCareWaive+"</p>");
        
        out.println("<p> Dependent Care Reimbursement Account? "+dependentCare+"</p>");
        out.println("<p> DependentCare Amount is: "+dependentCareAmount+"</p>");
        out.println("<p> DependentCare waive participation?: "+dependentCareWaive+"</p>");
        out.println("<p> Health Savings Account? "+healthSaving+"</p>");
        out.println("<p> HealthSaving Amount is: "+healthSavingAmount+"</p>");

        out.println("<p> SupplementalLife Insurance is: "+supplementalLifeInsurance+"</p>");
        out.println("<p> Spouse Birth is: "+spouseBirth+"</p>");
        out.println("<p> Spouse Amount is: "+spouceAmount+"</p>");
        out.println("<p> Dependet Child(ren) is: "+dependetChild+"</p>");

        out.println("<p> Legal plan Category is: "+legalPlan+"</p>");

        out.println("<table>");
        out.println("<tr>");
        out.println("<th>");
        out.println("Name");
        out.println("</th>");
        out.println("<th>");
        out.println("Relationship");
        out.println("</th>");
        out.println("<th>");
        out.println("Primary/Contingent");
        out.println("</th>");
        out.println("<th>");
        out.println("Benefit percent");
        out.println("</th>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>");
        out.println(beneficiaryName1);
        out.println("</td>");
        out.println("<td>");
        out.println(beneficiaryRelationship1);
        out.println("</td>");
        out.println("<td>");
        out.println(beneficiaryPrimary1);
        out.println("</td>");
        out.println("<td>");
        out.println(beneficiaryPercent1);
        out.println("</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>");
        out.println(beneficiaryName2);
        out.println("</td>");
        out.println("<td>");
        out.println(beneficiaryRelationship2);
        out.println("</td>");
        out.println("<td>");
        out.println(beneficiaryPrimary2);
        out.println("</td>");
        out.println("<td>");
        out.println(beneficiaryPercent2);
        out.println("</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>");
        out.println(beneficiaryName3);
        out.println("</td>");
        out.println("<td>");
        out.println(beneficiaryRelationship3);
        out.println("</td>");
        out.println("<td>");
        out.println(beneficiaryPrimary3);
        out.println("</td>");
        out.println("<td>");
        out.println(beneficiaryPercent3);
        out.println("</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>");
        out.println(beneficiaryName4);
        out.println("</td>");
        out.println("<td>");
        out.println(beneficiaryRelationship4);
        out.println("</td>");
        out.println("<td>");
        out.println(beneficiaryPrimary4);
        out.println("</td>");
        out.println("<td>");
        out.println(beneficiaryPercent4);
        out.println("</td>");
        out.println("</tr>");

        out.println("</table>");

        out.println("<p> Employee signature is: "+employeeSignature+"</p>");
        out.println("<p> Signature Date is: "+signatureDate+"</p>");
        out.println("<p> Reviewed by: "+reviewedBy+"</p>");
        out.println("<p> Entered is: "+entered+"</p>");


        out.println("</body>");

        out.println("</html>");
        out.close();
    }
}
