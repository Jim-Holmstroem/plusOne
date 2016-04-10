FROM node:5.10

RUN mkdir /opt/server
WORKDIR /opt/server
RUN npm install split

COPY plusOne.js /opt/server

CMD [ "node", "/opt/server/plusOne.js" ]
