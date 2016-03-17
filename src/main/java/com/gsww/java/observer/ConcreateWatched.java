package com.gsww.java.observer;

import java.util.ArrayList;
import java.util.List;
/**
 * ����������ɫ
 * @author shaol
 *
 */
public class ConcreateWatched implements Watched {

	private List<Watcher> watchers = new ArrayList<Watcher>();

	@Override
	public void addWatcher(Watcher watcher) {
		watchers.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		watchers.remove(watcher);
	}

	@Override
	public void notifyWatchers(String str) {
		for (Watcher watcher : watchers) {
			watcher.upate(str);
		}
	}

}
