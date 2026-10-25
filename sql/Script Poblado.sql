INSERT INTO tipo_documento (nombre) VALUES 
('Cédula de Ciudadanía'),
('Cédula de Extranjería'),
('Pasaporte'),
('Tarjeta de Identidad'),
('Registro Civil');

INSERT INTO estado_civil (nombre) VALUES 
('Soltero/a'),
('Casado/a'),
('Unión Libre'),
('Divorciado/a'),
('Viudo/a');

INSERT INTO rol_familia (nombre) VALUES 
('Cónyuge'),
('Hijo/a'),
('Padre/Madre'),
('Hermano/a'),
('Familiar a cargo');

INSERT INTO nivel_estudio (nombre) VALUES 
('Bachiller'),
('Técnico'),
('Tecnólogo'),
('Profesional Universitario'),
('Posgrado');

INSERT INTO funcionarios (nombre, apellidos, id_tipo_documento, numero_documento, id_estado_civil, correo, telefono, sexo, direccion, fecha_nacimiento) VALUES 
('Carlos Alberto', 'Gutiérrez Pérez', 1, '1098765432', 1, 'carlos.gutierrez@mercafacil.com', '3101112233', 'M', 'Calle 45 # 12-30', '1985-04-12'),
('Ana Milena', 'Rodríguez Silva', 1, '1087654321', 2, 'ana.rodriguez@mercafacil.com', '3202223344', 'F', 'Carrera 8 # 20-15', '1990-08-22'),
('Jorge Luis', 'Martínez Gómez', 1, '1076543210', 1, 'jorge.martinez@mercafacil.com', '3153334455', 'M', 'Transv. 3 # 45-10', '1982-12-05'),
('Claudia Patricia', 'Londoño Mejía', 1, '1065432109', 3, 'claudia.londono@mercafacil.com', '3184445566', 'F', 'Avenida 6N # 14-50', '1995-03-18'),
('Héctor Fabio', 'Ríos Osorio', 1, '1054321098', 2, 'hector.rios@mercafacil.com', '3165556677', 'M', 'Calle 70 # 25-40', '1988-11-30');

INSERT INTO grupo_familiar (nombre, apellidos, id_funcionario, id_rol_familiar, correo, telefono, sexo, fecha_nacimiento) VALUES 
('Lucía', 'Gutiérrez Ruiz', 1, 2, 'lucia.g@email.com', '3101112233', 'F', '2012-05-10'),
('Marco', 'Rodríguez', 2, 1, 'marco.r@email.com', '3202223344', 'M', '1988-02-14'),
('Sofía', 'Martínez', 3, 2, 'sofia.m@email.com', '3153334455', 'F', '2015-09-20'),
('Mateo', 'Londoño', 4, 2, 'mateo.l@email.com', '3184445566', 'M', '2018-07-01'),
('Elena', 'Osorio', 5, 3, 'elena.o@email.com', '3165556677', 'F', '1955-06-15');

INSERT INTO formacion_academica (id_funcionario, id_nivel_estudio, titulo_obtenido, institucion, anio_graduacion) VALUES 
(1, 4, 'Administrador de Empresas', 'Universidad Nacional', 2010),
(2, 3, 'Tecnóloga en Contabilidad', 'SENA', 2015),
(3, 2, 'Técnico en Sistemas', 'Institución Tecnisistemas', 2005),
(4, 4, 'Ingeniera Industrial', 'Universidad del Valle', 2018),
(5, 5, 'Especialista en Gerencia', 'Universidad Javeriana', 2021);