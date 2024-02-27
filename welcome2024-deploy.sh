#!/bin/bash
DATE=$(date +"%Y-%m-%d-%H-%M")
BRANCH_NAME="main"
REPO_NAME="welcome"

echo "Build the code.."
mvn clean install || { echo "Error: Maven Build failed."; exit 1; }
cd target
JAR_FILE="${REPO_NAME}"-*.*.*.jar

PID="$(ps aux | grep "[j]ava.*-Dspring.profiles.active=$PROFILE" | awk '{print $2}')"

if [ -n "$PID" ]; then
    echo "Killing Process ID: $PID"
    kill -9 "$PID" || { echo "Failed to kill"; }
else 
    echo "No Process ID found !!"
fi

PROFILE=test
PROFILE_DIR=test_dir
LOG_FILE="${PROFILE_DIR}_${DATE}.log"
#nohup java -jar "$JAR_FILE" -Dspring.profiles.active=="$PROFILE" > "$LOG_FILE" 2>&1 &
nohup java -jar "$JAR_FILE" > "$LOG_FILE" 2>&1 &

if [ $? -eq 0 ]; then
        echo "Successfully deployed and running.."
        echo "Logs saved to: $LOG_FILE"
else 
    echo "Error: nohup Failed to run $JAR_FILE"
fi
