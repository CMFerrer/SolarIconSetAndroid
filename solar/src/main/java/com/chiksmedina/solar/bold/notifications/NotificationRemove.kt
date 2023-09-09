package com.chiksmedina.solar.bold.notifications

import androidx.compose.ui.graphics.Color
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
import com.chiksmedina.solar.bold.NotificationsGroup

public val NotificationsGroup.NotificationRemove: ImageVector
    get() {
        if (_notificationRemove != null) {
            return _notificationRemove!!
        }
        _notificationRemove = Builder(name = "NotificationRemove", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.5f, 11.0f)
                curveTo(15.3787f, 11.0f, 14.318f, 11.0f, 13.659f, 10.341f)
                curveTo(13.0f, 9.682f, 13.0f, 8.6213f, 13.0f, 6.5f)
                curveTo(13.0f, 4.3787f, 13.0f, 3.318f, 13.659f, 2.659f)
                curveTo(14.318f, 2.0f, 15.3787f, 2.0f, 17.5f, 2.0f)
                curveTo(19.6213f, 2.0f, 20.682f, 2.0f, 21.341f, 2.659f)
                curveTo(22.0f, 3.318f, 22.0f, 4.3787f, 22.0f, 6.5f)
                curveTo(22.0f, 8.6213f, 22.0f, 9.682f, 21.341f, 10.341f)
                curveTo(20.682f, 11.0f, 19.6213f, 11.0f, 17.5f, 11.0f)
                close()
                moveTo(14.9697f, 3.9697f)
                curveTo(15.2626f, 3.6768f, 15.7374f, 3.6768f, 16.0303f, 3.9697f)
                lineTo(17.5f, 5.4393f)
                lineTo(18.9697f, 3.9697f)
                curveTo(19.2626f, 3.6768f, 19.7374f, 3.6768f, 20.0303f, 3.9697f)
                curveTo(20.3232f, 4.2626f, 20.3232f, 4.7374f, 20.0303f, 5.0303f)
                lineTo(18.5607f, 6.5f)
                lineTo(20.0303f, 7.9697f)
                curveTo(20.3232f, 8.2626f, 20.3232f, 8.7374f, 20.0303f, 9.0303f)
                curveTo(19.7374f, 9.3232f, 19.2626f, 9.3232f, 18.9697f, 9.0303f)
                lineTo(17.5f, 7.5607f)
                lineTo(16.0303f, 9.0303f)
                curveTo(15.7374f, 9.3232f, 15.2626f, 9.3232f, 14.9697f, 9.0303f)
                curveTo(14.6768f, 8.7374f, 14.6768f, 8.2626f, 14.9697f, 7.9697f)
                lineTo(16.4393f, 6.5f)
                lineTo(14.9697f, 5.0303f)
                curveTo(14.6768f, 4.7374f, 14.6768f, 4.2626f, 14.9697f, 3.9697f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                lineTo(12.2578f, 2.0f)
                curveTo(11.8534f, 2.5665f, 11.6799f, 3.2054f, 11.5958f, 3.8313f)
                curveTo(11.4998f, 4.5448f, 11.4999f, 5.4264f, 11.5f, 6.4076f)
                verticalLineTo(6.5924f)
                curveTo(11.4999f, 7.5736f, 11.4998f, 8.4552f, 11.5958f, 9.1687f)
                curveTo(11.7005f, 9.9478f, 11.9437f, 10.747f, 12.5983f, 11.4017f)
                curveTo(13.253f, 12.0563f, 14.0522f, 12.2995f, 14.8313f, 12.4042f)
                curveTo(15.5448f, 12.5002f, 16.4264f, 12.5001f, 17.4076f, 12.5f)
                horizontalLineTo(17.5924f)
                curveTo(18.5736f, 12.5001f, 19.4552f, 12.5002f, 20.1687f, 12.4042f)
                curveTo(20.7946f, 12.3201f, 21.4335f, 12.1466f, 22.0f, 11.7422f)
                lineTo(22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _notificationRemove!!
    }

private var _notificationRemove: ImageVector? = null
