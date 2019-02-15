# Web App

The instructions on Tutorialspoint were a bit rubbish. Basically, the only way to run the server from the terminal is to use the Jetty plugin. Modifications have been made to the `pom.xml` file.

Run the app:

    mvn jetty:run -Djetty.http.port=9999
