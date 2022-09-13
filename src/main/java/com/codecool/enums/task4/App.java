package com.codecool.enums.task4;

enum State {
    Start {
        @Override
        public State next(char ch) {
            if (ch == 'a') return A;
            return Trap;
        }
    },
    A {
        @Override
        public State next(char ch) {
            if(ch == 'a') return A2;
            return Trap;
        }
    },
    A2 {
        @Override
        public State next(char ch) {
            if(ch == 'a') return A3;
            return Trap;
        }
    },
    A3 {
        @Override
        public State next(char ch) {
            return switch (ch) {
                case 'a' -> A;
                case 'b' -> B;
                default -> Trap;
            };
        }
    },
    B {
        @Override
        public State next(char ch) {
            if(ch == 'b') return Start;
            else return Trap;
        }
    },
    Trap {
        @Override
        State next(char ch) {
            return Trap;
        }
    };

    abstract State next(char ch);
    }

public class App {
    public static void main(String[] args) {
        StateMachine m = new StateMachine();
        boolean accepted = m.read("aaab");
        if (accepted) {
            System.out.println("Accepted input");
        } else {
            System.out.println("Input rejected");
        }
    }
}

class StateMachine {
    State state = State.Start;
    public boolean read(String input) {
        for (char ch : input.toCharArray()) {
            state = state.next(ch);
        }
        return state == State.B;
    }
}
