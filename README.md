# CameraShopRestAPIDemo
Demo project for Camera shop CRUD REST API
Below are the list of available API
# Project Setup & Detail
Frame work: Spring boot

Java version: 17

DB: MySQL server

see DB setup at dbSQL/camerashop_init_DB.txt

default port is 8080
(port can be changed by update server.port at applicaiton.properties)

# API information

# Get /cameraItem
Retrieve all camera item from database
ex. http://localhost:8080/api/cameraItem

# Get /cameraItem/{item id}
Retrieve specific camera item from database
ex. http://localhost:8080/api/cameraItem/1

# put /cameraItem
update camera item info to database
ex. http://localhost:8080/api/cameraItem
{
    "id" : 6,
    "itemName" : "CanonB02",
    "owner" : "Kublanov",
    "contact" : "natalia@test.com"
}

# Post /cameraItem
Add new camera item to database
Id is auto generate
ex. http://localhost:8080/api/cameraItem
Json Body :
{
    "itemName" : "CanonB01",
    "owner" : "Kublanov",
    "contact" : "natalia@test.com"
}
