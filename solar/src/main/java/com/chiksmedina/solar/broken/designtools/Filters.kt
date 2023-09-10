package com.chiksmedina.solar.broken.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.DesignToolsGroup

val DesignToolsGroup.Filters: ImageVector
    get() {
        if (_filters != null) {
            return _filters!!
        }
        _filters = Builder(
            name = "Filters", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 20.2832f)
                curveTo(13.0615f, 21.2333f, 14.4633f, 21.811f, 16.0f, 21.811f)
                curveTo(19.3137f, 21.811f, 22.0f, 19.1247f, 22.0f, 15.811f)
                curveTo(22.0f, 13.0152f, 20.0878f, 10.6661f, 17.5f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 2.8027f)
                curveTo(9.8825f, 2.2922f, 10.9071f, 2.0f, 12.0f, 2.0f)
                curveTo(15.3137f, 2.0f, 18.0f, 4.6863f, 18.0f, 8.0f)
                curveTo(18.0f, 11.3137f, 15.3137f, 14.0f, 12.0f, 14.0f)
                curveTo(8.6863f, 14.0f, 6.0f, 11.3137f, 6.0f, 8.0f)
                curveTo(6.0f, 7.2987f, 6.1203f, 6.6256f, 6.3414f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 21.9999f)
                lineTo(8.0f, 21.2499f)
                horizontalLineTo(8.0f)
                lineTo(8.0f, 21.9999f)
                close()
                moveTo(2.0f, 15.9999f)
                lineTo(1.25f, 15.9999f)
                lineTo(1.25f, 15.9999f)
                lineTo(2.0f, 15.9999f)
                close()
                moveTo(2.1535f, 19.3755f)
                curveTo(2.3609f, 19.734f, 2.8197f, 19.8566f, 3.1782f, 19.6491f)
                curveTo(3.5368f, 19.4417f, 3.6593f, 18.9829f, 3.4519f, 18.6244f)
                lineTo(2.1535f, 19.3755f)
                close()
                moveTo(6.2499f, 20.9514f)
                curveTo(5.8594f, 20.8134f, 5.4309f, 21.0181f, 5.2929f, 21.4086f)
                curveTo(5.1548f, 21.7991f, 5.3595f, 22.2276f, 5.7501f, 22.3657f)
                lineTo(6.2499f, 20.9514f)
                close()
                moveTo(13.25f, 15.9999f)
                curveTo(13.25f, 18.8994f, 10.8995f, 21.2499f, 8.0f, 21.2499f)
                verticalLineTo(22.7499f)
                curveTo(11.7279f, 22.7499f, 14.75f, 19.7279f, 14.75f, 15.9999f)
                horizontalLineTo(13.25f)
                close()
                moveTo(2.75f, 15.9999f)
                curveTo(2.75f, 13.5547f, 4.4224f, 11.4981f, 6.6869f, 10.9153f)
                lineTo(6.3131f, 9.4626f)
                curveTo(3.4019f, 10.2119f, 1.25f, 12.8537f, 1.25f, 15.9999f)
                horizontalLineTo(2.75f)
                close()
                moveTo(12.9058f, 14.1256f)
                curveTo(13.1279f, 14.7067f, 13.25f, 15.3382f, 13.25f, 15.9999f)
                horizontalLineTo(14.75f)
                curveTo(14.75f, 15.1523f, 14.5934f, 14.3394f, 14.3069f, 13.59f)
                lineTo(12.9058f, 14.1256f)
                close()
                moveTo(3.4519f, 18.6244f)
                curveTo(3.0056f, 17.853f, 2.75f, 16.9574f, 2.75f, 15.9999f)
                lineTo(1.25f, 15.9999f)
                curveTo(1.25f, 17.2282f, 1.5787f, 18.3819f, 2.1535f, 19.3755f)
                lineTo(3.4519f, 18.6244f)
                close()
                moveTo(8.0f, 21.2499f)
                curveTo(7.385f, 21.2499f, 6.7963f, 21.1445f, 6.2499f, 20.9514f)
                lineTo(5.7501f, 22.3657f)
                curveTo(6.4548f, 22.6147f, 7.2124f, 22.7499f, 8.0f, 22.7499f)
                lineTo(8.0f, 21.2499f)
                close()
            }
        }
            .build()
        return _filters!!
    }

private var _filters: ImageVector? = null
