package com.chiksmedina.solar.broken.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.HomeFurnitureGroup

public val HomeFurnitureGroup.RemoteControllerMinimalistic: ImageVector
    get() {
        if (_remoteControllerMinimalistic != null) {
            return _remoteControllerMinimalistic!!
        }
        _remoteControllerMinimalistic = Builder(name = "RemoteControllerMinimalistic", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(19.0f, 6.1911f, 19.0f, 4.7866f, 18.3259f, 3.7777f)
                curveTo(18.034f, 3.341f, 17.659f, 2.966f, 17.2223f, 2.6741f)
                curveTo(16.2134f, 2.0f, 14.8089f, 2.0f, 12.0f, 2.0f)
                curveTo(9.1911f, 2.0f, 7.7866f, 2.0f, 6.7777f, 2.6741f)
                curveTo(6.341f, 2.966f, 5.966f, 3.341f, 5.6741f, 3.7777f)
                curveTo(5.0852f, 4.6591f, 5.0108f, 5.8423f, 5.0014f, 8.0f)
                moveTo(18.8096f, 19.0f)
                curveTo(18.7098f, 19.4816f, 18.5577f, 19.8753f, 18.3259f, 20.2223f)
                curveTo(18.034f, 20.659f, 17.659f, 21.034f, 17.2223f, 21.3259f)
                curveTo(16.2134f, 22.0f, 14.8089f, 22.0f, 12.0f, 22.0f)
                curveTo(9.1911f, 22.0f, 7.7866f, 22.0f, 6.7777f, 21.3259f)
                curveTo(6.341f, 21.034f, 5.966f, 20.659f, 5.6741f, 20.2223f)
                curveTo(5.0f, 19.2134f, 5.0f, 17.8089f, 5.0f, 15.0f)
                verticalLineTo(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 11.0f)
                curveTo(15.0f, 12.6569f, 13.6569f, 14.0f, 12.0f, 14.0f)
                curveTo(10.3431f, 14.0f, 9.0f, 12.6569f, 9.0f, 11.0f)
                curveTo(9.0f, 9.3432f, 10.3431f, 8.0f, 12.0f, 8.0f)
                curveTo(13.6569f, 8.0f, 15.0f, 9.3432f, 15.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
        }
        .build()
        return _remoteControllerMinimalistic!!
    }

private var _remoteControllerMinimalistic: ImageVector? = null
