# SpringRestAPI
Implementation of Restful web service APIs with Spring Boot


Topics

POST		/topics					create new topic
Request Body format:
{
        "id": "javascript",
        "name": "Javascript",
        "description": "Javascript Description"
	
}

GET  		/topics					Gets all topics

GET			/topics/id			Gets the topic

PUT			/topics/id			Updates the topic
/topics/javascript

Request Body format:
{
        "id": "javascript",
        "name": "Updated Javascript",
        "description": "Updated Javascript Description"
	
}

DELETE		/topics/id				Deletes the topic
