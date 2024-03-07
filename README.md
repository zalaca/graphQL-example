# graphQL-example
Basics about GraphQL

    Este proyecto ofrece una introducción clara y sencilla a GraphQL, un lenguaje de consulta para API que permite a los desarrolladores 
    obtener datos de manera más eficiente y precisa. A través de ejemplos simples y explicaciones concisas, este repositorio proporciona una 
    guía básica para comprender qué es GraphQL y cómo se puede utilizar en el desarrollo de aplicaciones web y móviles.

Contenido:     



¿Qué es GraphQL?

    GraphQL es un lenguaje de consulta para API (Application Programming Interface) y un entorno de tiempo de ejecución que permite a 
    los clientes definir la estructura exacta de los datos que necesitan. En lugar de endpoints predefinidos que devuelven datos estáticos, 
    GraphQL permite a los clientes solicitar solo los campos específicos que desean de los recursos disponibles.
    Esto significa que los clientes pueden obtener exactamente lo que necesitan en una sola solicitud, evitando así la sobrecarga de 
    solicitudes múltiples o la sobrecarga de datos innecesarios.



Características Principales de GraphQL

    -Consulta precisa de datos: Los clientes pueden solicitar solo los campos y relaciones necesarios para su aplicación.

    -Unificación de datos: GraphQL permite a los clientes acceder a múltiples recursos y combinarlos en una sola solicitud.

    -Tipado fuerte: Los esquemas GraphQL definen la estructura de los datos disponibles y sus relaciones, lo que proporciona una guía clara para los desarrolladores de clientes.

    -Introspección: GraphQL proporciona capacidades de introspección para explorar y descubrir el esquema de la API en tiempo de ejecución.

    -Versionado simplificado: Al permitir a los clientes solicitar solo los campos necesarios, GraphQL facilita la evolución del esquema de la API sin romper las versiones anteriores.


Diferencias de GraphQL con API Rest: 

    -GraphQL tiene un único endpoint al que acceder, y en él se puede solicitar específicamente lo que necesites. 

    -El archivo schema.graphqls es el que define el contrato, ya que en él aparecen los objetos y métodos que se pueden utilizar.

    -GraphQL evita recibir más datos de los que se necesitan y es muy flexible, no depende de rígidos endpoints.


Arquitectura hexagonal aplicada a GraphQL: 

    En la arquitectura hexagonal se pueden sustituir los controladores por los resolvers, de manera que llamen a los puertos del servicio 
    en sus queries. Además se necesitará el schema.graphqls donde quedará reflejado todo lo que podrá llamar el cliente y el funcionamiento de la
    micro, que es el equivalente al openapi.yaml. También se necesitan las clases de los objetos, pero tanto el schema.graphqls como estos se pueden 
    generar con otras herramientas como se hace actualmente en API REST.


Ejemplo de peticion
    
        http://localhost:8080/graphql    

        {
            "query": "{ getAllProducts { id price } }"
        }

        {
            "query": "{ getProductById(id: 1) { id name price } }"
        }

        {
            "query": " {  getAllProducts { id price name } getAllSites { id description } }"
        }

        {
            "query": "{ getAllProductsFilteredByActive(isActive: true) { id name price active } }"
        }

        {
            "query": "{ getAllProductsFilteredByActive { id name price active } }"
        }


