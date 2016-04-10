import sys

if __name__ == "__main__":
    def plus_one(s):
        ss = s.strip()
        sp1 = str(1 + int(ss))
        print(
            "(+1) {} => {}".format(ss, sp1),
            file=sys.stderr
        )

        return sp1

    while True:
        x = input()
        if x:
            print(plus_one(x))
