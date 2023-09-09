package com.chiksmedina.solar.bold.homefurniture

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
import com.chiksmedina.solar.bold.HomeFurnitureGroup

public val HomeFurnitureGroup.RemoteController: ImageVector
    get() {
        if (_remoteController != null) {
            return _remoteController!!
        }
        _remoteController = Builder(name = "RemoteController", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.75f, 15.5f)
                curveTo(9.75f, 14.2574f, 10.7574f, 13.25f, 12.0f, 13.25f)
                curveTo(13.2426f, 13.25f, 14.25f, 14.2574f, 14.25f, 15.5f)
                curveTo(14.25f, 16.7426f, 13.2426f, 17.75f, 12.0f, 17.75f)
                curveTo(10.7574f, 17.75f, 9.75f, 16.7426f, 9.75f, 15.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.6741f, 3.7777f)
                curveTo(5.0f, 4.7866f, 5.0f, 6.1911f, 5.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(5.0f, 17.8089f, 5.0f, 19.2134f, 5.6741f, 20.2223f)
                curveTo(5.966f, 20.659f, 6.341f, 21.034f, 6.7777f, 21.3259f)
                curveTo(7.7866f, 22.0f, 9.1911f, 22.0f, 12.0f, 22.0f)
                curveTo(14.8089f, 22.0f, 16.2134f, 22.0f, 17.2223f, 21.3259f)
                curveTo(17.659f, 21.034f, 18.034f, 20.659f, 18.3259f, 20.2223f)
                curveTo(19.0f, 19.2134f, 19.0f, 17.8089f, 19.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(19.0f, 6.1911f, 19.0f, 4.7866f, 18.3259f, 3.7777f)
                curveTo(18.034f, 3.341f, 17.659f, 2.966f, 17.2223f, 2.6741f)
                curveTo(16.2134f, 2.0f, 14.8089f, 2.0f, 12.0f, 2.0f)
                curveTo(9.1911f, 2.0f, 7.7866f, 2.0f, 6.7777f, 2.6741f)
                curveTo(6.341f, 2.966f, 5.966f, 3.341f, 5.6741f, 3.7777f)
                close()
                moveTo(12.0f, 11.75f)
                curveTo(9.9289f, 11.75f, 8.25f, 13.4289f, 8.25f, 15.5f)
                curveTo(8.25f, 17.5711f, 9.9289f, 19.25f, 12.0f, 19.25f)
                curveTo(14.0711f, 19.25f, 15.75f, 17.5711f, 15.75f, 15.5f)
                curveTo(15.75f, 13.4289f, 14.0711f, 11.75f, 12.0f, 11.75f)
                close()
                moveTo(8.25f, 5.5f)
                curveTo(8.25f, 5.0858f, 8.5858f, 4.75f, 9.0f, 4.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 4.75f, 15.75f, 5.0858f, 15.75f, 5.5f)
                curveTo(15.75f, 5.9142f, 15.4142f, 6.25f, 15.0f, 6.25f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 6.25f, 8.25f, 5.9142f, 8.25f, 5.5f)
                close()
                moveTo(9.0f, 10.0f)
                curveTo(9.5523f, 10.0f, 10.0f, 9.5523f, 10.0f, 9.0f)
                curveTo(10.0f, 8.4477f, 9.5523f, 8.0f, 9.0f, 8.0f)
                curveTo(8.4477f, 8.0f, 8.0f, 8.4477f, 8.0f, 9.0f)
                curveTo(8.0f, 9.5523f, 8.4477f, 10.0f, 9.0f, 10.0f)
                close()
                moveTo(13.0f, 9.0f)
                curveTo(13.0f, 9.5523f, 12.5523f, 10.0f, 12.0f, 10.0f)
                curveTo(11.4477f, 10.0f, 11.0f, 9.5523f, 11.0f, 9.0f)
                curveTo(11.0f, 8.4477f, 11.4477f, 8.0f, 12.0f, 8.0f)
                curveTo(12.5523f, 8.0f, 13.0f, 8.4477f, 13.0f, 9.0f)
                close()
                moveTo(15.0f, 10.0f)
                curveTo(15.5523f, 10.0f, 16.0f, 9.5523f, 16.0f, 9.0f)
                curveTo(16.0f, 8.4477f, 15.5523f, 8.0f, 15.0f, 8.0f)
                curveTo(14.4477f, 8.0f, 14.0f, 8.4477f, 14.0f, 9.0f)
                curveTo(14.0f, 9.5523f, 14.4477f, 10.0f, 15.0f, 10.0f)
                close()
            }
        }
        .build()
        return _remoteController!!
    }

private var _remoteController: ImageVector? = null
