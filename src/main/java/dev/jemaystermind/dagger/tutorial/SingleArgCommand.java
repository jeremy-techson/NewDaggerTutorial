package dev.jemaystermind.dagger.tutorial;

import java.util.List;

abstract class SingleArgCommand implements Command {

  @Override public Result handleInput(List<String> input) {
    return input.size() == 1 ? handleArg(input.get(0)) : Result.invalid();
  }

  protected abstract Result handleArg(String arg);
}
