USE inventario;
 
CREATE TABLE roles(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(50)
);
 
CREATE TABLE usuarios(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(100),
correo VARCHAR(100),
password VARCHAR(255),
rol_id BIGINT
);
 
CREATE TABLE categorias(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(100)
);
 
CREATE TABLE marcas(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(100)
);
 
CREATE TABLE proveedores(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(100),
telefono VARCHAR(20),
direccion VARCHAR(200)
);
 
CREATE TABLE clientes(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(100),
telefono VARCHAR(20),
direccion VARCHAR(200)
);
 
CREATE TABLE productos(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(100),
descripcion VARCHAR(255),
stock INT,
precio_compra DECIMAL(10,2),
precio_venta DECIMAL(10,2),
categoria_id BIGINT,
marca_id BIGINT
);
 
CREATE TABLE compras(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
fecha DATE,
proveedor_id BIGINT,
total DECIMAL(10,2)
);
 
CREATE TABLE detalle_compra(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
compra_id BIGINT,
producto_id BIGINT,
cantidad INT,
precio DECIMAL(10,2)
);
 
CREATE TABLE ventas(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
fecha DATE,
cliente_id BIGINT,
total DECIMAL(10,2)
);
 
CREATE TABLE detalle_venta(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
venta_id BIGINT,
producto_id BIGINT,
cantidad INT,
precio DECIMAL(10,2)
);
 
CREATE TABLE movimientos_inventario(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
producto_id BIGINT,
tipo_movimiento VARCHAR(20),
cantidad INT,
fecha DATETIME
);
