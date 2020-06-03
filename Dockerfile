FROM openjdk:8
ADD target/javadockerex.jar javadockerex.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "javadockerex.jar"]
CMD ["javadockerex", "run", "--host", "0.0.0.0"]
