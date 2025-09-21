package dev.chiksmedina.solar.bold.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.LikeGroup

val LikeGroup.HeartAngle: ImageVector
    get() {
        if (_heartAngle != null) {
            return _heartAngle!!
        }
        _heartAngle = Builder(
            name = "HeartAngle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.1063f, 18.2471f)
                curveTo(5.2982f, 16.0836f, 2.0f, 13.5424f, 2.0f, 9.1373f)
                curveTo(2.0f, 4.2744f, 7.5002f, 0.8257f, 12.0f, 5.5009f)
                lineTo(14.0f, 7.4995f)
                curveTo(14.2929f, 7.7924f, 14.7678f, 7.7923f, 15.0607f, 7.4993f)
                curveTo(15.3535f, 7.2064f, 15.3534f, 6.7315f, 15.0605f, 6.4387f)
                lineTo(13.1285f, 4.5074f)
                curveTo(17.3685f, 1.4033f, 22.0f, 4.6749f, 22.0f, 9.1373f)
                curveTo(22.0f, 13.5424f, 18.7018f, 16.0835f, 15.8937f, 18.2471f)
                curveTo(15.6019f, 18.4719f, 15.3153f, 18.6927f, 15.0383f, 18.9111f)
                curveTo(14.0f, 19.7296f, 13.0f, 20.5002f, 12.0f, 20.5002f)
                curveTo(11.0f, 20.5002f, 10.0f, 19.7296f, 8.9617f, 18.9111f)
                curveTo(8.6847f, 18.6927f, 8.3981f, 18.4719f, 8.1063f, 18.2471f)
                close()
            }
        }
            .build()
        return _heartAngle!!
    }

private var _heartAngle: ImageVector? = null
