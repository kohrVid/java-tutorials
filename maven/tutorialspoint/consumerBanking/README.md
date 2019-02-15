Tutorialspoint Bank app

Generated with:

    mvn archetype:generate -DgroupId=com.kohrvid.bank -DartifactId=consumerBanking -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

Note, the mainclass had to be specified after the fact. This command also didn't generate any of the Maven plugins need for the lifecycle.

Run the file:

    mvn clean package
    java -cp target/consumerBanking-1.0-SNAPSHOT.jar com.kohrvid.bank.App
