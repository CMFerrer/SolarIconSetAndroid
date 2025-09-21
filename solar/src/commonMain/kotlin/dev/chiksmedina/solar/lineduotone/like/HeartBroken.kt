package dev.chiksmedina.solar.lineduotone.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.LikeGroup

val LikeGroup.HeartBroken: ImageVector
    get() {
        if (_heartBroken != null) {
            return _heartBroken!!
        }
        _heartBroken = Builder(
            name = "HeartBroken", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 9.1373f)
                curveTo(2.0f, 14.0003f, 6.0194f, 16.5917f, 8.9617f, 18.9111f)
                curveTo(10.0f, 19.7296f, 11.0f, 20.5002f, 12.0f, 20.5002f)
                curveTo(13.0f, 20.5002f, 14.0f, 19.7296f, 15.0383f, 18.9111f)
                curveTo(17.9806f, 16.5917f, 22.0f, 14.0003f, 22.0f, 9.1373f)
                curveTo(22.0f, 4.2744f, 16.4998f, 0.8257f, 12.0f, 5.5009f)
                curveTo(7.5002f, 0.8257f, 2.0f, 4.2744f, 2.0f, 9.1373f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 5.501f)
                lineTo(10.5f, 8.5003f)
                lineTo(14.0f, 11.0003f)
                lineTo(11.0f, 14.5003f)
                lineTo(13.0f, 16.5003f)
                lineTo(12.0f, 20.5003f)
            }
        }
            .build()
        return _heartBroken!!
    }

private var _heartBroken: ImageVector? = null
