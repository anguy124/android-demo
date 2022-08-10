package com.IanFlanagan.apps.tipcalculatorapp;


import com.rollbar.notifier.config.Config;
import com.rollbar.notifier.config.ConfigBuilder;
import com.rollbar.notifier.config.ConfigProvider;

import com.rollbar.api.payload.data.Server;
import com.rollbar.notifier.provider.Provider;

import java.util.HashMap;
import java.util.Map;


public class IanProvider implements ConfigProvider {

    @Override
    public Config provide(ConfigBuilder builder) {
        return builder.server(new ServerProvider()).build();
    }
}

class ServerProvider implements Provider<Server> {

    @Override
    public Server provide() {
        return new Server.Builder()
                //   .codeVersion(MyConfiguration.myCodeVersion)
                .branch("master")
                .host("localhost")
                .root("com.IanFlanagan")
                .build();
    }
}