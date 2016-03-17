package com.gsww.java.observer;
/**
 * 抽象的主题角色
 * @author shaol
 *
 */
public interface Watched {

	public void addWatcher(Watcher watcher);

	public void removeWatcher(Watcher watcher);

	public void notifyWatchers(String str);

}
