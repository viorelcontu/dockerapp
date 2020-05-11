FROM adoptopenjdk/openjdk8:alpine-jre

COPY ["image/rclient-1.0.jar", "/opt/rclient.jar"]

RUN set -x && \
    addgroup -S -g 2020 rclient && \
    adduser -S -G rclient -u 2020 rclient

EXPOSE 8080

CMD java -jar /opt/rclient.jar

USER rclient:rclient