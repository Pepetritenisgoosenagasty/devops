# Linux Commands

## Navigating the system

1. pwd - print working directory
2. cd - change directory
3. cd ~ - to home directory
4. cd - - back to previous directory
5. ls - list contents of current directory
6. ls -l - list more contents of current directory
7. ls -la - list all contents of current directory including hidden directories
8. ls -lh - displays file size in a human readable format
9. ls -lht - sorts files by timestamp
10. ls -lhtr - displays older files first
11. pushd - allows to manipulate the directory stack
12. dirs - show all directory pushd
13. popd - brings you back to your previous directory

## Reading Content of a file

1. cat - open small files
2. less - read files
3. head - read files
4. tail -n1 - prints the first line
5. touch - creates new file
6. mkdir - creates new directory
7. mkdir -p f1/f3/f4 - creates multiple directories
8. man - displays manual of a command
9. cp - copies files

## Redirection

1. command > file.txt - overwrites
2. command >> file.txt - appends
3. echo "Hola" > file.txt - writes content to a file and overwrites it
4. echo "Hola" >> file.txt - Appends content

## File Descriptions

1. 0 - standard Input
2. 1 - standard Output
3. 2 - standard Error
4. 3 - standard Success

### Commands

1. proc/123/fd - process / file / files description
2. pipe | - chains commands eg: cat f1.txt | grep foo
3. grep - searches files eg grep foo cat.txt or cat cat.txt | grep foo

## File System Hierarchy

1. / - root directory
2. /bin - user binaries
3. /boot - kernel
4. /dev - devices
5. /etc - contains configuration files eg: ls -l /etc/`<service name>`/something_config
6. /home - home directory
7. /mnt - mounted devices
8. /opt - contains custom installation(Softwares)
9. /sbin - contains root user`s binaries
10. /usr - contains user utilities
11. /tmp - contains temporary files
12. /proc - contains process information
13. /lib - contains shared libraries

# Switches to another user

1. su - root
