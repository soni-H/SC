FROM java:8
#MAINTAINER yilmazsen# 
#COPY path-to-your-application-jar path-to-webapps-in-docker-jar
COPY out/artifacts/SC_jar/SC.jar /app/myproject_name.jar

CMD ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/myproject_name.jar"]
