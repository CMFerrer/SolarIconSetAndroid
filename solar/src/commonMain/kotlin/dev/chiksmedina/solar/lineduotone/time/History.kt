package dev.chiksmedina.solar.lineduotone.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.TimeGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 8.0f)
                verticalLineTo(12.0f)
                lineTo(14.5f, 14.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.6041f, 5.6041f)
                lineTo(5.0738f, 5.0738f)
                lineTo(5.0738f, 5.0738f)
                lineTo(5.6041f, 5.6041f)
                close()
                moveTo(4.3378f, 6.8705f)
                lineTo(3.5878f, 6.8743f)
                curveTo(3.5898f, 7.2856f, 3.9227f, 7.6184f, 4.334f, 7.6205f)
                lineTo(4.3378f, 6.8705f)
                close()
                moveTo(6.8795f, 7.6333f)
                curveTo(7.2937f, 7.6354f, 7.6312f, 7.3013f, 7.6333f, 6.8871f)
                curveTo(7.6354f, 6.4729f, 7.3013f, 6.1354f, 6.8871f, 6.1333f)
                lineTo(6.8795f, 7.6333f)
                close()
                moveTo(5.075f, 4.3212f)
                curveTo(5.0729f, 3.907f, 4.7354f, 3.5729f, 4.3212f, 3.575f)
                curveTo(3.907f, 3.5771f, 3.5729f, 3.9145f, 3.575f, 4.3287f)
                lineTo(5.075f, 4.3212f)
                close()
                moveTo(3.8266f, 10.7849f)
                curveTo(3.8829f, 10.3745f, 3.5958f, 9.9963f, 3.1854f, 9.94f)
                curveTo(2.775f, 9.8838f, 2.3967f, 10.1708f, 2.3405f, 10.5812f)
                lineTo(3.8266f, 10.7849f)
                close()
                moveTo(18.8622f, 5.1378f)
                curveTo(15.042f, 1.3176f, 8.8687f, 1.2789f, 5.0738f, 5.0738f)
                lineTo(6.1345f, 6.1345f)
                curveTo(9.3336f, 2.9354f, 14.5571f, 2.9539f, 17.8016f, 6.1984f)
                lineTo(18.8622f, 5.1378f)
                close()
                moveTo(5.1378f, 18.8622f)
                curveTo(8.958f, 22.6824f, 15.1313f, 22.7211f, 18.9262f, 18.9262f)
                lineTo(17.8655f, 17.8655f)
                curveTo(14.6664f, 21.0646f, 9.4429f, 21.0461f, 6.1984f, 17.8016f)
                lineTo(5.1378f, 18.8622f)
                close()
                moveTo(18.9262f, 18.9262f)
                curveTo(22.7211f, 15.1313f, 22.6824f, 8.958f, 18.8622f, 5.1378f)
                lineTo(17.8016f, 6.1984f)
                curveTo(21.0461f, 9.4429f, 21.0646f, 14.6664f, 17.8655f, 17.8655f)
                lineTo(18.9262f, 18.9262f)
                close()
                moveTo(5.0738f, 5.0738f)
                lineTo(3.8074f, 6.3402f)
                lineTo(4.8681f, 7.4008f)
                lineTo(6.1345f, 6.1345f)
                lineTo(5.0738f, 5.0738f)
                close()
                moveTo(4.334f, 7.6205f)
                lineTo(6.8795f, 7.6333f)
                lineTo(6.8871f, 6.1333f)
                lineTo(4.3415f, 6.1205f)
                lineTo(4.334f, 7.6205f)
                close()
                moveTo(5.0877f, 6.8667f)
                lineTo(5.075f, 4.3212f)
                lineTo(3.575f, 4.3287f)
                lineTo(3.5878f, 6.8743f)
                lineTo(5.0877f, 6.8667f)
                close()
                moveTo(2.3405f, 10.5812f)
                curveTo(1.9391f, 13.5099f, 2.8739f, 16.5984f, 5.1378f, 18.8622f)
                lineTo(6.1984f, 17.8016f)
                curveTo(4.2779f, 15.881f, 3.4866f, 13.2652f, 3.8266f, 10.7849f)
                lineTo(2.3405f, 10.5812f)
                close()
            }
        }
            .build()
        return _history!!
    }

private var _history: ImageVector? = null
