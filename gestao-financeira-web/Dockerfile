FROM node:12.13.0-alpine as build
WORKDIR /app
COPY package*.json ./app/
RUN npm install
COPY . .
RUN npm run build

FROM nginx
VOLUME /var/cache/nginx
COPY  src/default.conf /etc/nginx/conf.d/default.conf
COPY --from=build app/dist/gestao-financeira-web /usr/share/nginx/html
