## Build

- Run `docker build -t siege-java-app:latest .` to build the docker image for the java app.

---

## Siege

[siege_urls.txt](siege_urls.txt)

- Run `siege -c 10 -t 60S -f siege_urls.txt` to benchmark the java app for 60 seconds with 10 concurrent users.
- Run `siege -c 25 -t 60S -f siege_urls.txt` to benchmark the java app for 60 seconds with 10 concurrent users.
- Run `siege -c 50 -t 60S -f siege_urls.txt` to benchmark the java app for 60 seconds with 10 concurrent users.
- Run `siege -c 100 -t 60S -f siege_urls.txt` to benchmark the java app for 60 seconds with 10 concurrent users.

---

## Results

### Siege with 10 concurrent users for 60 seconds:

```bash
Transactions:                  21711 hits
Availability:                 100.00 %
Elapsed time:                  60.29 secs
Data transferred:               0.21 MB
Response time:                  0.03 secs
Transaction rate:             360.11 trans/sec
Throughput:                     0.00 MB/sec
Concurrency:                    9.92
Successful transactions:       14471
Failed transactions:               0
Longest transaction:            0.28
Shortest transaction:           0.00
```

### Siege with 25 concurrent users for 60 seconds:

```bash
Transactions:                  11294 hits
Availability:                 100.00 %
Elapsed time:                  60.53 secs
Data transferred:               0.11 MB
Response time:                  0.13 secs
Transaction rate:             186.59 trans/sec
Throughput:                     0.00 MB/sec
Concurrency:                   24.74
Successful transactions:        7522
Failed transactions:               0
Longest transaction:            0.82
Shortest transaction:           0.00
```

### Siege with 50 concurrent users for 60 seconds:

```bash
Transactions:                   4116 hits
Availability:                  99.93 %
Elapsed time:                  60.94 secs
Data transferred:               0.04 MB
Response time:                  0.73 secs
Transaction rate:              67.54 trans/sec
Throughput:                     0.00 MB/sec
Concurrency:                   49.57
Successful transactions:        2730
Failed transactions:               3
Longest transaction:           19.48
Shortest transaction:           0.00
```

### Siege with 100 concurrent users for 60 seconds:

```bash
Transactions:                    249 hits
Availability:                  89.57 %
Elapsed time:                  60.64 secs
Data transferred:               0.01 MB
Response time:                  6.61 secs
Transaction rate:               4.11 trans/sec
Throughput:                     0.00 MB/sec
Concurrency:                   27.15
Successful transactions:         131
Failed transactions:              29
Longest transaction:           58.07
Shortest transaction:           0.00
```

---
