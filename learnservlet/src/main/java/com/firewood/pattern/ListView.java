package com.firewood.pattern;

public class ListView extends Command{
    @Override
    public void execute() { forward("/list.jsp"); }
}
