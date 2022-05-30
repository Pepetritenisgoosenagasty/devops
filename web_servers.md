# Package Management

## dpkg

1. sudo dpkg -i package name -> To install a package
2. sudo dpkg -l -> list installed packages
3. sudo dpkg -l | grep -w sl -> search for sl package
4. sudo dpkg -r package name -> to remove a package

# APT

1. apt-get install -> install a package
2. apt-get remove -> remove a package
3. apt-get purge -> delete a package with config files

# systemctl

1. sudo systemctl --type=service --state=running -> show all running services
2. sudo systemctl start <service> -> start a service
3. sudo systemctl stop <service> -> stop a service
4. sudo systemctl enable <service> -> enable a service
5. sudo systemctl disable <service> -> disable a service
6. sudo systemctl status <service> -> status of a service

# Web Server

## Nginx

1. sudo systemctl start nginx
2. sudo systemctl status nginx
3. sudo systemctl stop nginx
4. sudo /usr/sbin/nginx -g 'daemon off;' -> runs nginx on the background
5. 