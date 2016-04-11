# plusOne
(+ 1)


# format
```bash
<integer>\n
```

## example
```bash
printf "34\n" | nc -n -i 1 127.0.0.1 5000
```

# running example
```bash
netcat -l 5000 | docker run -i plusone:nodejs
```
