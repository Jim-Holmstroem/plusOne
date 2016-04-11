FROM haskell:7.10.3

RUN mkdir /opt/server
COPY PlusOne.hs /opt/server
WORKDIR /opt/server

CMD [ "runhaskell", "PlusOne.hs" ]
