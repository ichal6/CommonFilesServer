# CommonFiles Server
> Server side app for cataloging and share files like photo, video, etc.

[//]: # (> Live demo [_here_]&#40;https://shoptherapy.herokuapp.com/&#41;.)

## Table of Contents
* [General Info](#general-information)
* [Technologies Used](#technologies-used)
* [Features](#features)<!-- * [Screenshots](#screenshots) -->
* [Setup](#setup)<!-- * [Usage](#usage) -->
* [Project Status](#project-status)  <!-- * [Room for Improvement](#room-for-improvement) * [Acknowledgements](#acknowledgements) -->
* [Contact](#contact)
* [Source](#source)
<!-- * [License](#license) -->


## General Information
- In this app I want to resolve a problem with a mess with files like photo, video, etc.
<!--
- Provide general information about your project here.
- What problem does it (intend to) solve?
- What is the purpose of your project?
- Why did you undertake it?
 You don't have to answer all the questions - just the ones relevant to your project. -->


## Technologies Used
- Docker
- Java 17
- Maven
- Spring Boot
- MongoDB
- GraphQL


[//]: # (## Features)

[//]: # (List the ready features here:)


[//]: # (## Screenshots)

[//]: # (![Login page]&#40;./img/login-page.png&#41;)

[//]: # (![Login page mobile]&#40;./img/login-page-mobile.png&#41;)

[//]: # (![Lists page mobile]&#40;./img/lists-page-mobile.png&#41;)

[//]: # (![Lists page Tablet]&#40;./img/lists-page-tablet.png&#41;)

[//]: # (![Lists page Desktop]&#40;./img/lists-page-desktop.png&#41;)


## Setup
1. You have to install Docker for running this app -> [link](https://www.docker.com/get-started);
2. Please download docker image from [Docker Hub](https://hub.docker.com/r/ichal6/common-files-server):
```shell
docker pull ichal6/common-files-server
```
> **If you want to create a local Docker image or run program without Docker, make these instructions:**
> 1. Install a local version of MongoDB: [instructions](https://www.mongodb.com/docs/manual/installation/)
> 2. After this you can use run program from maven:
> ```shell
> mvn package -P dev
> ```
> This command prepare *jar* file with an application in folder target.
> 3. You can run program from command:
> ```shell
> java -Dspring.profiles.active=docker -jar [NAME OF JAR FILE].jar
> ```
> 4. Now you can build a Docker image:
> ```shell
> docker build . -t cf-server
> ```

3. In the next step please open terminal in main directory of project and provide:
```shell
docker-compose build 
docker-compose up
```
- **If you run this at the first time program need more time and Internet connection!**

4. Please wait a moment (program need a time for initialize) and insert in your web browser **http://localhost:8080/**

## Project Status
Project is: _in progress_. <!-- If you are no longer working on it, provide reasons why. -->


<!-- ## Room for Improvement
Include areas you believe need improvement / could be improved. Also add TODOs for future development.

Room for improvement:
- Improvement to be done 1
- Improvement to be done 2

To do:
- Feature to be added 1
- Feature to be added 2 -->


<!-- ## Acknowledgements
Give credit here.
- This project was inspired by...
- This project was based on [this tutorial](https://www.example.com).
- Many thanks to... -->


## Contact
Michał Lechowicz <ichal.lechowicz@gmail.com>
## Source
Readme file was created by [@flynerdpl](https://www.flynerd.pl/)


<!-- Optional -->
<!-- ## License -->
<!-- This project is open source and available under the [... License](). -->

<!-- You don't have to include all sections - just the one's relevant to your project -->