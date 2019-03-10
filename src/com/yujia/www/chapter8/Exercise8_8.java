package com.yujia.www.chapter8;

class Connection {
  private int id;
  private Connection(int id) {
    this.id = id;
  };
  static Connection makeConnection(int id) {
    return new Connection(id);
  }
  public String toString() {
    return "Connection" + id;
  }
}

class ConnectionManager {
  static int connectionsCount = 3;
  static Connection[] connections = new Connection[connectionsCount];
  static {
    System.out.println(connectionsCount);
    for(int i = 0; i < connectionsCount; i++)
      connections[i] = Connection.makeConnection(i);
  }
  static Connection getConnection() {
    if (connectionsCount <= 0)
      return null;
    connectionsCount--;
    return connections[connectionsCount];
  }
}

public class Exercise8_8 {
  public static void main(String[] args) {
    System.out.println(ConnectionManager.getConnection());
    System.out.println(ConnectionManager.getConnection());
    System.out.println(ConnectionManager.getConnection());
    System.out.println(ConnectionManager.getConnection());
  }
}
