<div id="user-content-toc">
  <ul align="center">
    <summary><h1 style="display: inline-block">Resolución de examen parcial - Orientación a Objetos 2 - Año 2024</h1>
    <h1 style="display: inline-block">"Sistema de Almacenamiento de Stock"</h1>
    </summary>
  </ul>
</div>

---

**1- Diagrama de Clases:**

![image](https://github.com/user-attachments/assets/b3543de9-83e5-4b24-b79d-7ec203ec7e12)


**2- Consigna:**

---

**Nota:** El examen acredita puntos por la resolución del modelo y test de cada CU.

**Casos de Uso:**

**1.** + traer(String codigo): Producto

**2.** + agregar(Producto producto): int

***Lanzar excepción si ya existe el mismo Producto con el mismo código dentro de la BD***

**3.** + traer(String codigo): Lote

**4.** + traer(Producto producto): List <Lote>

**5.** + traer(String ubicacion): List <Stock>

**6.** + traer(LocalDate fechaDesde, LocalDate fechaHasta): List <Stock>

***Intervalo cerrado, se tienen en cuenta las fechas pasadas como parámetro***

**7.** +  + traer(LocalDate fechaDesde, LocalDate fechaHasta, String cliente): List <Stock>

***Intervalo cerrado, se tienen en cuenta las fechas pasadas como parámetro***

**3- Test:**

---

**Nota:** Al comenzar cada test indicar el numero de CU a resolver ej: ***System.out.println("1)");*** y luego la implementación del mismo.

**1-** Agregar e imprimir Producto:

***Producto [codigo= "6", nombre= audifonos, precio= 500]***

**2-** Intentar agregar el siguiente Producto:

***Producto [codigo= "6", nombre= placa de video, precio= 500000]***

**3-** Traer Lote codigo= "1" e imprimirlo con su información completa.

**4-** Traer los Lotes del producto con codigo= "1". Imprimir cada Lote con su Producto asociado.

**5-** Traer e imprimir los Stocks con ubicacion= "Lanus" con su información completa (su Producto y su Lote).

**6-** Traer e imprimir los Stocks entre las fechas 2024-05-18 y 2024-05-23 con su información completa.

**7-** Traer e imprimir los Stocks entre las fechas 2024-05-18 y 2024-05-23 y cliente= "Juan" con su información completa:

**4- En caso de que quiera utilizar el sistema debe relizar lo siguiente:**

---

**1-** Cambiar en el archivo de **"hibernate.cfg.xml"** los campos de **BD-URL**, **NOMBRE-USUARIO** y **CONTRASEÑA** por los datos de su BD.

**2-** Descargar el Script de la BD y las Libs de Hibernate del siguiente link: 

***https://drive.google.com/drive/folders/17B8_5UW5lFAVJvtmmXcQlxZHbmaNtECm?usp=drive_link***
