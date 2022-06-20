package cloth;

import employees.EmployeeRepository;
import employees.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    EmployeeRepository employeeRepository;

    @InjectMocks
    EmployeeService employeeService;

    @Test
    void testSaveEmployee() {
        // Given
        // Csak példaképp: 0-át ad vissza
        // System.out.println(employeeRepository.saveEmployee("John Doe"));

        when(employeeRepository.saveEmployee(any())).thenReturn(60L);

        // When
        var id = employeeService.saveEmployee("   John Doe    ");

        // Then
        verify(employeeRepository).saveEmployee(eq("JOHN DOE"));
        assertEquals(60L, id);

    }
}
