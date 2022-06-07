# principios-solid-spring-boot

```text
https://medium.com/geekculture/how-to-apply-solid-software-design-principles-to-spring-boot-application-part-1-6b886f6d943e
```

## SOLID
*  SRP: Single Responsibility Principle 
*  OCP: Open-Closed Principle
*  LSP: Liskov Substitution Principle 
*  ISP: Interface Segregation Principle 
*  DIP: Dependency Inversion Principle


### SPR

**_Un módulo debe ser responsable ante uno y solo un actor (Robert C. Martín)_**

SRP establece de acuerdo en el mundo Java, cada clase debe ser responsable 
de hacer una cosa, en consecuencia, debe cambiar solo por una razón. <br>
Aislar las clases en función de su área de responsabilidad aumenta el desacoplamiento.

**_El desacoplamiento es: dos o más sistemas de alguna manera funcionan o están conectados
sin estar conectados directamente._**

La clase que es responsable de una sola funcionalidad es fácil de entender,
probar y mantener. Por "hacer una cosa" no se quiere decir que esta clase 
deba hacer literalment una cosa. La clase puede realizar múltiples tareas
y tener numerosos métodos (No demasiados) pero al final del día, todos estos
deberían servir para un actor/stakeholder/use case/funcionalidad etc.

Este tipo de clase altamente cohesiva elimina dos problemas potenciales
en el desarrollo de software diario:

* Evitar duplicados
* Disminución de los conflictos de fusión

**_Cohesión es el grado en que los elementos de un determinado módulo pertenecen juntos._**

Ejemplo:

Una aplicación de gestión de flujo de caja (cash flow) donde solo muestra una lista de 
ingresos y gastos.


Se manejarán diferentes ramas por cada patron Solid:

SPR
* feature/srp-initial (base inicial del proyecto)
* feature/spr-refactored ( refactorizando aplicando SPR)



## Docker

### Mysql

```shell
docker run -d -p 3306:3306  --name mysql-db -e MYSQL_ROOT_PASSWORD=cpalomino2022*** mysql 
```