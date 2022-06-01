#!/bin/bash
# echo Hello $1. Today is $2.
foo(){
if [[ "zabcd" == *"abc"* ]];then
return 0
else
return 1
fi
}
foo
#!/bin/bash

STR='GNU/Linux is an operating system'
SUB='Linux'
if [[ "$STR" == *"$SUB"* ]]; then
  echo "It's there."
fi
