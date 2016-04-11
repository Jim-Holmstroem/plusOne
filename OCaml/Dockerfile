FROM ocaml/ocaml

RUN mkdir /opt/server
COPY . /opt/server
WORKDIR /opt/server

CMD [ "ocaml", "plus_one.ml" ]
