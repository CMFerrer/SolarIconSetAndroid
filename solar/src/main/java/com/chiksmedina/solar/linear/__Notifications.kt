package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
import com.chiksmedina.solar.linear.notifications.Bell
import com.chiksmedina.solar.linear.notifications.BellBing
import com.chiksmedina.solar.linear.notifications.BellOff
import com.chiksmedina.solar.linear.notifications.NotificationLinesRemove
import com.chiksmedina.solar.linear.notifications.NotificationRemove
import com.chiksmedina.solar.linear.notifications.NotificationUnread
import com.chiksmedina.solar.linear.notifications.NotificationUnreadLines
import kotlin.collections.List as ____KtList

public object NotificationsGroup

public val LinearGroup.Notifications: NotificationsGroup
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
