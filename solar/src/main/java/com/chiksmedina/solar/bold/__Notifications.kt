package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.notifications.Bell
import com.chiksmedina.solar.bold.notifications.BellBing
import com.chiksmedina.solar.bold.notifications.BellOff
import com.chiksmedina.solar.bold.notifications.NotificationLinesRemove
import com.chiksmedina.solar.bold.notifications.NotificationRemove
import com.chiksmedina.solar.bold.notifications.NotificationUnread
import com.chiksmedina.solar.bold.notifications.NotificationUnreadLines
import kotlin.collections.List as ____KtList

public object NotificationsGroup

public val BoldGroup.Notifications: NotificationsGroup
  get() = NotificationsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NotificationsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Bell, BellBing, BellOff, NotificationLinesRemove, NotificationRemove,
        NotificationUnread, NotificationUnreadLines)
    return __AllIcons!!
  }
