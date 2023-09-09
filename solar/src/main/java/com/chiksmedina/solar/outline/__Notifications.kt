package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
import com.chiksmedina.solar.outline.notifications.Bell
import com.chiksmedina.solar.outline.notifications.BellBing
import com.chiksmedina.solar.outline.notifications.BellOff
import com.chiksmedina.solar.outline.notifications.NotificationLinesRemove
import com.chiksmedina.solar.outline.notifications.NotificationRemove
import com.chiksmedina.solar.outline.notifications.NotificationUnread
import com.chiksmedina.solar.outline.notifications.NotificationUnreadLines
import kotlin.collections.List as ____KtList

public object NotificationsGroup

public val OutlineGroup.Notifications: NotificationsGroup
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
