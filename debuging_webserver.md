1. px -> fro running processes
2. px aux -> lists all running processes in the system
3. ps aux | grep nginx -> to find nginx web server
4. kill 424 -> kill running processes
5. netstat -tulnp -> netstat all running port
6. -tulnp -> show services listening to request on the system

$ Configuring Nginx

1. sudo vim /etc/nginx/sites-enabled/default
2. sudo nginx -t

# Netcat -> check for open ports
1. nc -zv www.google.com 80 -> check for open/closed ports