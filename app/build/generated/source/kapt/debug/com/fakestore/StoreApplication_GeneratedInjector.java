package com.fakestore;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = StoreApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface StoreApplication_GeneratedInjector {
  void injectStoreApplication(StoreApplication storeApplication);
}
