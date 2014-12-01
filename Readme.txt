Slowloris
----------

Usage:-
-------
javac Slowloris.java && java Slowloris 'adrs' 'cons'

Where adrs is the ip of the server and cons is the no of connections to be made to the server.

In the code "atck()" is the main function and performs the attack b generating random string for headers. It repeatedly make http connections to the server thereby utilizing all the threads in the server and thus rendering the server unable to cater to the legitimate requests.

Code was inspired from the perl code written by RSnake who identified this issue.