OUT:=out 

JAVAC  := javac
SOURCE := CHCheesePizza.java \
	CHGreekPizza.java \
	NYStyleCheesePizza.java \
	NYStyleGreekPizza.java \
	NYStyleVeggiePizza.java \
	Pizza.java \
	PizzaTest.java \
	CHVeggiePizza.java \
	CHClamPizza.java \
	NYPizzaStore.java \
	NYStyleClamPizza.java \
	NYStylePepperoniPizza.java \
	CHPepperoniPizza.java \
	PizzaStore.java \
	SimplePizzaFactory.java

FLAG:=-Xlint:unchecked
FLAG+=-d $(OUT)

all: $(SOURCE)
	$(JAVAC) $(FLAG) PizzaTest.java
