Navodila za zagon, ostala navodila so vidna po zagonu odjemalca.
Nahajati, se je potrebno v mapi, v kateri so json-simple-1.1.1.jar, ChatServer.java, ChatClient.java ter certifikati

1)Ukazi v CMD-ju za zagon streznika

javac -cp "json-simple-1.1.1.jar" ChatServer.java
java -cp "json-simple-1.1.1.jar;." ChatServer


2)Ukazi v novem zavihku CMD-ja za zagon odjemalca

javac -cp "json-simple-1.1.1.jar" ChatClient.java

2.1)

java -cp "json-simple-1.1.1.jar;." ChatClient <uporabnisko_ime> //<uporabnisko_ime> zamenjajte z anze, stane oz. dezi

2.1) tocko ponavljajte, za vecje stevilo uporabnikov


Nacin generiranja kljucov prilozenih v ZIP:
Nahajati, se je potrebno v mapi ...\Java\jdk-<jdk_version>\bin v administratorskem nacinu //<jdk_version> zamenjajte z verzijio jdk

@echo off
rem Generate Stane's public/private key pair into private keystore
echo Generating Stane's public private key pair
keytool -genkey -alias staneprivate -keystore stane.private -storetype PKCS12 -keyalg rsa -dname "CN=stane" -storepass stanepwd -keypass stanepwd -validity 365

rem Generate Anze's public/private key pair into private keystore
echo Generating Anze's public private key pair
keytool -genkey -alias anzeprivate -keystore anze.private -storetype PKCS12 -keyalg rsa -dname "CN=anze" -storepass anzepwd -keypass anzepwd -validity 365

rem Generate Dezi's public/private key pair into private keystore
echo Generating Dezi's public private key pair
keytool -genkey -alias deziprivate -keystore dezi.private -storetype PKCS12 -keyalg rsa -dname "CN=dezi" -storepass dezipwd -keypass dezipwd -validity 365

rem Generate server public/private key pair
echo Generating server public private key pair
keytool -genkey -alias serverprivate -keystore server.private -storetype PKCS12 -keyalg rsa -dname "CN=localhost" -storepass serverpwd -keypass serverpwd -validity 365

rem Export client public key and import it into public keystore
echo Generating client public key file (Stane, Anze, Dezi)
keytool -export -alias staneprivate -keystore stane.private -file temp.key -storepass stanepwd
keytool -import -noprompt -alias stanepublic -keystore client.public -file temp.key -storepass public
del temp.key
keytool -export -alias anzeprivate -keystore anze.private -file temp.key -storepass anzepwd
keytool -import -noprompt -alias anzepublic -keystore client.public -file temp.key -storepass public
del temp.key
keytool -export -alias deziprivate -keystore dezi.private -file temp.key -storepass dezipwd
keytool -import -noprompt -alias dezipublic -keystore client.public -file temp.key -storepass public
del temp.key

rem Export server public key and import it into public keystore
echo Generating server public key file
keytool -export -alias serverprivate -keystore server.private -file temp.key -storepass serverpwd
keytool -import -noprompt -alias serverpublic -keystore server.public -file temp.key -storepass public
del temp.key
