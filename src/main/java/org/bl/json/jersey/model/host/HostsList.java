package org.bl.json.jersey.model.host;

import org.bl.json.jersey.model.components.Host;

import java.util.LinkedList;

/**
 * Created by blupashko on 17.04.2015.
 */
public class HostsList {
    private LinkedList<Host> hosts;

    public LinkedList<Host> getHosts() {
        return hosts;
    }

    public void setHosts(LinkedList<Host> hosts) {
        this.hosts = hosts;
    }
}
