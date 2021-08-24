# Dillinger
## _CRUD Example of Spring Boot_

REST uses the HTTP protocol’s request types (POST, GET, PUT, and DELETE) to allow users to Create, Read, Update, and Delete (CRUD) via an API. This makes CRUD relate to REST tightly. 


## Installation
Clone the Repository from Github
```sh
git clone git@github.com:Masum-ipv/restapi.git
```
Run the project from IDE and Server will be run on
```sh
127.0.0.1:9000
```

# GET
```sh
# Request:
http://127.0.0.1:9000/destination
```
```sh
# Response
[
    {
        "city": "Mumbai",
        "description": "Mumbai is a densely populated city on India’s west coast.",
        "country": "India"
    },
    {
        "city": "Melbourne",
        "description": "Melbourne is the coastal capital of the southeastern Australian state of Victoria.",
        "country": "Australia"
    },
    {
        "city": "Washington DC",
        "description": "Washington, DC, the U.S. capital, is a compact city on the Potomac River, bordering the states of Maryland and Virginia.",
        "country": "USA"
    },
    {
        "city": "New Delhi",
        "description": "New Delhi is the capital of India and an administrative district of the National Capital Territory of Delhi.",
        "country": "India"
    },
    {
        "city": "Tokyo",
        "description": "Tokyo, Japan’s busy capital, mixes the ultramodern and the traditional, from neon-lit skyscrapers to historic temples.",
        "country": "Japan"
    }
]
```

# POST
```sh
# Request:
http://127.0.0.1:9000/destination
{
    "city": "Dhaka",
    "description": "Capital of Bangladesh.",
    "country": "Bangladesh"
}
```
```sh
# Response
{
    "city": "Dhaka",
    "description": "Capital of Bangladesh.",
    "country": "Bangladesh"
}
```
# PUT
```sh
# Request:
http://127.0.0.1:9000/destination/0
{
    "city": "New Delhi",
    "description": "New Delhi is a densely populated city on India’s west coast.",
    "country": "India"
}
```
```sh
# Response
{
    "city": "New Delhi",
    "description": "New Delhi is a densely populated city on India’s west coast.",
    "country": "India"
}
```
# DELETE
```sh
# Request:
http://127.0.0.1:9000/destination/0
```
```sh
# Response
{
    "city": "New Delhi",
    "description": "New Delhi is a densely populated city on India’s west coast.",
    "country": "India"
}
```
