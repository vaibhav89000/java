// Proxy Pattern provides a placeholder or surrogate object to control access to another real object.

interface EmployeeDao {
    void createEmployee(String userRole, String employeeName);
    void getEmployee(String userRole, String employeeId);
    void deleteEmployee(String userRole, String employeeId);
}

class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void createEmployee(String userRole, String employeeName) {
        System.out.println("Creating employee: " + employeeName + " with role: " + userRole);
    }

    @Override
    public void getEmployee(String userRole, String employeeId) {
        System.out.println("Getting employee with ID: " + employeeId + " and role: " + userRole);
    }

    @Override
    public void deleteEmployee(String userRole, String employeeId) {
        System.out.println("Deleting employee with ID: " + employeeId + " and role: " + userRole);
    }
}

class EmployeeDaoProxy implements EmployeeDao {
    private EmployeeDaoImpl employeeDaoImpl;

    public EmployeeDaoProxy() {
        this.employeeDaoImpl = new EmployeeDaoImpl();
    }

    @Override
    public void createEmployee(String userRole, String employeeName) {
        if (userRole.equals("ADMIN")) {
            employeeDaoImpl.createEmployee(userRole, employeeName);
        } else {
            System.out.println("Access denied: Only ADMIN can create employees.");
        }
    }

    @Override
    public void getEmployee(String userRole, String employeeId) {
        if (userRole.equals("ADMIN") || userRole.equals("USER")) {
            employeeDaoImpl.getEmployee(userRole, employeeId);
        } else {
            System.out.println("Access denied: Only ADMIN and USER can get employee details.");
        }
    }

    @Override
    public void deleteEmployee(String userRole, String employeeId) {
        if (userRole.equals("ADMIN")) {
            employeeDaoImpl.deleteEmployee(userRole, employeeId);
        } else {
            System.out.println("Access denied: Only ADMIN can delete employees.");
        }
    }
}


public class Proxy {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoProxy();

        employeeDao.createEmployee("ADMIN", "John Doe");
        employeeDao.getEmployee("USER", "123");
        employeeDao.deleteEmployee("USER", "123");
        employeeDao.createEmployee("USER", "Jack Doe");
    }
    
}
