FROM openjdk:17
# 프로젝트를 복사해서
RUN ["mkdir", "project"]
COPY . .
# 도커 파일안에서 빌드를 치고
RUN ["chmod", "744", "gradlew"]
RUN ["./gradlew", "clean", "build"]
# 그 후에 자파일을 실행한다 .
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","build/lib/*T.jar"]



