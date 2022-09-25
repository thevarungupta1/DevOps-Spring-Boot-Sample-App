# Sample Spring Boot App

### Build jar file
> mvn clean install

### Running app Packages as a JAR file
> java -jar target/spring-boot-sample-app-0.0.1-SNAPSHOT.jar

### Build image
> docker build --build-arg JAR_FILE=spring-boot-sample-app-0.0.1-SNAPSHOT.jar -t spring-boot-sampl
e-app .

### Create container
> docker run -d -p 5000:5000 spring-boot-sample-app