@echo off

rem Generate Rdeca Kapica's public/private key pair into private keystore
echo Generating Rdeca Kapica's public private key pair
keytool -genkey -alias rkprivate -keystore rk.private -storetype PKCS12 -keyalg rsa -dname "CN=Rdeca Kapica" -storepass rkpwd1 -keypass rkpwd1 -validity 365

rem Generate Babica's public/private key pair into private keystore
echo Generating Babica's public private key pair
keytool -genkey -alias babicaprivate -keystore babica.private -storetype PKCS12 -keyalg rsa -dname "CN=Babica" -storepass babicapwd -keypass babicapwd -validity 365

rem Generate server public/private key pair
echo Generating server public private key pair
keytool -genkey -alias serverprivate -keystore server.private -storetype PKCS12 -keyalg rsa -dname "CN=localhost" -storepass serverpwd -keypass serverpwd -validity 365

rem Export client public key and import it into public keystore
echo Generating client public key file (Rdeca Kapica, Babica)
keytool -export -alias rkprivate -keystore rk.private -file temp.key -storepass rkpwd1
keytool -import -noprompt -alias rkpublic -keystore client.public -file temp.key -storepass public
del temp.key
keytool -export -alias babicaprivate -keystore babica.private -file temp.key -storepass babicapwd
keytool -import -noprompt -alias babicapublic -keystore client.public -file temp.key -storepass public
del temp.key


rem Export server public key and import it into public keystore
echo Generating server public key file
keytool -export -alias serverprivate -keystore server.private -file temp.key -storepass serverpwd
keytool -import -noprompt -alias serverpublic -keystore server.public -file temp.key -storepass public
del temp.key
