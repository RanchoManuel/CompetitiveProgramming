clear
javac Main.java
java Main < in.txt
echo "-------\nRta: $?\n-------"

g++ -o MainCpp Main.cpp -lm
./MainCpp < in.txt
echo "-------\nRta: $?\n-------"

gcc -o MainC Main.c -lm
./MainC < in.txt
echo "-------\nRta: $?\n-------"
