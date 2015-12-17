# Hello example with Maven

## Init the basic project

### Create a Maven war project

__Create a new webapp project from Eclipse__

    File -> New -> Maven Project

Next -> Filter: `webapp`(maven-archetype-webapp)

`groupId`: `com.tsystems.demo`(project group)
`artifactId`: `hello-web`(the project name)
`version`: `0.0.1-SNAPSHOT` (default)

__Copy from the exist hello-app project and change some configuration__

1. Change `packaging` from `jar` to `war`(web application).

    <packaging>war</packaging>

2. Change the artifactId(didn't allow duplicate) to `hello-web`.

3. Create a `webapp` folder in `src/main` folder, and create an `WEB-INF` folder in the `webapp` folder, then add a `web.xml` file in the `WEB-INF` folder.

    <!DOCTYPE web-app PUBLIC
     "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
     "http://java.sun.com/dtd/web-app_2_3.dtd" >
    
    <web-app>
        <display-name>Hello Web Application</display-name>
    </web-app>

4. Add index.html to src/main/webapp(used for test)

5. Import the exist maven project `hello-web`.

## Test the web application

Right click on the project, `Run as` -> `Run on Server`.

If there is no server yet, create a new tomcat server.

