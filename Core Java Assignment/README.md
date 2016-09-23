# Assignment: Vacation Assignment Project
Build a client server application for online examination with timer, using java API, Features of application will be as follow:

# How will it work:
•	To run the project compile the Main.java file and execute Main class.

•	It will ask your name; give your name.

•	After that It will start show that you are connected with the server.

•	After that you will see a question. You will have to give answer, give proper answer from four given answer.

•	You can only input a or b or c or d in uppercase or lowercase. Any other answer will trigger an if-else condition and will not move to next part of program until you give the answer in proper format.

•	After answering the questions, you will see the total mark you got.

•	You will also see the correct answers.

•	After the correct answers, this program will end.

#What happens in Server.java class:
•	When a client connects to the server using ip and port; if the IP and port is correct server will accept the connection.

•	After that server will open the Questions.txt file and Answers.txt file

•	After that the server will send the client one after another question and also take answers from client as input.

•	While taking answers as input, server will match the answer with the Answers.txt file and determine the mark: 1 for each correct/matching answer from Answers.txt file.

•	After this the server will send the total mark and send the correct answers from Answers.txt file to client.

•	After this server class will end.

#What happens in Client.java class:
•	Client makes a connection with the server using socket by giving proper IP and port of the server.

•	After that server will start sending the questions which client will read one by one.

•	After each question client will have to give answer as input in a proper format strictly, which will be sent back to server.

•	After showing all the questions and taking answers, client will take the total marks and all the correct answers from server.

•	After this client class will end.
