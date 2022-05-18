# User Management

## user id

1. 0 -> root user
2. 1 - 999 -> system user
3. 1000 + -> normal user
4. /etc/passwd -> contains username, home directory
5. /etc/shadow -> contains password hashed
6. adduser -> add user 
7. grep foobar /etc/passwd -> search for user
8. useradd foo -> add user
9. passwd foo -> add password
10. usermod -aG sudo hulkkamedise -> adds user to sudo group
11. userdel -> to remove user


# Linux Permissions

## Permission Groups

1. Owenr -> o
2. Group -> g
3. others -> o

## Permission Types

1. read -> r
2. write -> w
3. execute -> x
4. chmod u+x text.txt -> add execute permission to file
5. chmod g+r text.txt -> add read permission to group
6. chmod a+w text.txt -> add write permission to all files
7. chmod a-x text.txt -> remove execute permission from all groups

# Octal Permissions
 
1. r -> 4
2. w -> 2
3. x -> 1

# Permissions

1. chmod 777 hello.txt -> give all permissions to the various groups
2. chmode 000 hello.txt -> remove all permissions from the various groups
3. stat -c '%a' hello.txt -> to see octal permissions
4. chown user:group filename.txt -> to change owership