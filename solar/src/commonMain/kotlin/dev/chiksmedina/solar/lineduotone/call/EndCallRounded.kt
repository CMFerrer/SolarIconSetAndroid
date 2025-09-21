package dev.chiksmedina.solar.lineduotone.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.CallGroup

val CallGroup.EndCallRounded: ImageVector
    get() {
        if (_endCallRounded != null) {
            return _endCallRounded!!
        }
        _endCallRounded = Builder(
            name = "EndCallRounded", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0829f, 10.5032f)
                curveTo(2.2766f, 11.373f, 2.0f, 12.6127f, 2.0f, 13.8504f)
                curveTo(2.0f, 15.9102f, 3.7816f, 17.415f, 5.6072f, 16.8972f)
                lineTo(6.9469f, 16.5173f)
                curveTo(8.1559f, 16.1744f, 9.0f, 14.9826f, 9.0f, 13.6185f)
                moveTo(20.9171f, 10.5032f)
                curveTo(21.7234f, 11.373f, 22.0f, 12.6127f, 22.0f, 13.8504f)
                curveTo(22.0f, 15.9102f, 20.2184f, 17.415f, 18.3928f, 16.8972f)
                lineTo(17.0531f, 16.5173f)
                curveTo(15.8441f, 16.1744f, 15.0f, 14.9826f, 15.0f, 13.6185f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.083f, 10.5032f)
                curveTo(4.4404f, 9.0389f, 7.1933f, 7.0f, 12.0001f, 7.0f)
                curveTo(16.8069f, 7.0f, 19.5599f, 9.0389f, 20.9172f, 10.5032f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 13.6185f)
                curveTo(9.0f, 13.6185f, 9.0f, 11.9639f, 12.0f, 11.9639f)
                curveTo(15.0f, 11.9639f, 15.0f, 13.6185f, 15.0f, 13.6185f)
            }
        }
            .build()
        return _endCallRounded!!
    }

private var _endCallRounded: ImageVector? = null
