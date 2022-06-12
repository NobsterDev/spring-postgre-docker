FROM tomcat:9.0.52-jdk11-adoptopenjdk-hotspot 
USER root

# to start tomcat default
RUN mv /usr/local/tomcat/webapps.dist/* /usr/local/tomcat/webapps/
COPY tomcat-users.xml /usr/local/tomcat/conf/
COPY context.xml /usr/local/tomcat/webapps/manager/META-INF/

COPY target/spring-postgre-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/spring-postgre.war

CMD ["catalina.sh", "run"]