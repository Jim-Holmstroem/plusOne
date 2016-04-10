from encodings import utf_8
import socketserver


class Handler(socketserver.StreamRequestHandler):
    def handle(self):
        def plus_one(s):
            sp1, _ = utf_8.encode(
                "{}\n".format(
                    1 + int(s)
                )
            )
            print("(+1) {} => {}".format(s, sp1))

            return sp1

        self.wfile.write(
            plus_one(
                self.rfile.readline()
            )
        )


if __name__ == "__main__":
    server = socketserver.TCPServer(("0.0.0.0", 5000), Handler)
    server.serve_forever()
