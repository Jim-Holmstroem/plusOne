FROM erlang:18.3

RUN mkdir /opt/server
COPY . /opt/server
WORKDIR /opt/server

RUN erlc plusone.erl

CMD [ "erl", "-noshell", "-s", "plusone", "plusone", "-s", "init", "stop" ]
