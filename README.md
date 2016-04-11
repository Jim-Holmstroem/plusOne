# plusOne
(+ 1)


# format
```bash
<integer>\n
```

## example
```bash
printf "34\n234\n" | docker run -i plusone:nodejs
```

# running example
```bash
netcat -l 5000 | docker run -i plusone:nodejs
```
