FROM gradle:jdk17-jammy AS build
COPY --chown=gradle:gradle . /home/gradle/
WORKDIR /home/gradle/
RUN gradle bootJar --no-daemon

FROM eclipse-temurin:17-jammy


RUN mkdir /app

COPY --from=build /home/gradle/springBootCallAnalyse/build/libs/springBootCallAnalyse-0.0.1.jar /app/springBootCallAnalyse.jar

ENTRYPOINT ["java", "-jar", "-Xmx28g", "/app/springBootCallAnalyse.jar"]