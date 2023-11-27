# feedback-persistence Project

## Test the application in local dev environment

```
curl http://localhost:8888/debug
```

```
curl -X POST -i \
-H 'Content-Type: application/json' \
-d "{\"rating\":\"3\"}" \
http://localhost:8888/feedback
```
