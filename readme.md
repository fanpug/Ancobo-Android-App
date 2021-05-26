# Proyecto Tercer Parcial
Este repositorio fue creado para el proyecto del tercer parcial de la materia de Desarrollo Basado en Plataformas por Humberto Alejandro Navarro Andujo. El link al repositorio del servidor con los curriculums es https://github.com/fanpug/Android-Curriculum-Server-App.


## Descripción de los problemas
Para el tercer parcial se requiere realizar un proyecto para la plataforma Android que cumpla las siguientes características:

  a) Debe implementar una interfaz visual que muestre los datos de su curriculum. (nombre completo, bio, educación y lista de habilidades).

  b) Los datos deben provenir del servidor web creado en el proyecto del parcial II la ruta es /{matricula} (debe haber una ruta por cada integrante).

Se debe entregar una actividad que funcione como menú y que lleve a cada curriculum de cada miembro del equipo.

Entregable: Cada miembro del equipo deberá subir la liga de su repositorio en gitlab / github.


## Prerequisitos
Para ejecutar el servidor en la terminal de linux se debe de contar con alguna version de **Node.js**. Para compilar y emular la aplicacion se debe contar con el programa de **Android Studio**.


### Instalando
Para actualizar a las ultimas versiones de Node.js, se pueden utilizar los siguientes comandos:
```
sudo apt-get update
```
```
sudo apt-get upgrade
```

Para descargar e instalar Node.js se puede utilizar el siguiente comando en la terminal:
```
sudo apt-get install nodejs
```


## Corriendo pruebas
Para correr el servidor local, solo se ejecuta el siguiente comando en la terminal de linux:
```
node app.js
```

![image](https://user-images.githubusercontent.com/10736003/119589004-33aed180-bd8f-11eb-97bd-12553e61ec04.png)

Una vez que el servidor se este ejecutando, se puede verificar que el sitio web esta activo al ir a la siguiente direccion dentro del navegador:
```
localhost:8888/
```
Una vez que nuestro servidor este corriendo, en otra terminal dentro de la misma carpeta escribiremos el siguiendo comando
```
./ngrok http 8888
```
el cual permitira al programa de **ngrok** hacer un tunel desde nuestro puerto local 8888 hacia el mundo.

Una vez ejecutado este comando, la pantalla de la terminal cambiara y nos mostrara dos enlaces similares con la unica diferencia siendo que uno es *http* y el otro es *https*.

![image](https://user-images.githubusercontent.com/10736003/119588696-99e72480-bd8e-11eb-80ca-ffa64d52e5e1.png)

Tomaremos el enlace **https** e iremos al programa de *Android Studio* donde abriremos el proyecto de la [aplicacion](https://github.com/fanpug/Android-Curriculum-App).

Para que nuestra aplicacion pueda funcionar de manera correcta simplemente se deben de cambiar los enlaces de ngrok dentro de la actividad principal (MainActivity.java).

![image](https://user-images.githubusercontent.com/10736003/119589356-db2c0400-bd8f-11eb-9bb4-746069c6c3d4.png)

Una vez que se realicen esos cambios, se corre la aplicacion y se abre la pantalla principal:

![image](https://user-images.githubusercontent.com/10736003/119588773-b6835c80-bd8e-11eb-996d-9dcd076d337a.png)

En la pantalla principal se tienen 3 botones, cada boton invoca un curriculum diferente del servidor:

![image](https://user-images.githubusercontent.com/10736003/119590565-3b23aa00-bd92-11eb-82d5-77efefc81b64.png)

![image](https://user-images.githubusercontent.com/10736003/119590494-17606400-bd92-11eb-96b3-7acbf176ec75.png)

## Construido con
* Nano - Editor de texto
* Atom - Editor de texto
* Node.js - Entorno para ejecutar JS (EC6)
* Android Studio - IDE oficial para la plataforma Android


## Contribuiciones
No aceptamos contribuciones >:|


## Autores
* **Humberto Alejandro Navarro Andujo** - [Repositorio](https://github.com/fanpug)
* **Sergio Armando Rodriguez Nava** - [Repositorio](https://github.com/XKerberosX)
* **Kevin López Venegas** - [Repositorio](https://github.com/kevinlpzv)

## Licencia
El proyecto tiene libre licencia o algo asi ;)


## Agradecimientos
El profesor Luis Antonio Ramirez Martinez fue quien nos inspiro a realizar este proyecto/tarea, muchas gracias profe. Su clase es la unica chida.

Gracias a las personas de PurpleBooth por su plantilla/referencia de como debe ser el [formato de un readme](https://gist.github.com/PurpleBooth/109311bb0361f32d87a2).
