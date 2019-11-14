FROM node:11.7.0
WORKDIR /usr/src/app
COPY package*.json ./
RUN npm install
COPY . .
EXPOSE 8169
CMD [ "npm", "start" ]
