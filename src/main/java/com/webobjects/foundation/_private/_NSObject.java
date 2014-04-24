package com.webobjects.foundation._private;

import com.webobjects.foundation.NSKeyValueObserving;
import com.webobjects.foundation.NSObservable;
import com.webobjects.foundation.NSObserver;
import com.webobjects.foundation.NSSelector;
import com.webobjects.foundation.kvc.NSKeyValueCoding;
import com.webobjects.foundation.kvc.NSKeyValueCodingAdditions;

import java.io.Serializable;

public interface _NSObject extends NSKeyValueCoding, NSKeyValueCodingAdditions, NSKeyValueObserving, NSObservable, NSObserver, Cloneable, Serializable {
  public boolean respondsToSelector(NSSelector<?> selector);
}
