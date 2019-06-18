OUT:=out 

JAVAC  := javac
SOURCE := Command.java 	\
	EmptyCommand.java	\
	Light.java	\
	LightOffCommand.java	\
	LightOnCommand.java	\
	RemoteControl.java	\
	RemoteControlTest.java	\
	SimpleRemoteControl.java	\
	Stereo.java	\
	StereoOffCommand.java	\
	StereoOffWithCDCommand.java	\
	StereoOnWithCDCommand.java	

FLAG:=-Xlint:unchecked
FLAG+=-d $(OUT)

all: $(SOURCE)
	$(JAVAC) $(FLAG) RemoteControlTest.java  

clean:
	rm -rf out
