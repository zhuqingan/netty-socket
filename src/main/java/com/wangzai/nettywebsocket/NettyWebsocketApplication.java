package com.wangzai.nettywebsocket;

import com.wangzai.nettywebsocket.Server.NettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NettyWebsocketApplication {





	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(NettyWebsocketApplication.class, args);
		NettyServer nettyServer = context.getBean(NettyServer.class);
		nettyServer.start();

	}


}
