package com.api.rest.Service;

import com.api.rest.exception.ResourceNotFoundExeption;
import com.api.rest.model.Empleado;

import java.util.List;
import java.util.Optional;

public interface EmpleadoService {
    Empleado saveEmpleado (Empleado empleado) throws ResourceNotFoundExeption;
    List<Empleado> getAllEmpleados();
    Optional<Empleado> getEmpleadoById (Long id);
    Empleado updateEmpleado(Empleado empleadoActualizado);
    void deleteEmpleado(Long id);
}
