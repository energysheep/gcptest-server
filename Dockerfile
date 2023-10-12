FROM openjdk:17
# 프로젝트를 복사해서
COPY . /app/
# 도커 파일안에서 빌드를 치고
WORKDIR /app
RUN ["chmod", "744", "gradlew"]
RUN ["ls","-al", "gradlew"]
#RUN ["./gradlew", "text", "eol=lf"]
RUN ["./gradlew", "clean", "build"]
# 그 후에 자파일을 실행한다 .
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "build/lib/*T.jar"]

