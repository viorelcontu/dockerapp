#!/bin/sh

for i in "$@"
do
  case $i in
    -s|--disable-security)
      echo "Running rclient with security disabled"
      props="-Dspring.profiles.active=no-security"
      shift
    ;;
    default)
      props=""
      shift
    ;;

    *)printf "illegal option: $i\n"
      exit 1
    ;;
  esac
done

java -jar $props /opt/rclient.jar