# TFC

# Trabajo de Fin de Ciclo

## Índice

- [Descripción del proyecto](#descripción-del-proyecto)

- [Estado del proyecto](#estado-del-proyecto)

- [Herramientas utilizadas](#herramientas-utilizadas)

- [Demostración de funciones y aplicaciones](#demostración-de-funciones-y-aplicaciones)

- [Acceso al proyecto](#acceso-al-proyecto)
  
- [Tecnologías utilizadas](#tecnologías-utilizadas)

- [Personas desarrolladoras](#personas-desarrolladoras)



## Descripción del proyecto

Este proyecto consiste en un plan de gestión personal del saldo, que ofrece la mejora de organización de las finanzas personales de los usuarios. 
Es una idea propia, inspirada en algunas funcionalidades que ofrecen los bancos, pero adaptada a métodos de organización y con enfoque a una gestión más flexible, libre y personal. 

El sistema permite al usuario establecer un presupuesto por categoría de gasto, con una frecuencia específica, es decir, que abarque un período de tiempo determinado. En ningún momento se bloquean las transacciones ni se limita el uso del saldo, mientras que esté disponible en la cuenta bancaria. La finalidad de esta funcionalidad es la guía y organización financiera, sin imponer reglas estrictas. 

El público al que va dirigido esta funcionalidad es cualquier persona interesada en controlar y gestionar sus gastos personales. Aunque está diseñada para un entorno web, el proyecto está enfocado en su uso a través de dispositivos móviles, dado que es el medio más habitual actualmente, desde el cual los usuarios gestionan sus finanzas. 
En lo referente a las tecnologías, hasta ahora el desarrollo del proyecto se ha realizado utilizando la herramienta Visual Studio Code, y los lenguajes HTML, CSS y TypeScript. Para realizar las pruebas de la comunicación cliente-servidor se ha empleado la herramienta de testeo SoapUI. 

A futuro se prevé la incorporación de algoritmos de aprendizaje automático, que analicen los datos de ingresos, ventas y gastos del usuario, con el fin de distribuir y de generar automáticamente las categorías de gastos, mediante el registro y lectura de los gastos realizados, aumentando así el grado de automatización y personalización de la herramienta. Además esta funcionalidad, se centrará de forma progresiva en el uso desde los móviles, adaptando totalmente la interfaz para poder ofrecer una experiencia optimizada a los usuarios.



## Herramientas utilizadas

Para la realización de este proyecto se ha usado Angular, un framework de fronted, que utiliza herramientas basadas en Node.js para funcionar, también necesita npm, ya que sino no se podrían ni instalar ni gestionar los módulos que Angular necesita.

### Instalación herramientas

Las versiones de las herramientas utilizadas para el desarrollo de este proyecto son las siguientes:

- Angular: 12
- Node: 12.22.12
- npm: 6.14.16 (8.15.1)

No son necesarias estas mismas versiones para la ejecución del proyecto, pero deben ser compatibles. Alguna versión compatible con 

#### Instalación Node y npm

Para la descarga e instalación de las herramientas arriba mencionadas se seguirán los siguientes pasos:

- Descargar [node](https://nodejs.org/es/download) (npm viene incuido con node, no hay que descargarlo aparte, mas si se quiere actualizar o forzar a una versión concreta, se ejecutaría el siguiente comando con la versión de preferencia: **npm install npm@8.15.1**).
- Tras su descarga, habrá que ejecutar el instalador.
- Para verificar su correcta instalación, abriremos la terminal y ejecutaremos los siguientes comandos: **node -v** para comprobar la instalación del node y **npm -v** para la de npm (esto debería devolver algo como v12.22.12 y 6.14.16, respectivamente, dependiendo de las versiones instaladas).

#### Instalación Angular e inicialización del proyecto

Para la instalación de Angular:
- Ejecutar en terminal el siguiente comando: **npm install -g @angular/cli@12**

Para la ejecución de un proyecto:
- Para crear un nuevo proyecto se ejecuta: **ng new nombre-proyecto** (en este caso ya está creado, solo habría que inicializarlo).
- Situarse en la carpeta del proyecto creado: **cd nombre-proyecto** (cd proyecto-fin-ciclo)
- Iniciamos el servidor de desarrollo con **ng serve --open** (con --open se abre un navegador a http/localhost:4200/)



## Estado del proyecto

![Static Badge](https://img.shields.io/badge/estado-en%20desarrollo-green)

## Acceso al proyecto

Puede acceder al código [fuente del proyecto](https://github.com/lvidalc1/TFC/tree/desarrollo/src/app).

## Tecnologías ultilizadas

Los lenguajes utilizados para la capa frontend, mediante el framework de Angular y usando como editor de código Visual Studio Code, han sido: HTML, CSS y TypeScript

<a href="https://developer.mozilla.org/es/docs/Web/HTML">
  <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEc9A_S6BPxCDRp5WjMFEfXrpCu1ya2OO-Lw&s" alt="fotoHtml" width="100px"/>
</a>

<a href="https://developer.mozilla.org/es/docs/Web/CSS">
  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/CSS3_logo_and_wordmark.svg/1200px-CSS3_logo_and_wordmark.svg.png" alt="fotoCss" width="70px"/>
</a>

<a href="https://developer.mozilla.org/en-US/docs/Glossary/TypeScript">
  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Typescript_logo_2020.svg/1200px-Typescript_logo_2020.svg.png" alt="fotoTypeScript" width="90px"/>
</a>

## Personas desarrolladoras

Lucía Vidal Crespo - 2ºDAW
