# Microservices Practice

### Ports

    Cloud Config Server         : 8888
    Limits Server               : 8080,...
    Currency Exchange Server    : 8000,...
    Currency Converison Server  : 8100,...
    Eureka Naming Server        : 8761
    API Gateway                 : 8765
    Zipkin                      : 9411

### Notes

1. While setting active profile in limit-service use `--spring.profiles.active=dev` in the terminal. The value in bootstrap.properties does not work for some reason.
