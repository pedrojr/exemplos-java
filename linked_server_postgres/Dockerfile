FROM library/postgres:11-alpine
RUN apk add --update freetds-dev && \
    apk add git gcc libc-dev make && \
    apk add postgresql-dev postgresql-contrib && \
    git clone https://github.com/tds-fdw/tds_fdw.git && \
    cd tds_fdw && \
    make USE_PGXS=1 && \
    make USE_PGXS=1 install && \
    apk del git gcc libc-dev make && \
    cd ..  && \
    rm -rf tds_fdw
