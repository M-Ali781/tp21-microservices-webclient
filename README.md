# TP 21 : Architecture Micro-services avec WebClient

---

## 1. Compilation Maven globale du projet multi-modules (mvn clean compile)

![1. Compilation Maven globale du projet multi-modules (mvn clean compile)](screenshots/01_maven_clean_compile.png)

---

## 2. Démarrage du serveur de découverte Eureka (Port 8761)

![2. Démarrage du serveur de découverte Eureka (Port 8761)](screenshots/02_eureka_server_startup.png)

---

## 3. Démarrage du microservice SERVICE-CLIENT (Port 8081)

![3. Démarrage du microservice SERVICE-CLIENT (Port 8081)](screenshots/03_service_client_startup.png)

---

## 4. Test direct de l'API Clients (GET http://localhost:8081/api/clients)

![4. Test direct de l'API Clients (GET http://localhost:8081/api/clients)](screenshots/04_test_client_api_all.png)

---

## 5. Consultation d'un client par identifiant (GET http://localhost:8081/api/clients/1)

![5. Consultation d'un client par identifiant (GET http://localhost:8081/api/clients/1)](screenshots/05_test_client_api_single.png)

---

## 6. Démarrage du microservice SERVICE-CAR avec WebClient @LoadBalanced (Port 8082)

![6. Démarrage du microservice SERVICE-CAR avec WebClient @LoadBalanced (Port 8082)](screenshots/06_service_car_webclient_startup.png)

---

## 7. Récupération des voitures avec agrégation client réactive via WebClient (GET http://localhost:8082/api/cars)

![7. Récupération des voitures avec agrégation client réactive via WebClient (GET http://localhost:8082/api/cars)](screenshots/07_test_cars_webclient_all.png)

---

## 8. Détail d'une voiture avec client associé via WebClient (GET http://localhost:8082/api/cars/1)

![8. Détail d'une voiture avec client associé via WebClient (GET http://localhost:8082/api/cars/1)](screenshots/08_test_cars_webclient_single.png)

---

## 9. Création d'un nouveau client via requête HTTP POST (POST http://localhost:8081/api/clients)

![9. Création d'un nouveau client via requête HTTP POST (POST http://localhost:8081/api/clients)](screenshots/09_test_client_post_creation.png)

---

## 10. Vue d'ensemble du registre Eureka avec les services enregistrés (GET http://localhost:8761/eureka/apps)

![10. Vue d'ensemble du registre Eureka avec les services enregistrés (GET http://localhost:8761/eureka/apps)](screenshots/10_eureka_registry_overview.png)
