FROM openjdk:8u162-jre-slim

MAINTAINER devicehive

ENV DH_VERSION="3.5.0"

LABEL org.label-schema.url="https://devicehive.com" \
      org.label-schema.vendor="DeviceHive" \
      org.label-schema.vcs-url="https://github.com/devicehive/devicehive-java-server" \
      org.label-schema.name="devicehive-frontend" \
      org.label-schema.version="$DH_VERSION"

RUN apt-get update \
    && apt-get install -y netcat-openbsd \
    && rm -rf /var/lib/apt/lists/*

ADD devicehive-frontend-3.5.0-boot.jar /opt/devicehive/
#start script
ADD devicehive-frontend/devicehive-start.sh /opt/devicehive/

ADD test01.txt /opt/devicehive/

VOLUME ["/var/log/devicehive"]

WORKDIR /opt/devicehive/

ENTRYPOINT ["/bin/sh"]

CMD ["./devicehive-start.sh"]

EXPOSE 8080
