FROM java:8
COPY ./target/SC-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "SC-1.0-SNAPSHOT-jar-with-dependencies.jar"]
