package com.yujia.www.chapter13;

import java.util.LinkedList;
import java.util.Queue;

class Command {
    private String command;

    public void operation() {
        System.out.println(command);
    }

    Command(String c) {
        this.command = c;
    }
}

class CommandQueue {
    static Queue<Command> generateCommandQueue() {
        Queue<Command> commands = new LinkedList<>();
        commands.offer(new Command("stand up"));
        commands.offer(new Command("sit down"));
        commands.offer(new Command("run"));
        return commands;
    }

}

public class Exercise13_27 {
    static void consumes(Queue<Command> commands) {
        while (!commands.isEmpty()) {
            Command front = commands.poll();
            front.operation();
        }
    }

    public static void main(final String[] args) {
        Queue<Command> commands = CommandQueue.generateCommandQueue();
        consumes(commands);
    }
}
