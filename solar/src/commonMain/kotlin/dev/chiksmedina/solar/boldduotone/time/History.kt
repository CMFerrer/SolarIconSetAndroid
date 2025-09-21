package dev.chiksmedina.solar.boldduotone.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.TimeGroup

val TimeGroup.History: ImageVector
    get() {
        if (_history != null) {
            return _history!!
        }
        _history = Builder(
            name = "History", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.0787f, 5.0689f)
                curveTo(8.874f, 1.2789f, 15.0437f, 1.3192f, 18.8622f, 5.1378f)
                curveTo(22.6824f, 8.958f, 22.7211f, 15.1313f, 18.9262f, 18.9262f)
                curveTo(15.1312f, 22.7211f, 8.9579f, 22.6824f, 5.1377f, 18.8622f)
                curveTo(2.8739f, 16.5984f, 1.939f, 13.5099f, 2.3405f, 10.5812f)
                curveTo(2.3967f, 10.1708f, 2.775f, 9.8838f, 3.1854f, 9.94f)
                curveTo(3.5958f, 9.9963f, 3.8828f, 10.3745f, 3.8266f, 10.7849f)
                curveTo(3.4866f, 13.2652f, 4.2778f, 15.881f, 6.1984f, 17.8016f)
                curveTo(9.4429f, 21.0461f, 14.6664f, 21.0646f, 17.8655f, 17.8655f)
                curveTo(21.0646f, 14.6664f, 21.046f, 9.4429f, 17.8015f, 6.1984f)
                curveTo(14.5587f, 2.9556f, 9.3389f, 2.9354f, 6.1393f, 6.1296f)
                lineTo(6.8871f, 6.1333f)
                curveTo(7.3013f, 6.1354f, 7.6354f, 6.4729f, 7.6333f, 6.8871f)
                curveTo(7.6312f, 7.3013f, 7.2937f, 7.6354f, 6.8795f, 7.6333f)
                lineTo(4.334f, 7.6205f)
                curveTo(3.9227f, 7.6185f, 3.5898f, 7.2856f, 3.5877f, 6.8743f)
                lineTo(3.5749f, 4.3287f)
                curveTo(3.5729f, 3.9145f, 3.907f, 3.5771f, 4.3212f, 3.575f)
                curveTo(4.7354f, 3.5729f, 5.0729f, 3.907f, 5.0749f, 4.3212f)
                lineTo(5.0787f, 5.0689f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 7.25f)
                curveTo(12.4142f, 7.25f, 12.75f, 7.5858f, 12.75f, 8.0f)
                verticalLineTo(11.6893f)
                lineTo(15.0303f, 13.9697f)
                curveTo(15.3232f, 14.2626f, 15.3232f, 14.7374f, 15.0303f, 15.0303f)
                curveTo(14.7374f, 15.3232f, 14.2626f, 15.3232f, 13.9697f, 15.0303f)
                lineTo(11.5429f, 12.6036f)
                curveTo(11.3554f, 12.416f, 11.25f, 12.1617f, 11.25f, 11.8964f)
                verticalLineTo(8.0f)
                curveTo(11.25f, 7.5858f, 11.5858f, 7.25f, 12.0f, 7.25f)
                close()
            }
        }
            .build()
        return _history!!
    }

private var _history: ImageVector? = null
