package com.bangsapabbi.helloworld;
import static spark.Spark.*;

public class Joker {
    public static void main(String[] args) {
    	World world = new World();
	get("/random", (req, res) -> world.greet());
    	//System.out.println(world.greet());
    }
}
