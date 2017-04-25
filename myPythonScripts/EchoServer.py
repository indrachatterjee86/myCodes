#Python Echo Server Socket Programming
#4-Oct-2015 : Internal License

import socket
host = ""
port = 3333
s = socket.socket(socket.AF_INET
                  , socket.SOCK_STREAM)


s.bind((host, port))
s.listen(1)
conn, addr = s.accept()
print('Connected by', addr)
while True:
    data = conn.recv(1024)
    if not data: break
    conn.sendall(data)
conn.close()
