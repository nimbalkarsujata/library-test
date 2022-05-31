package com.mylibrary


class ProviderImpl : ProviderInterface {
    override fun getData(): String {
        return DataProvider().provideString()
    }
}