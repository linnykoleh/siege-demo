## Build

- Run `docker build -t tig-java-app:latest .` to build the docker image for the java app.

--- 

## Urls

- grafana url: http://localhost:3000
- nginx url: http://localhost:8080/nginx_status

---

## Bencharking Java application with Apache Benchmark

- Run `ab -c 10 -n 500 -r http://localhost:8082/create` to benchmark the java app.

### Before benchmarking

![12.jpg](images/12.jpg)

### After benchmarking

![13.jpg](images/13.jpg)

```bash
ab -c 10 -n 500 -r http://localhost:8082/create

This is ApacheBench, Version 2.3 <$Revision: 1903618 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 100 requests
Completed 200 requests
Completed 300 requests
Completed 400 requests
Completed 500 requests
Finished 500 requests


Server Software:        
Server Hostname:        localhost
Server Port:            8082

Document Path:          /create
Document Length:        13 bytes

Concurrency Level:      10
Time taken for tests:   52.369 seconds
Complete requests:      500
Failed requests:        406
   (Connect: 0, Receive: 0, Length: 406, Exceptions: 0)
Non-2xx responses:      400
Total transferred:      99393 bytes
HTML transferred:       44093 bytes
Requests per second:    9.55 [#/sec] (mean)
Time per request:       1047.389 [ms] (mean)
Time per request:       104.739 [ms] (mean, across all concurrent requests)
Transfer rate:          1.85 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    0   0.2      0       3
Processing:   205 1019 1654.2    377   12765
Waiting:      205 1018 1654.3    376   12764
Total:        205 1019 1654.3    377   12765

Percentage of the requests served within a certain time (ms)
  50%    377
  66%    726
  75%   1227
  80%   1285
  90%   2065
  95%   5036
  98%   7228
  99%   9947
 100%  12765 (longest request)

```

## Results

### Java app metrics

![1.png](images/1.png)
![2.png](images/2.png)
![3.png](images/3.png)

### Telegraf metrics

![4.png](images/4.png)
![5.png](images/5.png)
![6.png](images/6.png)
![7.png](images/7.png)
![8.png](images/8.png)
![9.png](images/9.png)
![10.png](images/10.png)
![11.png](images/11.png)