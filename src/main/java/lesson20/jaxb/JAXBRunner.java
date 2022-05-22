package lesson20.jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import lesson20.Department;
import lesson20.Employee;
import lesson20.EmployeeWrapper;
import lesson20.Position;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class JAXBRunner {
    public static void main(String[] args) throws Exception{
        Employee employeeFirst = new Employee();
        employeeFirst.setPersonalNumber(42567);
        employeeFirst.setLogin("IvanovII");
        employeeFirst.setName("Ivanov Ivan Ivanovich");
        employeeFirst.setDepartment(new Department("Marketing", "Moscow"));
        employeeFirst.setPosition(new Position("Marketolog", 50000));

        Employee employeeSecond = new Employee();
        employeeSecond.setPersonalNumber(73947);
        employeeSecond.setLogin("PetrovPP");
        employeeSecond.setName("Petrov Petr Petrovich");
        employeeSecond.setDepartment(new Department("Sales", "Rostov"));
        employeeSecond.setPosition(new Position("Seller", 80000));

        Employee employeeThird = new Employee();
        employeeThird.setPersonalNumber(38797);
        employeeThird.setLogin("SidorovAA");
        employeeThird.setName("Sidorov Alexey Alexeyevich");
        employeeThird.setDepartment(new Department("Insurance", "Peterburg"));
        employeeThird.setPosition(new Position("Risk Manager", 60000));

        EmployeeWrapper employeeWrapper = new EmployeeWrapper();
        employeeWrapper.setEmployees(Arrays.asList(employeeFirst, employeeSecond, employeeThird));
        writeToXML(employeeWrapper);

    }
    @SneakyThrows
    private static void writeToXML(EmployeeWrapper employee) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(EmployeeWrapper.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        File file = new File("/Users/daraseliverstova/IdeaProjects/ITPark2021/src/main/resources/test.xml");
        FileWriter fileWriter = new FileWriter(file);
        marshaller.marshal(employee, fileWriter);
    }
}