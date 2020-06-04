##FROM statement docker container image 
FROM maven
## need java dev kit 8 or higher & need maven ~ choosing right container image
## copy statement to bring scala into container & Copy the pom.xml file
COPY Gattlin-test1.scala /src/main/scala
COPY pom.xml ./
## RUN statement to run script 
RUN mvn clean package 


