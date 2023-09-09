package com.chiksmedina.solar.outline.notifications

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.NotificationsGroup

public val NotificationsGroup.NotificationUnreadLines: ImageVector
    get() {
        if (_notificationUnreadLines != null) {
            return _notificationUnreadLines!!
        }
        _notificationUnreadLines = Builder(name = "NotificationUnreadLines", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9426f, 1.25f)
                curveTo(9.6342f, 1.25f, 7.8252f, 1.25f, 6.4137f, 1.4397f)
                curveTo(4.969f, 1.634f, 3.8289f, 2.0393f, 2.9341f, 2.9341f)
                curveTo(2.0393f, 3.8289f, 1.634f, 4.969f, 1.4397f, 6.4137f)
                curveTo(1.25f, 7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(1.25f, 14.3658f, 1.25f, 16.1748f, 1.4397f, 17.5863f)
                curveTo(1.634f, 19.031f, 2.0393f, 20.1711f, 2.9341f, 21.0659f)
                curveTo(3.8289f, 21.9607f, 4.969f, 22.366f, 6.4137f, 22.5603f)
                curveTo(7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f, 22.75f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 22.75f, 16.1748f, 22.75f, 17.5863f, 22.5603f)
                curveTo(19.031f, 22.366f, 20.1711f, 21.9607f, 21.0659f, 21.0659f)
                curveTo(21.9607f, 20.1711f, 22.366f, 19.031f, 22.5603f, 17.5863f)
                curveTo(22.75f, 16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f)
                verticalLineTo(10.5f)
                curveTo(22.75f, 10.0858f, 22.4142f, 9.75f, 22.0f, 9.75f)
                curveTo(21.5858f, 9.75f, 21.25f, 10.0858f, 21.25f, 10.5f)
                verticalLineTo(12.0f)
                curveTo(21.25f, 14.3782f, 21.2484f, 16.0864f, 21.0736f, 17.3864f)
                curveTo(20.9018f, 18.6648f, 20.5749f, 19.4355f, 20.0052f, 20.0052f)
                curveTo(19.4355f, 20.5749f, 18.6648f, 20.9018f, 17.3864f, 21.0736f)
                curveTo(16.0864f, 21.2484f, 14.3782f, 21.25f, 12.0f, 21.25f)
                curveTo(9.6218f, 21.25f, 7.9136f, 21.2484f, 6.6136f, 21.0736f)
                curveTo(5.3352f, 20.9018f, 4.5644f, 20.5749f, 3.9948f, 20.0052f)
                curveTo(3.4251f, 19.4355f, 3.0982f, 18.6648f, 2.9264f, 17.3864f)
                curveTo(2.7516f, 16.0864f, 2.75f, 14.3782f, 2.75f, 12.0f)
                curveTo(2.75f, 9.6218f, 2.7516f, 7.9136f, 2.9264f, 6.6136f)
                curveTo(3.0982f, 5.3352f, 3.4251f, 4.5644f, 3.9948f, 3.9948f)
                curveTo(4.5644f, 3.4251f, 5.3352f, 3.0982f, 6.6136f, 2.9264f)
                curveTo(7.9136f, 2.7516f, 9.6218f, 2.75f, 12.0f, 2.75f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 2.75f, 14.25f, 2.4142f, 14.25f, 2.0f)
                curveTo(14.25f, 1.5858f, 13.9142f, 1.25f, 13.5f, 1.25f)
                horizontalLineTo(11.9426f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 1.25f)
                curveTo(16.9289f, 1.25f, 15.25f, 2.9289f, 15.25f, 5.0f)
                curveTo(15.25f, 7.0711f, 16.9289f, 8.75f, 19.0f, 8.75f)
                curveTo(21.0711f, 8.75f, 22.75f, 7.0711f, 22.75f, 5.0f)
                curveTo(22.75f, 2.9289f, 21.0711f, 1.25f, 19.0f, 1.25f)
                close()
                moveTo(16.75f, 5.0f)
                curveTo(16.75f, 3.7574f, 17.7574f, 2.75f, 19.0f, 2.75f)
                curveTo(20.2426f, 2.75f, 21.25f, 3.7574f, 21.25f, 5.0f)
                curveTo(21.25f, 6.2426f, 20.2426f, 7.25f, 19.0f, 7.25f)
                curveTo(17.7574f, 7.25f, 16.75f, 6.2426f, 16.75f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 14.0f)
                curveTo(6.25f, 13.5858f, 6.5858f, 13.25f, 7.0f, 13.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 13.25f, 16.75f, 13.5858f, 16.75f, 14.0f)
                curveTo(16.75f, 14.4142f, 16.4142f, 14.75f, 16.0f, 14.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 14.75f, 6.25f, 14.4142f, 6.25f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 16.75f)
                curveTo(6.5858f, 16.75f, 6.25f, 17.0858f, 6.25f, 17.5f)
                curveTo(6.25f, 17.9142f, 6.5858f, 18.25f, 7.0f, 18.25f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 18.25f, 13.75f, 17.9142f, 13.75f, 17.5f)
                curveTo(13.75f, 17.0858f, 13.4142f, 16.75f, 13.0f, 16.75f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _notificationUnreadLines!!
    }

private var _notificationUnreadLines: ImageVector? = null
