#! /bin/sh

if [ -n "$1"]; then
    java -jar $1
else
    echo "未指定可执行文件名称！"
fi