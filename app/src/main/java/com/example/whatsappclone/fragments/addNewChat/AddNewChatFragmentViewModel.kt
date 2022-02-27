package com.example.whatsappclone.fragments.addNewChat

import androidx.lifecycle.ViewModel
import com.example.whatsappclone.data.mock.MockData

private const val TAG = "ChatFragmentViewModel"

class AddNewChatFragmentViewModel() : ViewModel() {
    val allContacts = MockData.getContacts()
}
