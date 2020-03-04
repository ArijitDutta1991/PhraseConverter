package outputJavaClasses;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import outputJavaClasses.Employees.Employee;

public class ParseXML {

	public static void main(String args[]) {

		try {
			File file = new File("C:\\Users\\arijitdu\\Desktop\\EmployeeData.xml");
			File emplistjaxb = new File("C:\\Users\\arijitdu\\Desktop\\EmployeeData2020.docx");
			FileWriter fileWriter = new FileWriter("C:\\Users\\arijitdu\\Desktop\\EmployeeData2020.docx");
			JAXBContext jc = JAXBContext.newInstance(Employees.class);
			Unmarshaller ums = jc.createUnmarshaller();
			Employees emps = (Employees) ums.unmarshal(file);
			ArrayList listEmp = (ArrayList) emps.getEmployee();
			for (Object e : listEmp) {
				Employee emp = (Employee) e;
				System.out.println("ID: " + emp.employeeID + " Name:" + emp.employeeName + " Address: "
						+ emp.getAddressLine1() + " " + emp.getAddressLine2() + " City: " + emp.getCity() + " ZipCode: "
						+ emp.zipCode + " Phone: " + emp.phone);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
