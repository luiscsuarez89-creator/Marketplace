# Marketplace

Aplicación web Java EE (WAR) para gestionar entidades básicas de un **marketplace** usando **JPA (EclipseLink)** y despliegue en **GlassFish/Payara**.

## Descripción del proyecto

El proyecto implementa una base para un sistema de marketplace con persistencia de datos para:

- **Producto**
- **Cliente**
- **Tipo de documento**

Actualmente incluye:

- Entidades JPA (`ProductoEntity`, `ClienteEntity`, `TipoDocumentoEntity`).
- Capas de persistencia EJB Stateless para `Producto` y `TipoDocumento`.
- Configuración de unidad de persistencia (`persistence.xml`).
- Configuración de recurso JDBC para GlassFish (`glassfish-resources.xml`).
- Página inicial simple (`index.html`).

## Tecnologías

- Java 7
- Maven
- Java EE 7 (API web)
- JPA 2.1 / EclipseLink
- EJB (Stateless)
- GlassFish/Payara
- Apache Derby (configurado por defecto)

## Estructura del proyecto

```text
src/main/java/co/edu/konrad/marketplace/
├── entities/
│   ├── ClienteEntity.java
│   ├── ProductoEntity.java
│   └── TipoDocumentoEntity.java
└── persistence/
    ├── ProductoPersistence.java
    └── TipoDocumentoPersistence.java

src/main/resources/META-INF/persistence.xml
src/main/setup/glassfish-resources.xml
src/main/webapp/index.html
pom.xml
```

## Requisitos

Antes de ejecutar, asegúrate de tener:

- JDK 7 (o compatible con el `source/target` definido en el `pom.xml`).
- Maven 3.x.
- GlassFish 4.x/5.x o Payara compatible con Java EE 7.
- Derby en ejecución (si usas la configuración por defecto).

## Compilación

Desde la raíz del proyecto:

```bash
mvn clean package
```

Esto genera el archivo WAR en:

```text
target/Marketplace-1.0-SNAPSHOT.war
```

## Despliegue

1. Crea los recursos JDBC en el servidor usando:

```text
src/main/setup/glassfish-resources.xml
```

2. Despliega el WAR generado (`target/Marketplace-1.0-SNAPSHOT.war`) en GlassFish/Payara.

3. Abre la aplicación en el navegador (según tu contexto de despliegue), por ejemplo:

```text
http://localhost:8080/Marketplace-1.0-SNAPSHOT/
```

## Configuración de persistencia

La unidad de persistencia está en:

- `src/main/resources/META-INF/persistence.xml`

Puntos clave:

- `transaction-type="JTA"`
- DataSource JNDI: `MarketplaceDB`
- Generación de esquema: `create`

> **Importante:** actualmente hay una diferencia entre el nombre de la unidad de persistencia en `persistence.xml` (`MarketplacePU`) y el usado en las clases de persistencia (`marketplacePU`). Deben coincidir para evitar errores de despliegue.

## Funcionalidad disponible

### Entidades

- `ProductoEntity`: id, nombre, marca, valor unitario.
- `ClienteEntity`: id, nombre, apellido, fecha de nacimiento, número de documento y tipo de documento.
- `TipoDocumentoEntity`: id y nombre del tipo de documento.

### Persistencia

`ProductoPersistence` y `TipoDocumentoPersistence` incluyen métodos CRUD básicos:

- `findAll()`
- `find(id)`
- `create(entity)`
- `merge(entity)`
- `delete(id)`

## Mejoras recomendadas

- Corregir el nombre de la unidad de persistencia (`MarketplacePU` vs `marketplacePU`).
- Ajustar la operación `delete(...)` para eliminar la entidad recuperada y no el id.
- Añadir capa de servicios y endpoints REST.
- Agregar pruebas unitarias/integración.
- Actualizar versión de Java y dependencias (el proyecto usa versiones antiguas de Java EE).

## Autor

Proyecto base desarrollado por **Luis**.
