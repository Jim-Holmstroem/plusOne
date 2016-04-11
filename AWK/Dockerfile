FROM busybox:1.24.2-glibc

RUN mkdir -p /opt/server
COPY . /opt/server
WORKDIR /opt/server

CMD [ "awk", "-f", "plusone.awk" ]
