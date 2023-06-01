# Java RMI

## Run in the `Server` folder
```

javac *.java

rmic GumballMachine

start rmiregistry

start java TestGumballMachineRemote t1 101
start java TestGumballMachineRemote t2 202

copy *State.class ..\Client
copy GumballMachine*.class ..\Client

```

## Run in the `Client` folder
```

javac *.java

java TestGumballMonitor

```