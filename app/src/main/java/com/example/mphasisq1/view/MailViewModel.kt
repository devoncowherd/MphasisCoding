package com.example.mphasisq1.view

import androidx.lifecycle.ViewModel

class MailViewModel : ViewModel() {

    var spamDeletionChecked = false
    var autoSyncChecked = false
    var autoCacheClearChecked = false

    suspend fun getAllEmails(){

    }
}